public class QueueMahasiswa14 {
    private NodeMahasiswa14 front;
    private NodeMahasiswa14 rear;
    private int size;
    
    public QueueMahasiswa14() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public void enqueue(Mahasiswa14 Mahasiswa14) {
        NodeMahasiswa14 newNode = new NodeMahasiswa14(Mahasiswa14);
        
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa14 " + Mahasiswa14.nama + " berhasil mengantri!");
        System.out.println("Posisi dalam antrian: " + size);
    }
    
    public boolean isFull() {
        return false;
    }
    
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan!");
    }
    
    public void tambahAntrian(String nim, String nama, String kelas, double ipk, String jenisLayanan) {
        Mahasiswa14 Mahasiswa14 = new Mahasiswa14(nim, nama, kelas, ipk, jenisLayanan);
        enqueue(Mahasiswa14);
    }
    
    public Mahasiswa14 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada Mahasiswa yang dapat dipanggil.");
            return null;
        }
        
        Mahasiswa14 mahasiswaDilayani = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        
        size--;
        System.out.println("Mahasiswa " + mahasiswaDilayani.nama + " sedang dilayani!");
        System.out.println("Jenis layanan: " + mahasiswaDilayani.jenisLayanan);
        return mahasiswaDilayani;
    }
    
    public void tampilkanAntrianTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("\n=== ANTRIAN TERDEPAN ===");
        System.out.println("NIM\t\tNama\t\t\tKelas\tIPK\tJenis Layanan");
        System.out.println("================================================================");
        System.out.println(front.data.toString());
    }
    
    public void tampilkanAntrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("\n=== ANTRIAN TERAKHIR ===");
        System.out.println("NIM\t\tNama\t\t\tKelas\tIPK\tJenis Layanan");
        System.out.println("================================================================");
        System.out.println(rear.data.toString());
    }
    
    public void tampilkanJumlahAntrian() {
        System.out.println("Jumlah Mahasiswa yang masih mengantri: " + size);
    }
    
    public int getSize() {
        return size;
    }
    
    public void tampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("\n=== DAFTAR SELURUH ANTRIAN ===");
        System.out.println("NIM\t\tNama\t\t\tKelas\tIPK\tJenis Layanan");
        System.out.println("================================================================");
        
        NodeMahasiswa14 temp = front;
        int posisi = 1;
        
        while (temp != null) {
            System.out.print(posisi + ". ");
            System.out.println(temp.data.toString());
            temp = temp.next;
            posisi++;
        }
        
        System.out.println("================================================================");
        tampilkanJumlahAntrian();
    }
    
    public boolean cariMahasiswa(String nim) {
        if (isEmpty()) {
            return false;
        }
        
        NodeMahasiswa14 temp = front;
        int posisi = 1;
        
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(nim)) {
                System.out.println("Mahasiswa ditemukan di posisi " + posisi);
                System.out.println("Data Mahasiswa:");
                temp.data.tampilkanInfo();
                return true;
            }
            temp = temp.next;
            posisi++;
        }
        
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam antrian.");
        return false;
    }
}