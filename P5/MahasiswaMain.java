package P5;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("Ahmad", "22010101001", 2022, 78, 82),
            new Mahasiswa("Budi", "22010101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "22010101003", 2021, 90, 87),
            new Mahasiswa("Dian", "22010101004", 2021, 76, 79),
            new Mahasiswa("Eko", "22010101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "22010101006", 2020, 88, 85),
            new Mahasiswa("Gina", "22010101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "22010101008", 2020, 82, 84)
        };

        System.out.println("=== HASIL ANALISIS DATA MAHASISWA ===\n");
        
        Mahasiswa mhs = new Mahasiswa("", "", 0, 0, 0);
        int utsTertinggi = mhs.utsTinggiDC(daftarMahasiswa, 0, daftarMahasiswa.length - 1);
        System.out.println("a) Nilai UTS Tertinggi (Divide and Conquer): " + utsTertinggi);
        
        int utsTerendah = mhs.utsTerendahDC(daftarMahasiswa, 0, daftarMahasiswa.length - 1);
        System.out.println("b) Nilai UTS Terendah (Divide and Conquer): " + utsTerendah);
        
        double rataRataUAS = mhs.rataRataUASBruteForce(daftarMahasiswa);
        System.out.println("c) Rata-rata Nilai UAS (Brute Force): " + String.format("%.2f", rataRataUAS));
    }
}
