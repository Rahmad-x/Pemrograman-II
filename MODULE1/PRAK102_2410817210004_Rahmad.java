package MODULE1;
import java.util.Scanner;
public class PRAK102_2410817210004_Rahmad {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Masukan Angka Awal: ");
	int angkaAwal = input.nextInt();
	
	int mulai = 0 ;
	 
	while(mulai<10) {
		if (angkaAwal%5==0) {
			System.out.print(angkaAwal/5 -1);
		}else {
			System.out.print(angkaAwal);
		}
		if (mulai < 9) {
			System.out.print(",");
		}
		angkaAwal ++;
		mulai ++;
	}
	input.close();
	}
}
