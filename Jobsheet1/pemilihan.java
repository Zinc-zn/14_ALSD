import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("Masukkan nilai tugas (0-100): ");
            double nilaiTugas = scanner.nextDouble();
            
            System.out.print("Masukkan nilai kuis (0-100): ");
            double nilaiKuis = scanner.nextDouble();
            
            System.out.print("Masukkan nilai UTS (0-100): ");
            double nilaiUTS = scanner.nextDouble();
            
            System.out.print("Masukkan nilai UAS (0-100): ");
            double nilaiUAS = scanner.nextDouble();
            
            if (nilaiTugas < 0 || nilaiTugas > 100 || 
                nilaiKuis < 0 || nilaiKuis > 100 || 
                nilaiUTS < 0 || nilaiUTS > 100 || 
                nilaiUAS < 0 || nilaiUAS > 100) {
                System.out.println("Nilai tidak valid");
                return;
            }
            
            double nilaiAkhir = (0.20 * nilaiTugas) + (0.20 * nilaiKuis) + 
                               (0.30 * nilaiUTS) + (0.30 * nilaiUAS);
            
            String nilaiHuruf;
            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            
            String keterangan;
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                keterangan = "TIDAK LULUS";
            } else {
                keterangan = "LULUS";
            }
            
            System.out.printf("\nNilai Akhir: %.2f\n", nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);
            
    }
}