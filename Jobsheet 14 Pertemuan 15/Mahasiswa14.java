public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa14(){

    }

    public Mahasiswa14(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: "+this.nim);
        System.out.println("Nama: "+this.nama);
        System.out.println("Kelas: "+this.kelas);
        System.out.println("IPK: "+this.ipk);
    }
}