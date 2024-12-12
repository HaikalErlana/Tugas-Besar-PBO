import java.util.ArrayList;
import java.util.Arrays;

public class DatabaseResep {
    private ArrayList<Resep> daftarResep;

    public DatabaseResep() {
        daftarResep = new ArrayList<>();
        isiDatabaseResep();
    }

    public void tambahResep(Resep resep) {
        daftarResep.add(resep);
    }

    public ArrayList<Resep> getDaftarResep() {
        return daftarResep;
    }

    private void isiDatabaseResep() {
        // Resep 1
        tambahResep(new Resep(
            "Nasi Goreng",
            new ArrayList<>(Arrays.asList("nasi", "telur", "bawang", "kecap")),
            "1. Panaskan minyak\n2. Tumis bawang hingga harum\n3. Masukkan telur, buat orak-arik\n4. Masukkan nasi\n5. Tambahkan kecap\n6. Aduk rata hingga matang",
            "Makanan Utama",
            "15 menit",
            "Mudah"
        ));

        // Resep 2
        tambahResep(new Resep(
            "Rendang Daging",
            new ArrayList<>(Arrays.asList("daging sapi", "santan", "cabai", "lengkuas", "serai", "daun jeruk", "bawang merah", "bawang putih")),
            "1. Haluskan bumbu (cabai, bawang merah, bawang putih)\n2. Tumis bumbu halus\n3. Masukkan daging\n4. Tambahkan santan\n5. Masak hingga mengental\n6. Tunggu sampai berminyak",
            "Makanan Utama",
            "4 jam",
            "Sulit"
        ));

        // Resep 3
        tambahResep(new Resep(
            "Smoothie Buah",
            new ArrayList<>(Arrays.asList("pisang", "strawberry", "yogurt", "madu", "susu")),
            "1. Potong buah-buahan\n2. Masukkan semua bahan ke blender\n3. Blender hingga halus\n4. Sajikan dingin",
            "Minuman",
            "5 menit",
            "Mudah"
        ));

        // Resep 4
        tambahResep(new Resep(
            "Sandwich Telur",
            new ArrayList<>(Arrays.asList("roti tawar", "telur", "selada", "mayonaise", "tomat", "mentimun")),
            "1. Goreng telur\n2. Olesi roti dengan mayonaise\n3. Susun selada, telur, tomat, dan mentimun\n4. Tutup dengan roti",
            "Sarapan",
            "10 menit",
            "Mudah"
        ));

        // Resep 5
        tambahResep(new Resep(
            "Brownies Kukus",
            new ArrayList<>(Arrays.asList("tepung terigu", "cokelat bubuk", "telur", "gula", "mentega", "vanili")),
            "1. Lelehkan mentega dan cokelat\n2. Kocok telur dan gula\n3. Campurkan semua bahan\n4. Kukus selama 30 menit",
            "Kue",
            "45 menit",
            "Sedang"
        ));

        // Resep 6
        tambahResep(new Resep(
            "Capcay Sayur",
            new ArrayList<>(Arrays.asList("wortel", "kembang kol", "sawi", "jagung muda", "bawang putih", "saus tiram")),
            "1. Potong semua sayuran\n2. Tumis bawang putih\n3. Masukkan sayuran\n4. Tambahkan saus tiram\n5. Masak hingga matang",
            "Sayuran",
            "20 menit",
            "Mudah"
        ));

        // Resep 7
        tambahResep(new Resep(
            "Pancake",
            new ArrayList<>(Arrays.asList("tepung terigu", "telur", "susu", "mentega", "gula", "baking powder")),
            "1. Campurkan semua bahan\n2. Aduk hingga rata\n3. Panaskan teflon\n4. Tuang adonan \n5. Masak hingga kecokelatan",
            "Sarapan",
            "25 menit",
            "Mudah"
        ));

        // Resep 8
        tambahResep(new Resep(
            "Sate Ayam",
            new ArrayList<>(Arrays.asList("ayam", "kacang tanah", "kecap manis", "bawang merah", "bawang putih", "cabai")),
            "1. Potong ayam dadu\n2. Tusuk dengan bambu\n3. Bakar sambil olesi bumbu\n4. Sajikan dengan bumbu kacang",
            "Makanan Utama",
            "40 menit",
            "Sedang"
        ));

        // Resep 9
        tambahResep(new Resep(
            "Es Buah",
            new ArrayList<>(Arrays.asList("melon", "nangka", "alpukat", "sirup", "susu kental manis", "selasih")),
            "1. Potong buah-buahan\n2. Seduh selasih\n3. Campurkan semua bahan\n4. Tambahkan es batu",
            "Minuman",
            "15 menit",
            "Mudah"
        ));

        // Resep 10
        tambahResep(new Resep(
            "Tumis Kangkung",
            new ArrayList<>(Arrays.asList("kangkung", "bawang putih", "bawang merah", "cabai", "saus tiram")),
            "1. Cuci kangkung\n2. Tumis bumbu\n3. Masukkan kangkung\n4. Tambahkan saus tiram\n5. Masak sebentar",
            "Sayuran",
            "10 menit",
            "Mudah"
        ));

        // Resep 11 (Baru)
        tambahResep(new Resep(
            "Ayam Bakar Madu",
            new ArrayList<>(Arrays.asList("ayam", "madu", "kecap manis", "bawang putih", "jahe", "mentega")),
            "1. Marinasi ayam dengan bumbu\n2. Diamkan 30 menit\n3. Bakar sambil olesi madu\n4. Sajikan dengan lalapan",
            "Makanan Utama",
            "1 jam",
            "Sedang"
        ));

        // Resep 12 (Baru)
        tambahResep(new Resep(
            "Pisang Goreng Crispy",
            new ArrayList<>(Arrays.asList("pisang", "tepung terigu", "gula", "vanili", "mentega", "meses")),
            "1. Buat adonan tepung\n2. Celupkan pisang\n3. Goreng hingga kuning\n4. Taburi meses",
            "Camilan",
            "20 menit",
            "Mudah"
        ));

        // Resep 13 (Baru)
        tambahResep(new Resep(
            "Sup Jagung",
            new ArrayList<>(Arrays.asList("jagung manis", "telur", "daun bawang", "bawang putih", "kaldu ayam", "lada")),
            "1. Rebus jagung\n2. Tumis bumbu\n3. Tuang kaldu\n4. Masukkan telur kocok\n5. Taburi daun bawang",
            "Sup",
            "30 menit",
            "Mudah"
        ));

        // Resep 14 (Baru)
        tambahResep(new Resep(
            "Martabak Telur",
            new ArrayList<>(Arrays.asList("kulit lumpia", "telur", "daging cincang", "daun bawang", "bawang merah", "bawang putih")),
            "1. Tumis daging dan bumbu\n2. Campur dengan telur\n3. Bungkus dengan kulit\n4. Goreng hingga kecokelatan",
            "Makanan Ringan",
            "35 menit",
            "Sedang"
        ));

        // Resep 15 (Baru)
        tambahResep(new Resep(
            "Jus Alpukat",
            new ArrayList<>(Arrays.asList("alpukat", "susu kental manis", "gula", "es batu")),
            "1. Keruk daging alpukat\n2. Blender semua bahan\n3. Sajikan dingin",
            "Minuman",
            "10 menit",
            "Mudah"
        ));

        // Resep 16 (Baru)
        tambahResep(new Resep(
            "Tempe Mendoan",
            new ArrayList<>(Arrays.asList("tempe", "tepung terigu", "daun bawang", "ketumbar", "bawang putih", "garam")),
            "1. Iris tempe tipis\n2. Buat adonan tepung\n3. Celupkan tempe\n4. Goreng setengah matang",
            "Camilan",
            "20 menit",
            "Mudah"
        ));

        // Resep  ```java
        // Resep 17 (Baru)
        tambahResep(new Resep(
            "Sayur Asem",
            new ArrayList<>(Arrays.asList("kacang panjang", "jagung", "melinjo", "asam jawa", "lengkuas", "daun salam")),
            "1. Rebus air\n2. Masukkan bumbu\n3. Masukkan sayuran\n4. Tambahkan asam jawa",
            "Sayur",
            "30 menit",
            "Mudah"
        ));

        // Resep 18 (Baru)
        tambahResep(new Resep(
            "Bakwan Jagung",
            new ArrayList<>(Arrays.asList("jagung manis", "tepung terigu", "telur", "daun bawang", "bawang putih", "lada")),
            "1. Serut jagung\n2. Campur semua bahan\n3. Goreng hingga keemasan",
            "Camilan",
            "25 menit",
            "Mudah"
        ));

        // Resep 19 (Baru)
        tambahResep(new Resep(
            "Bihun Goreng",
            new ArrayList<>(Arrays.asList("bihun", "telur", "sawi", "wortel", "bawang merah", "bawang putih", "kecap")),
            "1. Rendam bihun\n2. Tumis bumbu\n3. Masukkan sayuran\n4. Tambahkan bihun dan kecap",
            "Makanan Utama",
            "20 menit",
            "Mudah"
        ));

        // Resep 20 (Baru)
        tambahResep(new Resep(
            "Pudding Coklat",
            new ArrayList<>(Arrays.asList("agar-agar", "coklat bubuk", "gula", "susu cair", "vanili")),
            "1. Campurkan semua bahan\n2. Masak hingga mendidih\n3. Tuang ke cetakan\n4. Dinginkan",
            "Dessert",
            "15 menit",
            "Mudah"
        ));
    }

    public ArrayList<Resep> cariResep(ArrayList<String> bahan) {
        ArrayList<Resep> hasil = new ArrayList<>();
        for (Resep resep : daftarResep) {
            for (String b : bahan) {
                if (resep.getBahan().contains(b)) {
                    hasil.add(resep);
                    break; // Jika sudah ditemukan, tidak perlu memeriksa bahan lainnya
                }
            }
        }
        return hasil;
    }
}