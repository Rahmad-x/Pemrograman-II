package PRAK201_2410817210004_Rahmad;

public class Buah {
	private String nama;
	private double harga;
	private double jumlah;
	private double berat ;

	
	Buah(String nama, double harga, double jumlah,double berat){
		this.nama = nama;
		this.harga = harga;
		this.jumlah = jumlah;
		this.berat = berat;
	}
	public double diskon() {
		return (this.harga*0.02)*(this.jumlah-(this.jumlah%4));
	}
	public double totalHarga() {
		return this.harga * (this.jumlah/this.berat);
	}
	public void tampilkanBuah() {
		
	double hargaSebelumDiskon=totalHarga();
	double totalDiskon= diskon();
	
	System.out.println("\nNama Buah: "+nama);
	System.out.println("Berat: "+berat);
	System.out.printf("Jumlah Beli: %.1fkg\n",jumlah);
	System.out.printf("Harga Sebelum Diskon: %.2f\n",hargaSebelumDiskon);
	System.out.printf("Total Diskon; %.2f\n",totalDiskon);
	System.out.printf("Harga Setelah Diskon: %.2f\n",hargaSebelumDiskon-totalDiskon);

	}
}
