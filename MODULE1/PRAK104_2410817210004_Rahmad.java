package MODULE1;
import java.util.Scanner;
public class PRAK104_2410817210004_Rahmad {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int skorAbu = 0;
        int skorBagas = 0;
        System.out.print("Masukan Pilihan Tangan Abu : ");
        String[] pilihanAbu = input.nextLine().split(" ");
        System.out.print("Masukan Pilihan Tangan Bagas : ");
        String[] pilihanBagas = input.nextLine().split(" ");

        for (int i = 0; i < 3; i++) {
            String abu = pilihanAbu[i];
            String bagas = pilihanBagas[i];

            if ((abu.equals("B") && bagas.equals("G")) ||
                (abu.equals("G") && bagas.equals("K")) ||
                (abu.equals("K") && bagas.equals("B"))) {
                skorAbu++;
            } else if (!abu.equals(bagas)) {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        input.close();
	}
}
