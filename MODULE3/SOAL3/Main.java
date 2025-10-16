package MODULE3.SOAL3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
     ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);
     
     while (true) {
         tampilkanMenu();
         System.out.print("Pilihan: ");
         int pilihan = Integer.parseInt(scanner.nextLine());

         switch (pilihan) {
             case 1:
                 tambahMahasiswa(scanner, daftarMahasiswa);
                 break;
             case 2:
                 hapusMahasiswa(scanner, daftarMahasiswa);
                 break;
             case 3:
                 cariMahasiswa(scanner, daftarMahasiswa);
                 break;
             case 4:
                 tampilkanDaftarMahasiswa(daftarMahasiswa);
                 break;
             case 0:
                 System.out.println("Terima kasih!");
                 scanner.close();
                 return; 
             default:
                 System.out.println("Pilihan tidak valid. Silakan coba lagi.");
         }
         System.out.println(); 
     }
 }

 public static void tampilkanMenu() {
     System.out.println("Menu:");
     System.out.println("1. Tambah Mahasiswa");
     System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
     System.out.println("3. Cari Mahasiswa berdasarkan NIM");
     System.out.println("4. Tampilkan Daftar Mahasiswa");
     System.out.println("0. Keluar");
 }

 public static void tambahMahasiswa(Scanner scanner, ArrayList<Mahasiswa> daftar) {
     System.out.print("Masukkan Nama Mahasiswa: ");
     String nama = scanner.nextLine();
     System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
     String nim = scanner.nextLine();

     for (Mahasiswa mhs : daftar) {
         if (mhs.getNim().equals(nim)) {
             System.out.println("NIM sudah terdaftar. Mahasiswa tidak ditambahkan.");
             return;
         }
     }

     Mahasiswa mhsBaru = new Mahasiswa(nama, nim);
     daftar.add(mhsBaru);
     System.out.println("Mahasiswa " + nama + " ditambahkan.");
 }

 public static void hapusMahasiswa(Scanner scanner, ArrayList<Mahasiswa> daftar) {
     System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
     String nim = scanner.nextLine();

     boolean isRemoved = daftar.removeIf(mhs -> mhs.getNim().equals(nim));

     if (isRemoved) {
         System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
     } else {
         System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
     }
 }

 public static void cariMahasiswa(Scanner scanner, ArrayList<Mahasiswa> daftar) {
     System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
     String nim = scanner.nextLine();

     for (Mahasiswa mhs : daftar) {
         if (mhs.getNim().equals(nim)) {
             System.out.println("Data Mahasiswa ditemukan:");
             System.out.println(mhs); 
             return;
         }
     }

     System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
 }

 public static void tampilkanDaftarMahasiswa(ArrayList<Mahasiswa> daftar) {
     if (daftar.isEmpty()) {
         System.out.println("Daftar mahasiswa masih kosong.");
     } else {
         System.out.println("Daftar Mahasiswa:");
         for (Mahasiswa mhs : daftar) {
             System.out.println(mhs); 
         }
     }
 }
}