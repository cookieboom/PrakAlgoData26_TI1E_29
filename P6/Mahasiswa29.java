package P6;

public class Mahasiswa29 {
    String nim, nama, kelas;
    double ipk;

    //konstruktor default
    Mahasiswa29() {
    
    }
    
    // konstruktor dengan berparameter (dibuat ada yang nama var parameterinputnya sama ada yang tidak)
    Mahasiswa29(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
