public class DosenMain14 {
    public static void main(String[] args) {
        Dosen14 dosen1 = new Dosen14();
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Pemrograman");
        
        Dosen14 dosen2 = new Dosen14("D002", "Ahmad Dimas", true, 2015, "Dasar Pemprograman");
        
        System.out.println("=== Dosen 1 ===");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2024) + " tahun");
        
        System.out.println("\n=== Dosen 2 ===");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2024) + " tahun");
        
        System.out.println("\n=== Setelah Perubahan ===");
        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Basis Data");
        dosen2.tampilInformasi();
    }
}