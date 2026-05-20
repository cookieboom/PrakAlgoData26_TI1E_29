package P12.CM;

public class people {
    String namaPembeli, noHp;
    int noAntrian;

    public people(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void cetakAntrianPeople() {
        System.out.printf("%-10d %-10s %-10s\n", noAntrian, namaPembeli, noHp);
    }
}
