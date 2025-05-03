public class Surat14 {
    private String idSurat;
    private String namaMahasiswa;
    private String kelas;
    private char jenisIzin;
    private int durasi;
    
    public Surat14(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
    
    public String getIdSurat() {
        return idSurat;
    }
    
    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    public char getJenisIzin() {
        return jenisIzin;
    }
    
    public int getDurasi() {
        return durasi;
    }
    
    public void displaySurat() {
        System.out.println("ID Surat: " + idSurat);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Kelas: " + kelas);
        System.out.println("Jenis Izin: " + (jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
        System.out.println("Durasi: " + durasi + " hari");
        System.out.println();
    }
}