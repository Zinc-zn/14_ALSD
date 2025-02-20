import java.util.Scanner;

public class tugas3 {
    private static final Scanner scanner = new Scanner(System.in);
    private static String[] mataKuliah;
    private static int[] sks;
    private static int[] semester;
    private static String[] hari;
    private static int jumlahMataKuliah;
    private static boolean isDataTersedia = false;

    public static void main(String[] args) {
        System.out.println("=== Selamat Datang di Sistem Jadwal Kuliah ===");
        System.out.print("\nMasukkan jumlah mata kuliah yang akan diinput: ");
        jumlahMataKuliah = scanner.nextInt();
        scanner.nextLine(); 

        mataKuliah = new String[jumlahMataKuliah];
        sks = new int[jumlahMataKuliah];
        semester = new int[jumlahMataKuliah];
        hari = new String[jumlahMataKuliah];

        while (true) {
            tampilkanMenu();
            System.out.print("\nPilih menu (1-6): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    inputJadwal();
                    break;
                case 2:
                    tampilkanSeluruhJadwal();
                    break;
                case 3:
                    cariJadwalBerdasarkanHari();
                    break;
                case 4:
                    cariJadwalBerdasarkanSemester();
                    break;
                case 5:
                    cariJadwalMataKuliah();
                    break;
                case 6:
                    System.out.println("\nTerima kasih telah menggunakan sistem jadwal kuliah!");
                    System.exit(0);
                default:
                    System.out.println("\nMenu tidak valid! Silakan pilih menu 1-6.");
            }
            
            System.out.println("\nTekan Enter untuk melanjutkan...");
            scanner.nextLine();
        }
    }

    private static void tampilkanMenu() {
        System.out.println("\n=== Sistem Jadwal Kuliah ===");
        System.out.println("1. Input Jadwal Kuliah");
        System.out.println("2. Tampilkan Semua Jadwal");
        System.out.println("3. Cari Jadwal Berdasarkan Hari");
        System.out.println("4. Cari Jadwal Berdasarkan Semester");
        System.out.println("5. Cari Jadwal Mata Kuliah");
        System.out.println("6. Keluar");
    }

    private static void inputJadwal() {
        System.out.println("\n=== Input Jadwal Kuliah ===");
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.println("-------------------");
            
            System.out.print("Nama mata kuliah: ");
            mataKuliah[i] = scanner.nextLine();
            
            do {
                System.out.print("Jumlah SKS (1-6): ");
                sks[i] = scanner.nextInt();
            } while (sks[i] < 1 || sks[i] > 6);
            
            do {
                System.out.print("Semester (1-8): ");
                semester[i] = scanner.nextInt();
            } while (semester[i] < 1 || semester[i] > 8);
            
            scanner.nextLine();
            
            do {
                System.out.print("Hari (Senin-Jumat): ");
                hari[i] = scanner.nextLine().toLowerCase();
            } while (!isHariValid(hari[i]));
        }
        
        isDataTersedia = true;
        System.out.println("\nJadwal berhasil diinput!");
    }

    private static void tampilkanSeluruhJadwal() {
        if (!isDataTersedia) {
            System.out.println("\nBelum ada data jadwal. Silakan input jadwal terlebih dahulu.");
            return;
        }

        System.out.println("\n=== Daftar Seluruh Jadwal Kuliah ===");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            tampilkanDetailJadwal(i);
        }
    }

    private static void cariJadwalBerdasarkanHari() {
        if (!isDataTersedia) {
            System.out.println("\nBelum ada data jadwal. Silakan input jadwal terlebih dahulu.");
            return;
        }

        System.out.print("\nMasukkan hari (Senin-Jumat): ");
        String hariCari = scanner.nextLine().toLowerCase();

        if (!isHariValid(hariCari)) {
            System.out.println("Hari tidak valid! Masukkan hari Senin-Jumat.");
            return;
        }

        System.out.println("\n=== Jadwal Kuliah Hari " + capitalizeFirstLetter(hariCari) + " ===");
        boolean ditemukan = false;
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (hari[i].equalsIgnoreCase(hariCari)) {
                tampilkanDetailJadwal(i);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + capitalizeFirstLetter(hariCari));
        }
    }

    private static void cariJadwalBerdasarkanSemester() {
        if (!isDataTersedia) {
            System.out.println("\nBelum ada data jadwal. Silakan input jadwal terlebih dahulu.");
            return;
        }

        System.out.print("\nMasukkan semester (1-8): ");
        int semesterCari = scanner.nextInt();

        if (semesterCari < 1 || semesterCari > 8) {
            System.out.println("Semester tidak valid! Masukkan semester 1-8.");
            return;
        }

        System.out.println("\n=== Jadwal Kuliah Semester " + semesterCari + " ===");
        boolean ditemukan = false;
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (semester[i] == semesterCari) {
                tampilkanDetailJadwal(i);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + semesterCari);
        }
    }

    private static void cariJadwalMataKuliah() {
        if (!isDataTersedia) {
            System.out.println("\nBelum ada data jadwal. Silakan input jadwal terlebih dahulu.");
            return;
        }

        System.out.print("\nMasukkan nama mata kuliah: ");
        String matkulCari = scanner.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (mataKuliah[i].equalsIgnoreCase(matkulCari)) {
                System.out.println("\n=== Detail Mata Kuliah ===");
                tampilkanDetailJadwal(i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah '" + matkulCari + "' tidak ditemukan.");
        }
    }

    private static void tampilkanDetailJadwal(int index) {
        System.out.println("\nMata Kuliah : " + mataKuliah[index]);
        System.out.println("SKS         : " + sks[index]);
        System.out.println("Semester    : " + semester[index]);
        System.out.println("Hari        : " + capitalizeFirstLetter(hari[index]));
        System.out.println("-----------------------------");
    }

    private static boolean isHariValid(String hari) {
        String[] hariValid = {"senin", "selasa", "rabu", "kamis", "jumat"};
        for (String h : hariValid) {
            if (h.equals(hari.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}