package br.com.onsys.faces.seguranca;

import br.com.onsys.ejb.BaseCDIBean;
import br.com.onsys.entidades.seguranca.Favoritos;
import br.com.onsys.session.basico.EmpresaSession;
import br.com.onsys.session.seguranca.FavoritosSession;
import br.com.onsys.util.ValidaAcesso;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class FavoritosFace extends BaseCDIBean<Favoritos> {

    private static final long serialVersionUID = 8L;
    @Inject
    private FavoritosSession    favoritosSession;
    @Inject
    private EmpresaSession      empresaSession;
    @Inject
    private LoginFace           loginFace;
    @Inject    
    private ValidaAcesso        validaAcesso;
    private List<Favoritos>     list;
    private Favoritos           selectedLinha;
    private Favoritos           novoRegistro = null;
//  VARIAVEIS DE CONTROLE DE PERMISSÃO      
    private Integer             idUsrValido = null; 
    
    public FavoritosFace() {
        setSelectedBean(new Favoritos());
    }    
    
    public void doValidaUsr() {
        //if (!idUsrValido.equals(usuarioFace.getLoggedUser().getId()) || idUsrValido == null) {
        //    usuarioFace.doLogOut();        
        //}        
    }      

    public void criaFavorito(String empresa) {
        setSelectedBean(new Favoritos());
        getSelectedBean().setEmpresa(empresaSession.getByCodigo(empresa));   
        getSelectedBean().setUsuario(loginFace.getUsuarioLogado());
        getSelectedBean().setPrograma(validaAcesso.getProgramaAtivo());
        if (existente(getSelectedBean()) == false){        
            favoritosSession.save(getSelectedBean());
        }
    }    

    public void deletaFavorito() {
        setSelectedBean(new Favoritos());
        novoRegistro.setEmpresa(loginFace.getUsuarioLogado().getEmpresa());   
        novoRegistro.setUsuario(loginFace.getUsuarioLogado());
        novoRegistro.setPrograma(validaAcesso.getProgramaAtivo());
        setSelectedBean(novoRegistro);
        if (existente(getSelectedBean()) == true){       
            System.out.println("deletaFavorito.id--->"+getSelectedBean().getId());
            favoritosSession.remove(getSelectedBean());        
        }
    }    
    
    public boolean validaExistente() {
//        System.out.println("validaExistente.empresa--->"+usuarioFace.getProgramaAtivo().getEmpresa());
        setNovoRegistro(new Favoritos());
        novoRegistro.setEmpresa(loginFace.getUsuarioLogado().getEmpresa());   
        novoRegistro.setUsuario(loginFace.getUsuarioLogado());
        novoRegistro.setPrograma(validaAcesso.getProgramaAtivo());
        return existente(novoRegistro);
    }
    
    public boolean existente(Favoritos novoRegistro) {            
        try {
            System.out.println("FavoritosFace.existene");
            
            System.out.println("idEmpresa--->"+novoRegistro.getEmpresa().getId());
            System.out.println("idPrograma-->"+novoRegistro.getPrograma().getCodigo());
            System.out.println("idUsuario--->"+novoRegistro.getUsuario().getId());

            Favoritos existente = favoritosSession.getByEmpProgUsr(novoRegistro.getEmpresa().getId(),
                                                                   novoRegistro.getPrograma().getId(),
                                                                   novoRegistro.getUsuario().getId());             
            setSelectedBean(existente);            
            return true;
        } catch (Exception e) {
            return false;            
        }
    }    

    public Integer getIdUsuarioValido() {
        return idUsrValido;
    }

    public void setIdUsuarioValido(Integer idUsuarioValido) {
        this.idUsrValido = idUsuarioValido;
    }

    public Favoritos getNovoRegistro() {
        return novoRegistro;
    }

    public void setNovoRegistro(Favoritos novoRegistro) {
        this.novoRegistro = novoRegistro;
    }
    
}