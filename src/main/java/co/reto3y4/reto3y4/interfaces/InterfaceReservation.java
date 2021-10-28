/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.reto3y4.reto3y4.interfaces;

import co.reto3y4.reto3y4.modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceReservation extends CrudRepository<Reservacion,Integer>{
    
}
