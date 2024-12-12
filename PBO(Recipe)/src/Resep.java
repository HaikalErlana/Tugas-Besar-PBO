import java.util.ArrayList;

public class Resep {
    private String nama;
    private ArrayList<String> bahan;
    private String langkah;
    private String kategori;
    private String waktu;
    private String tingkatKesulitan;

    public Resep(String nama, ArrayList<String> bahan, String langkah, String kategori, String waktu, String tingkatKesulitan) {
        this.nama = nama;
        this.bahan = bahan;
        this.langkah = langkah;
        this.kategori = kategori;
        this.waktu = waktu;
        this.tingkatKesulitan = tingkatKesulitan;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<String> getBahan() {
        return bahan;
    }

    public String getLangkah() {
        return langkah;
    }

    public String getKategori() {
        return kategori;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getTingkatKesulitan() {
        return tingkatKesulitan;
    }

    @Override
    public String toString() {
        return "Nama Resep: " + nama + "\nBahan: " + bahan + "\nLangkah: " + langkah + "\nKategori: " + kategori + "\nWaktu: " + waktu + "\nTingkat Kesulitan: " + tingkatKesulitan;
    }
}