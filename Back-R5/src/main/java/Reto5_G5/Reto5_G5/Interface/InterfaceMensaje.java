/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto5_G5.Reto5_G5.Interface;

import Reto5_G5.Reto5_G5.Model.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Juan Carlos Páez
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer> {
    
}
