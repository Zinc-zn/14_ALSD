public class MataKuliahMain14 {
    public static void main(String[] args) {
        MataKuliah14 mk1 = new MataKuliah14();
        MataKuliah14 mk2 = new MataKuliah14("INF123", "Algoritma dan Struktur Data", 3, 6);

        System.out.println("Testing mk1 (Default Constructor):");
        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(4);
        mk1.tampilInformasi();

        System.out.println("\nTesting mk2 (Parameterized Constructor):");
        mk2.tampilInformasi();
        mk2.tambahJam(2);
        mk2.kurangiJam(3);
        mk2.tampilInformasi();
    }
}