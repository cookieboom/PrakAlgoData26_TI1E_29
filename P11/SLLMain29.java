package P11;

import java.util.Scanner;

public class SLLMain29 {
    public static void main(String[] args) {
        SingleLinkedList29 sll = new SingleLinkedList29();

        Mahasiswa29 mhs1 = new Mahasiswa29("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa29 mhs2 = new Mahasiswa29("23212201", "Bimon", "2B", 3.8);
        Mahasiswa29 mhs3 = new Mahasiswa29("22212202", "Cintia", "3C", 3.5);
        Mahasiswa29 mhs4 = new Mahasiswa29("21212203", "Dirga", "4O", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.print();
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
