package MODULE4.SOAL2;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Pilih jenis hewan yang ingin diinputkan:");
	System.out.print("1 = Kucing \n2 = Anjing \nMasukkan Pilihan: ");
//	System.out.println();
	int pilihan = scanner.nextInt();
	scanner.nextLine();
	
	if(pilihan == 1) {
		System.out.print("Nama hewan peliharaan: ");
		String nama = scanner.nextLine();
		System.out.print("Ras: ");
		String ras = scanner.nextLine();
		System.out.print("Warna bulu: ");
		String warnaBulu = scanner.nextLine();
		System.out.println("Detail Hewan Peliharaan:");
		Kucing h1 = new Kucing(nama,ras,warnaBulu);
		h1.displayDetailKucing();
	}
	else if(pilihan == 2) {
	
	System.out.println("Nama hewan peliharaan: ");			
	String nama = scanner.nextLine();
	System.out.println("Ras: ");
	String ras = scanner.nextLine();
	System.out.println("Warna bulu: ");
	String warnaBulu = scanner.nextLine();
	System.out.println("Kemampuan: ");
	String semuaInput = scanner.nextLine();	
	String[] kemampuan = semuaInput.split(", ");
	Anjing h1 = new Anjing (nama,ras,warnaBulu,kemampuan);
	System.out.println("Detail Hewan Peliharaan:");
	h1.displayDetailAnjing();
	}

	scanner.close();
	
	}
}
