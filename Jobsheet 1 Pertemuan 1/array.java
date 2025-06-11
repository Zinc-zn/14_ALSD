import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        
        int[] nilaiAngka = new int[mataKuliah.length];
        
        System.out.println("Program Menghitung IP Semester");
        System.out.println();
        
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk Mata Kuliah " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextInt();
            while (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("Nilai tidak valid! Masukkan nilai antara 0-100");
                System.out.print("Masukkan nilai Angka untuk Mata Kuliah " + mataKuliah[i] + ": ");
                nilaiAngka[i] = input.nextInt();
            }
        }
        
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("\nMata Kuliah                           Nilai Angka    Nilai Huruf    Bobot Nilai");
        
        double totalBobot = 0;
        int totalSKS = 0;
        
        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf;
            double bobotNilai;
            
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf = "A";
                bobotNilai = 4.00;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf = "B+";
                bobotNilai = 3.50;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf = "B";
                bobotNilai = 3.00;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf = "C+";
                bobotNilai = 2.50;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf = "C";
                bobotNilai = 2.00;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf = "D";
                bobotNilai = 1.00;
            } else {
                nilaiHuruf = "E";
                bobotNilai = 0.00;
            }
            
            System.out.printf("%-40s %-14.2f %-14s %.2f\n",
                            mataKuliah[i],
                            (double) nilaiAngka[i],
                            nilaiHuruf,
                            bobotNilai);
            
            totalBobot += bobotNilai;
            totalSKS++;
        }
        
        double ip = totalBobot / totalSKS;
        System.out.printf("\nIP : %.2f", ip);
    }
}