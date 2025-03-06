
// public class MahasiswaDemo14 {
//     public static void main(String[] args) {
//         Mahasiswa14[] arrayOfMahasiswa14 = new Mahasiswa14[3];
//         arrayOfMahasiswa14[0] = new Mahasiswa14();
//         arrayOfMahasiswa14[0].nim = "2441077060033";
//         arrayOfMahasiswa14[0].nama = "AGNES TITANIA KINANTI";
//         arrayOfMahasiswa14[0].kelas = "SIB-1E";
//         arrayOfMahasiswa14[0].ipk = (float) 3.75;

//         arrayOfMahasiswa14[1] = new Mahasiswa14();
//         arrayOfMahasiswa14[1].nim = "2341720172";
//         arrayOfMahasiswa14[1].nama = "ACHMAD MAULANA HAMZAH";
//         arrayOfMahasiswa14[1].kelas = "TI-2A";
//         arrayOfMahasiswa14[1].ipk = (float) 3.36;

//         arrayOfMahasiswa14[2] = new Mahasiswa14();
//         arrayOfMahasiswa14[2].nim = "244107023006";
//         arrayOfMahasiswa14[2].nama = "DIRHAMAWAN PUTRANTO";
//         arrayOfMahasiswa14[2].kelas = "TI-2E";
//         arrayOfMahasiswa14[2].ipk = (float) 3.80;

//         System.out.println("NIM    : "+ arrayOfMahasiswa14[0].nim);
//         System.out.println("NAMA   : "+ arrayOfMahasiswa14[0].nama);
//         System.out.println("KELAS  : "+ arrayOfMahasiswa14[0].kelas);
//         System.out.println("IPK    : "+ arrayOfMahasiswa14[0].ipk);
//         System.out.println("----------------------------------");
//         System.out.println("NIM    : "+ arrayOfMahasiswa14[1].nim);
//         System.out.println("NAMA   : "+ arrayOfMahasiswa14[1].nama);
//         System.out.println("KELAS  : "+ arrayOfMahasiswa14[1].kelas);
//         System.out.println("IPK    : "+ arrayOfMahasiswa14[1].ipk);
//         System.out.println("----------------------------------");
//         System.out.println("NIM    : "+ arrayOfMahasiswa14[2].nim);
//         System.out.println("NAMA   : "+ arrayOfMahasiswa14[2].nama);
//         System.out.println("KELAS  : "+ arrayOfMahasiswa14[2].kelas);
//         System.out.println("IPK    : "+ arrayOfMahasiswa14[2].ipk);
        
//     }
// }
import java.util.Scanner;public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa14[] arrayOfMahasiswa14 = new Mahasiswa14[3];
        String dummy;

        for(int i=0; i<3; i++){
            arrayOfMahasiswa14[i] = new Mahasiswa14();

            System.out.println("Masukkan Data Mahasiswa ke-"+ (i+1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa14[i].nim = sc.nextLine();
            System.out.print("NAMA   : ");
            arrayOfMahasiswa14[i].nama = sc.nextLine();
            System.out.print("KELAS  : ");
            arrayOfMahasiswa14[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa14[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("DATA MAHASISWA KE-" + (i+1));
            arrayOfMahasiswa14[i].cetakInfo();
        }

        
    }
}
