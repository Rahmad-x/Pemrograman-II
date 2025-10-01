package MODULE1;

import java.util.Scanner;

public class PRAK103_2410817210004_Rahmad {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Banyak deret dan Bilangan Awal: ");
		int deret = input.nextInt();
		int angkaAwal = input.nextInt();
		
		int mulai = 0 ;
		 
		do {
		    if(angkaAwal%2!=0) {
		    	System.out.print(angkaAwal);
		    }else {
		    	System.out.print(" ");
		    }
		    if (mulai%2!=0 && mulai<deret*2-1) {
				System.out.print(",");
			}
		    mulai ++;
		    angkaAwal++;
		} while (mulai<deret*2);
		input.close();
		}
}
