|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  244107020240|
| Nama |  Mochammad Rijal Dzaki Rifki Afifudin |
| Kelas | TI - 1H |
| Repository | [Zinc-zn](https://github.com/Zinc-zn/14_ALSD) |

# ARRAY OF OBJECT
## 5.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

**Maaf tidak ada bukti screenshot karna progam saya tidak bisa dirun dikarenakan tidak ada fungsi main**
***
**Penjelesan singkat:** 
Disini ada 8 step utama: 

1. **Mendeklarasikan class :**
   - `Faktorial.java`
2.  **Mendeklarasikan Methode :**
    -   **faktorialBF** int
    -   **faktorialDC** int
3.  **Mendeklarasikan class :**
    -   `faktorialMain` .
4. **Membuat object**
5. **Mendeklarasikan Scanner**
6. **Input Nilai Menggunakan Scanner**
7. **Menghitung Nilai Menggunakan Method Dari Objek**
8. **Menampilkan Hasil**
 ***
  **Pertanyaan :**
  1. **Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!**
   - Perbedaannya itu adalah if bekerja sebagai base casenya atau tanda berhentinya, jadi selama belum mencapai syarat base casenya maka perulangan rekursifnya maka terus berulang .
 2. **Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!**
  -  Bisa, kita bisa menggunakan while seperti code dibawah .

		    int  faktorialBF(int  n){
				    int  fakto  =  1;
					while (n  !=  0) {
						    fakto  =  fakto  * (n--);
				    }
				    return  fakto;
		    }

 
 3. **Jelaskan perbedaan antara `fakto *= i;` dan `int fakto = n * faktorialDC(n-1);` !**
`arrayOfMahasiswa = new Mahasiswa[3]` . 
  - `fakto *= i;` sama saja dengan `fakto = fakto * i;` nah itu adalah kode aritmatika biasa sedangkan `int fakto = n * faktorialDC(n-1);` adalah sebuah operasi dalam rekursif .  
 
4. **Buat Kesimpulan tentang perbedaan cara kerja method `faktorialBF()` dan `faktorialDC()`!**

-  `faktoBF()` adalah method yang menggunakanan perulangan biasa seperti for, while, dll untuk menghitung faktorial, sedangkan `faktoDC()` menggunakan rekursif untuk menghitung faktorialnya .

	
***
## 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer


 ![Screenshot](img/Screenshot%202025-03-24%20230800.png)	
***
**Penjelesan singkat:** 
Disini ada 9 step utama: 

1. **Mendeklarasikan class**
  - `Pangkat.java`
2.  **Mendeklarasikan attribute dan methodnya**
 - attribute :
	 - `int nilai;` .
	 - `int pangkat;` .
- method :
	- `int pangkatBF()` .
	- `int pangkatDC()`   
3. **Mendeklarasikan konstruktor**
4. **Mendeklarasikan class**
- `MainPangkat.java` .
5. **Mendeklarasikan Scanner**
6. **Membuat Object Dengan array**
7. **Melengkapi attribute dari object menggunakan Scanner**
8. **Menghitung Hasil menggunakan method dari object**
9. **Menampilkan Hasilnya**
 ***
  **Pertanyaan :**
  1. **Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!**
- Sama seperti percobaan 1, `pangkatBF()` menggunakan perulangan biasa untuk menghitung hasilnya, sedangkan `pangkatDC()` menggunakan rekursif untuk menghitung hasilnya .
 2. **Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!**

- Ada, terdapat di method `pangkatDC()` , karena di`pangkatDC()` kita menggabungkan sub masalah untuk mendapatkan hasil akhir, seperti kode dibawah .

	    return (pangkatDC(a, n  /  2) *  pangkatDC(a, n  /  2) *  a);
- seperti contoh diatas kita mengalikan 2 * 2 dan 2 * 2 lalu mengalikannya 2 untuk mendapat hasil akhir jika kita menginginkan hasil dari  2 ^ 5 .
3. **Pada method `pangkatBF()`terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method `pangkatBF()` yang tanpa parameter?**
- Menurut saya tidak relevan untuk menambahkan parameter karna tidak diperlukan pada percobaan ini, kita bisa menghapus paramameternya, seperti contoh dibawah .

	    int  pangkatBF(){
			 int  hasil  =  1;
			 for(int  i  =  0; i  <  pangkat; i++){
				   hasil  =  hasil  *  nilai;
			 }
			 return  hasil;
	    }
4. **Tarik tentang cara kerja method `pangkatBF()` dan `pangkatDC()`!**
- Metode `pangkatBF()` menghitung pangkat dengan mengalikan nilai secara berulang sebanyak pangkatnya, sedangkan `pangkatDC()` menggunakan metode divide and conquer dengan membagi pangkat menjadi setengah, menghitungnya secara rekursif, lalu menggabungkan hasilnya melalui perkalian, sehingga lebih efisien dari segi waktu.
 ***
## 3.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

 ![Screenshot](img/Screenshot%202025-03-24%20231020.png)

***
**Penjelesan singkat:** 
Disini ada 4 step utama: 



1.   **Buat class `Sum`**
-   Tambahkan atribut array `keuntungan[]`.
-   Buat constructor untuk inisialisasi array sesuai jumlah elemen.
-   Buat method `totalBF()` untuk menghitung total dengan perulangan.
-   Buat method `totalDC()` untuk menghitung total secara rekursif (divide and conquer).

3.    **Buat class `MainSum`**
-   Gunakan `Scanner` untuk input jumlah elemen.
-   Buat objek dari class `Sum`.
-   Input nilai-nilai keuntungan dan simpan ke array.
-   Panggil dan tampilkan hasil dari `totalBF()` dan `totalDC()`.

4.    **Jalankan program untuk melihat perbandingan hasil antara metode brute force dan divide & conquer.**
 ***
  **Pertanyaan :**
  1. **Kenapa dibutuhkan variable `mid` pada method `TotalDC()` ?**
 - Variable `mid` dibutuhkan untuk mencapai base case dalam fungsi rekursif di method `TotalDC()` dan sebagai nilai tengah untuk pemisah perhitungan `lsum` dan `rsum` karna `lsum` akan menjumlah kan semua keuntungan dari indeks <= (`mid` atau `mid` + 1) sedangkan `rsum` menjumlahkan semua indeks > (`mid` atau `mid` + 1) baru akhirsnya keduanya dijumlahkan .
 2. **Untuk apakah statement di bawah ini dilakukan dalam `TotalDC()` ?**

	    double  lsum  =  totalDC(arr, l, mid);
	    double  rsum  =  totalDC(arr, mid  +  1, r);
- Statement diatas digunakan menghitung total keuntungan dari suatu objek menggunakan rekursif.

3. **Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?**

	    return lsum+ rsum;

  - Seperti penjelasan saya dijawaban nomor 1, karna `lsum` digunakan untuk menjumlahkan semua keuntungan dari indeks <= (`mid` atau `mid` + 1) sedangkan `rsum` digunakan untuk menjumlahkan semua keuntungan dari indeks > (`mid` atau `mid` + 1) maka dari itu kita harus menjumlahkan keduanya untuk mendapatkan total keuluruhan dari semua indeks.

4. **Apakah base case dari totalDC()?**


- Base casenya adalah l == r seperti yg tertera pada kode dibawah

	    if (l  ==  r) {
	    return  arr[l];
	    }

5. **Tarik Kesimpulan tentang cara kerja totalDC()**
- TotalDC() digunakan untuk mendapatkan total keuntunga dari suatu objek dengan cara devide and conquer, di mehtod ini ada 3 variable yaitu mid, lsum, dan rsum dimana mid digunakan untuk nilai tengah dari elemen sekaligus variable yang membantu untuk mencapai base case dari fungsi rekursif di method ini. sedangkan untuk lsum dan rsum digunakan untuk menghitung semua total keuntungan menggunakan fungsi rekursif dimana  `lsum` digunakan untuk menjumlahkan semua keuntungan dari indeks <= (`mid` atau `mid` + 1) sedangkan `rsum` digunakan untuk menjumlahkan semua keuntungan dari indeks > (`mid` atau `mid` + 1). maka dari itu hasil akhirnya didapatkan dari menjumlah `lsum` dan `rsum`.
	
***
## Tugas 1

 ![Screenshot](img/Screenshot%202025-03-24%20231549.png) ![Screenshot](img/Screenshot%202025-03-24%20231607.png)

***
**Penjelesan singkat:** 
Disini ada 7 step utama: 

1.  **Buat class `Mahasiswa`**
    
    -   Tambahkan atribut: `nama`, `nim`, `thnMasuk`, `uts`, `uas`.
    -   Buat constructor untuk inisialisasi data.
    -   Buat method rekursif `utsTertinggi()` untuk mencari mahasiswa dengan nilai UTS tertinggi (divide and conquer).
    -   Buat method rekursif `utsTerendah()` untuk mencari nilai UTS terendah.
    -   Buat method `rataNilaiUAS()` untuk menghitung rata-rata UAS semua mahasiswa.
2.  **Buat class `MahasiswaMain`**
    
    -   Buat array berisi beberapa objek `Mahasiswa`.
    -   Tampilkan nama mahasiswa dengan UTS tertinggi dan terendah.
    -   Tampilkan rata-rata nilai UAS dengan format 2 angka di belakang koma.
3.  **Jalankan program** untuk melihat hasilnya.
***









