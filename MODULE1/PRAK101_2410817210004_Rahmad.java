package MODULE1;
import java.util.Scanner;
public class PRAK101_2410817210004_Rahmad {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Masukkan Nama lengkap : ");
	String nama = input.nextLine();
	System.out.print("Masukkan Tempat Lahir : ");
	String tempat = input.nextLine();
	System.out.print("Masukkan Tanggal Lahir : ");
	int tanggalLahir = input.nextInt();
	System.out.print("Masukkan Bulan Lahir : ");
	int bulanLahir = input.nextInt();
	System.out.print("Masukkan Tahun Lahir : ");
	int tahunLahir = input.nextInt();
	System.out.print("Masukkan Tinggi Badan : ");
	int tinggiBadan = input.nextInt();
	System.out.print("Masukkan Berat Badan : ");
	double beratBadan = input.nextDouble();
	
	String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
	String Bulan = bulan[bulanLahir -1];
	System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d\nTinggi Badan %d cm dan Berat Badan %.2f kilogram.", nama, tempat, tanggalLahir, Bulan, tahunLahir, tinggiBadan, beratBadan);
	input.close();
	}
	
}
