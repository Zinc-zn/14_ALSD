import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            
            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = scanner.nextDouble();
                
                switch (pilihan) {
                    case 1:
                        hitungVolume(sisi);
                        break;
                    case 2:
                        hitungLuasPermukaan(sisi);
                        break;
                    case 3:
                        hitungKeliling(sisi);
                        break;
                }
            } else if (pilihan == 4) {
                lanjut = false;
                System.out.println("Program selesai!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }

    public static void tampilkanMenu() {
        System.out.println("\n=== KALKULATOR KUBUS ===");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    public static void hitungVolume(double sisi) {
        double volume = Math.pow(sisi, 3);
        System.out.printf("Volume kubus dengan sisi %.2f adalah: %.2f\n", sisi, volume);
    }

    public static void hitungLuasPermukaan(double sisi) {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        System.out.printf("Luas permukaan kubus dengan sisi %.2f adalah: %.2f\n", sisi, luasPermukaan);
    }

    public static void hitungKeliling(double sisi) {
        double keliling = 12 * sisi;
        System.out.printf("Keliling kubus dengan sisi %.2f adalah: %.2f\n", sisi, keliling);
    }
}