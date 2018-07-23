/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author franzandresflores
 */

@Getter
@Setter

public class Administrator {
       private Long id;
       private String nombre;
       private String apellido;
       private String usuario;
       private String clave;
}
