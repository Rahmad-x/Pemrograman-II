package MODULE3.SOAL3;

//Mahasiswa.java

public class Mahasiswa {
 // b. Atribut dibuat private untuk enkapsulasi
 private String nama;
 private String nim;

 // c. Inisiasi nilai atribut dilakukan pada constructor
 public Mahasiswa(String nama, String nim) {
     this.nama = nama;
     this.nim = nim;
 }

 // d. Terdapat getter untuk 2 atribut
 public String getNama() {
     return this.nama;
 }

 public String getNim() {
     return this.nim;
 }
 
 // Override method toString untuk format output yang rapi
 @Override
 public String toString() {
     return "NIM: " + this.nim + ", Nama: " + this.nama;
 }
}