package P2;

public class Dosenmain29 {
    public static void main(String[] args) {
        Dosen29 dsn1 = new Dosen29();
        dsn1.idDosen = "123";
        dsn1.nama = "Awan";
        dsn1.setStatusAktif(true);
        dsn1.tahunBergabung = 2006;
        dsn1.bidangKeahlian = "Ilmu Langit";
        dsn1.tampilinformasi();
        System.out.println("Masa kerja dosen: " + dsn1.hitungMasaKerja(2026));

        dsn1.setStatusAktif(false);
        dsn1.ubahKeahliian("Ilmu Cuaca");
        dsn1.tampilinformasi();
    }   
}
