package P2;

public class MataKuliahMain29 {
    public static void main(String[] args) {
        MataKuliah29 mk1 = new MataKuliah29();
        mk1.kodeMK = "AG";
        mk1.nama = "Agama";
        mk1.sks = 1;
        mk1.jumlahJam = 2;
        mk1.tampilInformasi();

        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();
        
        mk1.kurangiJam(4);
        mk1.tampilInformasi();
    }

}
