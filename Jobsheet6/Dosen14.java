public class Dosen14 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int umur;
  
    public Dosen14(String kode, String nama, Boolean jenisKelamin, int umur) {
      this.kode = kode;
      this.nama = nama;
      this.jenisKelamin = jenisKelamin;
      this.umur = umur;
    }
  
    public void tampil() {
      System.out.println("--------------------------");
      System.out.println("Kode: " + this.kode);
      System.out.println("Nama: " + this.nama);
      System.out.println("Jenis Kelamin: " + (this.jenisKelamin ? "Laki-laki" : "Perempuan"));
      System.out.println("Umur: " + this.umur);
    }
  }