public class BinaryTreeArray14 {
    Mahasiswa14[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray14() {
        this.dataMahasiswa = new Mahasiswa14[10];
    }

    void populateDate (Mahasiswa14 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart] . tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    public void add(Mahasiswa14 mahasiswa) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Array penuh, tidak bisa menambah data");
            return;
        }
        
        idxLast++;
        dataMahasiswa[idxLast] = mahasiswa;
        
        for (int i = idxLast; i > 0; i--) {
            if (dataMahasiswa[i] != null && dataMahasiswa[i-1] != null) {
                if (dataMahasiswa[i].ipk < dataMahasiswa[i-1].ipk) {
                    // Swap
                    Mahasiswa14 temp = dataMahasiswa[i];
                    dataMahasiswa[i] = dataMahasiswa[i-1];
                    dataMahasiswa[i-1] = temp;
                } else {
                    break;
                }
            }
        }
    }

        public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            System.out.println();
            
            int leftChild = 2 * idxStart + 1;
            if (leftChild <= idxLast) {
                traversePreOrder(leftChild);
            }
            
            int rightChild = 2 * idxStart + 2;
            if (rightChild <= idxLast) {
                traversePreOrder(rightChild);
            }
        }
    }
}
