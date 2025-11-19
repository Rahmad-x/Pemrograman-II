package PRAKTIKUM6.controller;

import java.net.URL;
import java.util.ResourceBundle;
import PRAKTIKUM6.kelas.Mahasiswa; // Import dari package kelas
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable {

    @FXML
    private TableView<Mahasiswa> tableMahasiswa;

    @FXML
    private TableColumn<Mahasiswa, String> colNim;

    @FXML
    private TableColumn<Mahasiswa, String> colNama;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));

        // Data Hardcode
        ObservableList<Mahasiswa> listData = FXCollections.observableArrayList(
            new Mahasiswa(1, "John", "123"),
            new Mahasiswa(2, "Jane", "123"),
            new Mahasiswa(3, "Jono", "124123"),
            new Mahasiswa(4, "Agus", "1241234"),
            new Mahasiswa(5, "Budi", "1241235"),
            new Mahasiswa(6, "Siti", "1241236"),
            new Mahasiswa(7, "Rahmad", "1241237"),
            new Mahasiswa(8, "Putri", "1241238"),
            new Mahasiswa(9, "Eko", "1241239"),
            new Mahasiswa(10, "Dian", "1241240")
        );

        tableMahasiswa.setItems(listData);
    }
}