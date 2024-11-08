package br.com.onsys.bean;
// UTILIZADO NO CALCULO DE FRETE DA TOTALEXPRESS
import java.io.Serializable;

public class CalcularFreteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tipoServico;
	private String cepDestino;
	private String peso;
	private String valorDeclarado;
	private String tipoEntrega;
    private String altura;
    private String largura;
    private String profundidade;
    private boolean servicoCOD;
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public String getCepDestino() {
		return cepDestino;
	}
	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getValorDeclarado() {
		return valorDeclarado;
	}
	public void setValorDeclarado(String valorDeclarado) {
		this.valorDeclarado = valorDeclarado;
	}
	public String getTipoEntrega() {
		return tipoEntrega;
	}
	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getLargura() {
		return largura;
	}
	public void setLargura(String largura) {
		this.largura = largura;
	}
	public String getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(String profundidade) {
		this.profundidade = profundidade;
	}
	public boolean isServicoCOD() {
		return servicoCOD;
	}
	public void setServicoCOD(boolean servicoCOD) {
		this.servicoCOD = servicoCOD;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altura == null) ? 0 : altura.hashCode());
		result = prime * result + ((cepDestino == null) ? 0 : cepDestino.hashCode());
		result = prime * result + ((largura == null) ? 0 : largura.hashCode());
		result = prime * result + ((peso == null) ? 0 : peso.hashCode());
		result = prime * result + ((profundidade == null) ? 0 : profundidade.hashCode());
		result = prime * result + (servicoCOD ? 1231 : 1237);
		result = prime * result + ((tipoEntrega == null) ? 0 : tipoEntrega.hashCode());
		result = prime * result + ((tipoServico == null) ? 0 : tipoServico.hashCode());
		result = prime * result + ((valorDeclarado == null) ? 0 : valorDeclarado.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalcularFreteBean other = (CalcularFreteBean) obj;
		if (altura == null) {
			if (other.altura != null)
				return false;
		} else if (!altura.equals(other.altura))
			return false;
		if (cepDestino == null) {
			if (other.cepDestino != null)
				return false;
		} else if (!cepDestino.equals(other.cepDestino))
			return false;
		if (largura == null) {
			if (other.largura != null)
				return false;
		} else if (!largura.equals(other.largura))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		if (profundidade == null) {
			if (other.profundidade != null)
				return false;
		} else if (!profundidade.equals(other.profundidade))
			return false;
		if (servicoCOD != other.servicoCOD)
			return false;
		if (tipoEntrega == null) {
			if (other.tipoEntrega != null)
				return false;
		} else if (!tipoEntrega.equals(other.tipoEntrega))
			return false;
		if (tipoServico == null) {
			if (other.tipoServico != null)
				return false;
		} else if (!tipoServico.equals(other.tipoServico))
			return false;
		if (valorDeclarado == null) {
			if (other.valorDeclarado != null)
				return false;
		} else if (!valorDeclarado.equals(other.valorDeclarado))
			return false;
		return true;
	}
    

}
