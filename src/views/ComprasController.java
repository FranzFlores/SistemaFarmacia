/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import controller.utilities.Validator;

/**
 *
 * @author franzandresflores
 */
public class ComprasController implements Initializable{

    @Override
    public void initialize(URL location, ResourceBundle resources) { }
    
    @FXML
    private TextField rucField,proveedorField,numField,codField,detalleField,cantField,
            costoField,descField,pvpField,pmField;
    
    Validator validar = new Validator();
    
    public void validateRuc() {
        validar.validarCedula(rucField);
    }
    
    public void validateProveedor(){
        validar.validarCampos(proveedorField);
    }
    
    public void validateNum(){
        validar.validarCampos(numField);
    }
    
    public void validateCode(){
        validar.validarCamposNumericos(codField);
    }
    
    public void validateDetalle(){
        validar.validarCampos(detalleField);
    }
    
    public void validateCant(){
        validar.validarCamposNumericos(cantField);
    }
    
    public void validateCosto(){
        validar.validarCamposNumericos(costoField);
    }
    
    public void validateDesc(){
        validar.validarCamposNumericos(descField);
    }
    
    public void validatepvp(){
        validar.validarCamposNumericos(pvpField);
    }
    
    public void validatePm(){
        validar.validarCampos(pmField);
    }
    
    
}
