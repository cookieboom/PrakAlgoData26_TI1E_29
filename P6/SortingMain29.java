package P6;

public class SortingMain29 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        Sorting29 dataurut1 = new Sorting29(a, a.length);
        Sorting29 dataurut2 = new Sorting29(b, b.length);
        Sorting29 dataurut3 = new Sorting29(c, c.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleShort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SHORT (ASC)");
        dataurut1.tampil();

        System.out.println();
        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.SelectionShort();
        System.out.println("Data sudah diurutkan dengan SELECTION SHORT (ASC)");
        dataurut2.tampil();

        System.out.println();
        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionShort();
        System.out.println("Data sudah diurutkan dengan INSERTION SHORT (ASC)");
        dataurut3.tampil();
    }
}
