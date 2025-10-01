package MODULE1;
import java.util.Scanner;
public class PRAK105_2410817210004_Rahmad {
	public static final double phi=3.14;
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Masukan jari-jari: ");
	float jari = input.nextFloat();
	System.out.print("Masukan Tinggi: ");
	float tinggi = input.nextFloat();
	
	
	double volume = phi*(jari*jari)*tinggi ;
	System.out.printf("Volume tabung dengan jari-jari %.1f dan tinggi %.1f cm adalah %.3f cm3",jari,tinggi,volume);
	input.close();
	}
}
