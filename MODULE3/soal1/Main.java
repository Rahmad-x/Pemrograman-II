package MODULE3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scan.nextInt();

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu(); 
            daftarDadu.add(dadu);
        }

        int total = 0;
        for (int i = 0; i < daftarDadu.size(); i++) {
            Dadu d = daftarDadu.get(i);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + d.getNilai());
            total += d.getNilai();
        }


        System.out.println("Total nilai dadu keseluruhan: " + total);

        scan.close();
    }
}
