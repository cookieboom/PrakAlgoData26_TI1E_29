package P12.CM;

public class rekap {
    String namaMenu;
    int jumlah;

    public rekap(String namaMenu) {
        this.namaMenu = namaMenu;
        this.jumlah = 1;
    }

    public void tambahJumlah() {
        this.jumlah++;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public int getJumlah() {
        return jumlah;
    }
}

