package P13;

public class BinaryTreeMain29 {
    public static void main(String[] args) {
        BinaryTree29 bst = new BinaryTree29();

        bst.add(new Mahasiswa29("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa29("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa29("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa29("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.println("\nCari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa29("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa29("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa29("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar setelah penambahan 3 mahasiswa:");
        System.out.println("\nInOrder Traversal:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        BinaryTreeArray29 bta = new BinaryTreeArray29();
        Mahasiswa29 mhs1 = new Mahasiswa29("244160121", "Al1", "A", 3.57);
        Mahasiswa29 mhs2 = new Mahasiswa29("244160185", "Candra", "C", 3.41);
        Mahasiswa29 mhs3 = new Mahasiswa29("244160221", "Badar", "B", 3.75);
        Mahasiswa29 mhs4 = new Mahasiswa29("244160220", "Dewi", "B", 3.35);

        Mahasiswa29 mhs5 = new Mahasiswa29("244160131", "Devi", "A", 3.48);
        Mahasiswa29 mhs6 = new Mahasiswa29("244160205", "Ehsan", "D", 3.61);
        Mahasiswa29 mhs7 = new Mahasiswa29("244160170", "Fizi", "B", 3.86);

        Mahasiswa29[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxlast = 6;
        bta.populateData(dataMahasiswas, idxlast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\n\n=== Testing addRekursif, cariMinIPK, cariMaxIPK, dan tampilMahasiswaIPKdiAtas ===");
        BinaryTree29 bst2 = new BinaryTree29();
        bst2.addRekursif(new Mahasiswa29("244160121", "Ali", "A", 3.57));
        bst2.addRekursif(new Mahasiswa29("244160221", "Badar", "B", 3.85));
        bst2.addRekursif(new Mahasiswa29("244160185", "Candra", "C", 3.21));
        bst2.addRekursif(new Mahasiswa29("244160220", "Dewi", "B", 3.54));
        bst2.addRekursif(new Mahasiswa29("244160131", "Devi", "A", 3.72));

        System.out.println("\nMahasiswa dengan IPK terendah:");
        bst2.cariMinIPK().tampilInformasi();

        System.out.println("\nMahasiswa dengan IPK tertinggi:");
        bst2.cariMaxIPK().tampilInformasi();

        System.out.println("\nMahasiswa dengan IPK >= 3.50:");
        bst2.tampilMahasiswaIPKdiAtas(3.50);

        System.out.println("\n\n=== Testing BinaryTreeArray29 traversePreOrder ===");
        BinaryTreeArray29 bta2 = new BinaryTreeArray29();
        bta2.add(new Mahasiswa29("244160121", "Ali", "A", 3.57));
        bta2.add(new Mahasiswa29("244160221", "Badar", "B", 3.85));
        bta2.add(new Mahasiswa29("244160185", "Candra", "C", 3.21));
        bta2.add(new Mahasiswa29("244160220", "Dewi", "B", 3.54));

        System.out.println("PreOrder Traversal BinaryTreeArray:");
        bta2.traversePreOrder(0);
    }
}
