public class BinaryTreeArrayMain14 {
    public static void main(String[] args) {
        BinaryTreeArray14 bta = new BinaryTreeArray14();
        // Mahasiswa14 mhs1 = new Mahasiswa14("244160121", "Ali", "A", 3.57);
        // Mahasiswa14 mhs2 = new Mahasiswa14("244160221", "Badar", "B", 3.85);
        // Mahasiswa14 mhs3 = new Mahasiswa14("244160185", "Candra", "C", 3.21);
        // Mahasiswa14 mhs4 = new Mahasiswa14("244160220", "Dewi", "B", 3.54);

        // Mahasiswa14 mhs5 = new Mahasiswa14("244160131", "Devi", "A", 3.71);
        // Mahasiswa14 mhs6 = new Mahasiswa14("244160205", "Ehsan", "D", 3.37);
        // Mahasiswa14 mhs7 = new Mahasiswa14("244160170", "Fizi", "B", 3.46);

        // Mahasiswa14[] dataMahasiswas = {mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,null,null,null};
        // int idxLast = 6;
        // bta.populateDate(dataMahasiswas, idxLast);
        // System.out.println("\nInorder Traversal Mahasiswa: ");
        // bta.traverseInOrder(0);

        Mahasiswa14[] initialData = {
            new Mahasiswa14("123", "Ali", "A", 3.57),
            new Mahasiswa14("124", "Budi", "B", 3.85)
        };
        bta.populateDate(initialData, 1);
        
        bta.add(new Mahasiswa14("125", "Citra", "C", 3.21));

        System.out.println("PreOrder Traversal:");
        bta.traversePreOrder(0);
    }
}
