package MODULE3.soal2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Negara> daftarNegara = new LinkedList<>();
        
        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        Scanner scanner = new Scanner(System.in);

        int jumlahNegara = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                Negara negaraBaru = new Negara(nama, jenisKepemimpinan, namaPemimpin);
                daftarNegara.add(negaraBaru);
            } else {
                String tanggal = scanner.nextLine();
                int bulanInt = Integer.parseInt(scanner.nextLine());
                String tahun = scanner.nextLine();

                String bulanString = namaBulan.get(bulanInt);
                
                Negara negaraBaru = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulanString, tahun);
                daftarNegara.add(negaraBaru);
            }
        }

        for (Negara negara : daftarNegara) {
            System.out.println(negara);
        }

        scanner.close();
    }
}