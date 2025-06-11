public class MataKuliah14 {
     String kodeMK;
     String nama;
     int sks;
     int jumlahJam;

    public MataKuliah14() {
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah14(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Informasi Mata Kuliah:");
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sksBaru);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam telah ditambah. Jumlah jam baru: " + this.jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam - jam >= 0) {
            this.jumlahJam -= jam;
            System.out.println("Pengurangan berhasil. Jumlah jam baru: " + this.jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        }
    }
}

