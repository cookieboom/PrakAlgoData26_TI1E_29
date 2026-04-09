package P6;

public class Dosen29 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;
    
    Dosen29(String kd, String name, String jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = stringKeBoolean(jk);
        usia = age;
    }
    
    Boolean stringKeBoolean(String jk) {
        if (jk.equalsIgnoreCase("Laki-laki") || jk.equalsIgnoreCase("L")) {
            return true;
        } else if (jk.equalsIgnoreCase("Perempuan") || jk.equalsIgnoreCase("P")) {
            return false;
        }
        return false;
    }
    
    String booleanKeString(Boolean jk) {
        if (jk) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }
    
    void tampil() {
        System.out.println(kode + " | " + nama + " | " + booleanKeString(jenisKelamin) + " | " + usia);
    }
}
