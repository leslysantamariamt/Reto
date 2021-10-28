/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.reto3y4.reto3y4.interfaces;

import co.reto3y4.reto3y4.modelo.Categoria;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author USUARIO
 */

public interface InterfaceCategoria extends CrudRepository<Categoria,Integer>{
    
}
