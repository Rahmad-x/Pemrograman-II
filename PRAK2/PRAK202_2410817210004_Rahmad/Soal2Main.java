package PRAK202_2410817210004_Rahmad;

public class Soal2Main {
	    public static void main(String[] args) {
	        kopi kopi1 = new kopi();
	        kopi1.namaKopi = "Espresso";
	        kopi1.ukuran = "Medium";
	        kopi1.harga = 25000;
	        kopi1.info();
	        kopi1.setPembeli("Alice");
	        System.out.println("Pembeli Kopi: " + kopi1.getPembeli());
	        System.out.println("Pajak Kopi: Rp. " + kopi1.getPajak());
	    }

	
}
