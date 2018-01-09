/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author npk
 */
public class MainBankScene extends Application {
    private ObservableList<RegisterUsers> costomersData = FXCollections.observableArrayList();
    
    public ObservableList<RegisterUsers> getCostomersesData(){
        return costomersData;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        MainBankScenePane root = new MainBankScenePane();
        RegisterUsers reg = new RegisterUsers();
        
        
        root.setCenter(reg);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Банк Наивность-НН");
        
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
