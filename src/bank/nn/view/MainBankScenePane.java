/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.nn.view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author npk
 */
public class MainBankScenePane extends BorderPane {
    
    public MainBankScenePane() {
        
    }
    
    @FXML
    public BorderPane setBorderPane(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainBankScenePane.fxml"));
        fxmlLoader.setRoot(this);
        try {
        BorderPane load = fxmlLoader.load();
        return load;
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    @FXML
    private void initialize() {
    }
}
