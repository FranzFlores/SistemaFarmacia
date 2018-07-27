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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lili
 */
public class CrearProductoController {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField codigoField;
    @FXML
    private TextField nombreField;
    @FXML
    private TextField cantidadField;
    @FXML
    private ComboBox categoria;
    @FXML
    private ComboBox marca;
    @FXML
    private TextField proveedorField;
    

    
    public void initialize() {
        if (codigoField.getText().length() == 0 || codigoField.getText() == null) {
            
        }
    }    
    
}
