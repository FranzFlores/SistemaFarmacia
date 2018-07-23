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
import javafx.scene.control.*;
import controller.utilities.Validator;

/**
 * FXML Controller class
 *
 * @author franzandresflores
 */
public class LoginController implements Initializable {
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {}    
    
    @FXML
    private Button exitBtn;
    @FXML
    private TextField userField;
    
    private Validator  validate = new Validator();
    
    public void exitSystem(){ //Al presionar sale del sistema
        System.exit(0);
    }
    
    public void validateUser(){
        validate.validarCampos(userField);
        
        
    }
    
}
