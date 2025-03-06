public class MataKuliah14 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    public MataKuliah14(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    public void cetakInfo() {
        System.out.println("KODE          : " + this.kode);
        System.out.println("NAMA          : " + this.nama);
        System.out.println("SKS           : " + this.sks);
        System.out.println("JUMLAH JAM    : " + this.jumlahJam);
        System.out.println("--------------------------------------------------");
    }
}