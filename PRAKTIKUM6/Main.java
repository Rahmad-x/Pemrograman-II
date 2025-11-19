package PRAKTIKUM6;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Membuat List untuk menampung data mahasiswa
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        // 2. Menambahkan 10 Data Hardcode sesuai instruksi
        daftarMahasiswa.add(new Mahasiswa(1, "Hanafi", "241"));
        daftarMahasiswa.add(new Mahasiswa(2, "Atsir", "231"));
        daftarMahasiswa.add(new Mahasiswa(3, "Rahmad", "241081"));
        daftarMahasiswa.add(new Mahasiswa(4, "Fais", "E241"));
        daftarMahasiswa.add(new Mahasiswa(5, "Hamka", "2221"));
        daftarMahasiswa.add(new Mahasiswa(6, "Mufli", "2241"));
        daftarMahasiswa.add(new Mahasiswa(7, "Aslan", "24109"));
        daftarMahasiswa.add(new Mahasiswa(8, "Gufran", "221072"));
        daftarMahasiswa.add(new Mahasiswa(9, "Muhyar", "E24193"));
        daftarMahasiswa.add(new Mahasiswa(10, "Alwi", "E251"));

        // 3. Membuat Frame (Jendela Aplikasi)
        JFrame frame = new JFrame("Data Mahasiswa");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Agar posisi window di tengah layar

        // 4. Menentukan Nama Kolom Tabel (Hanya NIM dan Nama sesuai contoh output)
        String[] columnNames = {"NIM", "Nama"};

        // 5. Membuat Model Tabel
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // 6. Memasukkan data dari List Mahasiswa ke dalam Model Tabel
        // Menggunakan Getter untuk mengambil datanya
        for (Mahasiswa mhs : daftarMahasiswa) {
            Object[] rowData = {mhs.getNim(), mhs.getNama()};
            model.addRow(rowData);
        }

        // 7. Membuat JTable dengan model yang sudah dibuat
        JTable table = new JTable(model);

        // 8. Menambahkan ScrollPane (Agar header tabel terlihat & bisa discroll)
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // 9. Menampilkan Frame
        frame.setVisible(true);
    }
} 