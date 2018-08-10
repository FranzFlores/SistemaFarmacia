/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.utilities;

import java.awt.Toolkit;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 *
 * @author franzandresflores
 */
public class Validator {

    public boolean validateCedula(TextField cedula) {
        String ced = cedula.getText();
        boolean cedulaCorrecta = false;
        try {
            if (ced.length() == 10) {
                int tercerDigito = Integer.parseInt(ced.substring(2, 3));
                if (tercerDigito < 6) {

                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(ced.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (ced.length() - 1); i++) {
                        digito = Integer.parseInt(ced.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Campo no válido");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, ingrese de nuevo la cédula: \n");
            alert.showAndWait();
            return false;
        }
        return cedulaCorrecta;
    }

    public boolean validateNumField(TextField campo) {
        if (((campo.getText().charAt(0) < '0') || campo.getText().charAt(0) > '9')) {
            Toolkit.getDefaultToolkit().beep();
            return false;
        } else {
            validateStringField(campo);
            return true;
        }
    }

    public boolean validateStringField(TextField campo) {
        String mensajeError = "";

        if (campo.getText() == null || campo.getText().trim().length() == 0) {
            mensajeError += "¡Campo requerido!\n";
        }

        if (mensajeError.length() == 0) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Campos no válidos");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, revise los siguiente campos: \n" + mensajeError);
            alert.showAndWait();
            return false;
        }
    }

}
