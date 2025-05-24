public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    String jenisLayanan;
    
    public Mahasiswa14(String nim, String nama, String kelas, double ipk, String jenisLayanan) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
        this.jenisLayanan = jenisLayanan;
    }
    
    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
        System.out.println("Jenis Layanan: " + jenisLayanan);
    }
    
    public String toString() {
        return nim + "\t\t" + nama + "\t\t\t" + kelas + "\t" + ipk + "\t" + jenisLayanan;
    }
}