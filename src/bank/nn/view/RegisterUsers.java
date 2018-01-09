/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.nn.view;

import java.io.IOException;
import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author npk
 */
public class RegisterUsers extends AnchorPane {
    
    @FXML
    private final StringProperty firstName;
    @FXML
    private final StringProperty lastName;
    @FXML
    private final StringProperty street;
    @FXML
    private final IntegerProperty postalCode;
    @FXML
    private final StringProperty city;
    @FXML
    private final ObjectProperty<LocalDate> birthday;

//    @FXML
//    private ListView<MainBankScene> listView;
    
    public RegisterUsers() {
        this.firstName = null;
            this.lastName = null;
            this.street = null;
            this.postalCode = null;
            this.city = null;
            this.birthday = null;
    }
    
    @FXML
    public AnchorPane setAnchorPane(){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RegisterUsers.fxml"));
        try {
            AnchorPane anchorPane = fxmlLoader.load();
            return anchorPane;
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    @FXML
    private void initialize() {
    }
    
}
