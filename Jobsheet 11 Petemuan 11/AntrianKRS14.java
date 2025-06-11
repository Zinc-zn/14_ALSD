public class AntrianKRS14 {
    MahasiswaKRS14[] antrian;
    int kapasitasAntrian;
    int jumlahAntrian;
    int jumlahProses;
    static final int MAX_DPA = 30;

    public AntrianKRS14() {
        this.kapasitasAntrian = 10;
        this.antrian = new MahasiswaKRS14[kapasitasAntrian];
        this.jumlahAntrian = 0;
        this.jumlahProses = 0;
    }

    public boolean cekAntrianKosong() {
        return jumlahAntrian == 0;
    }

    public boolean cekAntrianPenuh() {
        return jumlahAntrian == kapasitasAntrian;
    }

    public void mengosongkanAntrian() {
        for (int i = 0; i < kapasitasAntrian; i++) {
            antrian[i] = null;
        }
        jumlahAntrian = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public boolean tambahAntrian(MahasiswaKRS14 mahasiswa) {
        if (cekAntrianPenuh()) {
            System.out.println("Antrian penuh! Tidak bisa menambahkan mahasiswa.");
            return false;
        } else {
            antrian[jumlahAntrian] = mahasiswa;
            jumlahAntrian++;
            System.out.println("Mahasiswa " + mahasiswa.getNama() + " (NIM: " + mahasiswa.getNim() + ") berhasil ditambahkan ke antrian.");
            return true;
        }
    }

    public void panggilAntrian() {
        if (cekAntrianKosong()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dapat dipanggil.");
            return;
        }

        System.out.println("\n=== PANGGILAN PROSES KRS ===");
        int jumlahPanggil = 2;
        if (jumlahAntrian < 2) {
            jumlahPanggil = jumlahAntrian;
        }
        
        for (int i = 0; i < jumlahPanggil; i++) {
            System.out.println("Memanggil: " + antrian[i].getNama() + " (NIM: " + antrian[i].getNim() + ")");
            jumlahProses++;
        }
        
        for (int i = 0; i < jumlahAntrian - jumlahPanggil; i++) {
            antrian[i] = antrian[i + jumlahPanggil];
        }
        
        for (int i = jumlahAntrian - jumlahPanggil; i < jumlahAntrian; i++) {
            antrian[i] = null;
        }
        
        jumlahAntrian -= jumlahPanggil;
        System.out.println(jumlahPanggil + " mahasiswa telah dipanggil untuk proses KRS.");
    }

    public void tampilkanSemuaAntrian() {
        if (cekAntrianKosong()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("\n=== SEMUA ANTRIAN ===");
        for (int i = 0; i < jumlahAntrian; i++) {
            System.out.println((i+1) + ". " + antrian[i].getNama() + " (NIM: " + antrian[i].getNim() + ")");
        }
    }

    public void tampilkanAntrianTerdepan() {
        if (cekAntrianKosong()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("\n=== ANTRIAN TERDEPAN ===");
        int jumlahTampil = 2;
        if (jumlahAntrian < 2) {
            jumlahTampil = jumlahAntrian;
        }
        
        for (int i = 0; i < jumlahTampil; i++) {
            System.out.println((i+1) + ". " + antrian[i].getNama() + " (NIM: " + antrian[i].getNim() + ")");
        }
    }

    public void tampilkanAntrianTerakhir() {
        if (cekAntrianKosong()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("\n=== ANTRIAN TERAKHIR ===");
        System.out.println(jumlahAntrian + ". " + antrian[jumlahAntrian-1].getNama() + 
                          " (NIM: " + antrian[jumlahAntrian-1].getNim() + ")");
    }

    public void cetakJumlahAntrian() {
        System.out.println("\nJumlah antrian saat ini: " + jumlahAntrian);
    }

    public void cetakJumlahProses() {
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + jumlahProses);
    }

    public void cetakJumlahBelumProses() {
        int belumProses = (MAX_DPA * 30) - jumlahProses;
        System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + belumProses);
    }
}