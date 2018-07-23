/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import controller.utilities.Validator;

public class FacturaController implements Initializable {
 
    @FXML
    private TextField cedulaField,clienteField,direccionField,telefonoField;    
    
    @FXML
    private TextField codigoField,descripcionField,cantField,stockField;   
 
    private Stage ventana;
    
    Validator validar = new Validator();
    
    public void validateCedula(){
        validar.validarCedula(cedulaField);
    }
    
    public void validateCliente(){
        validar.validarCampos(clienteField);
    }
    
    public void validateDireccion(){
        validar.validarCampos(direccionField);
    }
    
    public void validateTelefono(){
        validar.validarCamposNumericos(telefonoField);
    }
    
    public void validateCodigo(){
        validar.validarCamposNumericos(codigoField);
    }
    
    public void validateDescripcion(){
        validar.validarCampos(descripcionField);
    }
    
    public void validateCant(){
        validar.validarCamposNumericos(cantField);
    }
    
    public void validateStock(){
        validar.validarCamposNumericos(stockField);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}
    
    public void setVentana(Stage ventana){
        this.ventana = ventana;
    }
    
    @FXML
    private void exit() {
        ventana.close();
    }
    
    
}
