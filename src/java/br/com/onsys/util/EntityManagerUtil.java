/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Administrador2
 */
public class EntityManagerUtil {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("NeoSIGEPU");
    
    public static EntityManager em() {
        return emf.createEntityManager();
    }
    
}