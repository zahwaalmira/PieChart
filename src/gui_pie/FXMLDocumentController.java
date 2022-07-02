/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package gui_pie;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;


/**
 *
 * @author zahwa
 */
public class FXMLDocumentController implements Initializable {
    ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
    
    @FXML
    private PieChart pcMobil;
    
    @FXML
    private void handleTambahAction(ActionEvent event) {
        data.add(new PieChart.Data("HatchBack", 40));
        System.out.println("TambahButton is clicked");
    }
    
    @FXML
    private void handleKurangAction(ActionEvent event) {
        data.remove(3);
        System.out.println("TambahButton is clicked");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        data.add(new PieChart.Data("Sedan", 50));
        data.add(new PieChart.Data("MPV", 30));
        data.add(new PieChart.Data("SUV", 20));
        
        pcMobil.setData(data);
    }    
    
}
