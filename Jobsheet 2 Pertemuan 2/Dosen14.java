public class Dosen14 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    
    public Dosen14() {
        this.idDosen = "";
        this.nama = "";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "";
    }
    
    public Dosen14(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    public void tampilInformasi() {
        System.out.println("Informasi Dosen:");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }
    
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }
    
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
}

