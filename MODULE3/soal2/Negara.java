package MODULE3.soal2;
public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private String tanggalKemerdekaan;
    private String bulanKemerdekaan;
    private String tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, String tanggal, String bulan, String tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggal;
        this.bulanKemerdekaan = bulan;
        this.tahunKemerdekaan = tahun;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = null;
        this.bulanKemerdekaan = null;
        this.tahunKemerdekaan = null;
    }
    @Override
    public String toString() {
        String jenisPemimpinFormatted;
        if (this.jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            jenisPemimpinFormatted = "Raja";
        } else {
            jenisPemimpinFormatted = this.jenisKepemimpinan;
        }

        String output = "\nNegara " + this.nama + " mempunyai " + jenisPemimpinFormatted + " bernama " + this.namaPemimpin ;
        if (this.tanggalKemerdekaan != null) {
            output += "\nDeklarasi Kemerdekaan pada Tanggal " + this.tanggalKemerdekaan + " " + this.bulanKemerdekaan + " " + this.tahunKemerdekaan;
        }

        return output;
    }
}