package P3;

public class DataDosen29 {
    public void dataSemuaDosen(Dosen29[] arrayOfDosen) {
        String jkS;
        int counter;
        counter = 1;

        for (Dosen29 dosen29 : arrayOfDosen) {

            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode        : " + dosen29.kode);
            System.out.println("Nama        : " + dosen29.nama);
            if (dosen29.jenisKelamin == true) {
                jkS = "Pria";
            } else {
                jkS = "Wanita";
            }
            System.out.println("Jenis Kelamin   : " + jkS);
            System.out.println("Usia        : " + dosen29.usia);
            System.out.println("------------------------------");

            counter++;

        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen29[] arrayOfDosen) {
        int p = 0, w = 0;

        for (Dosen29 dosen29 : arrayOfDosen) {
            if (dosen29.jenisKelamin == true) {
                p += 1;
            } else {
                w += 1;
            }
        }

        System.out.println("Jumlah dosen pria: " + p);
        System.out.println("Jumlah dosen wanita: " + w);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen29[] arrayOfDosen) {
        double rataP, rataW;
        int usiaP = 0, usiaW = 0;
        
        for (Dosen29 dosen29 : arrayOfDosen) {
            if (dosen29.jenisKelamin == true) {
                usiaP += dosen29.usia;
            } else {
                usiaW += dosen29.usia;
            }
        }

        rataP = usiaP / arrayOfDosen.length;
        rataW = usiaW / arrayOfDosen.length;

        System.out.println("Rata-rata usia dosen pria: " + rataP);
        System.out.println("Rata-rata usia dosen wanita: " + rataW);
    }

    public void infoDosenPalingTua(Dosen29[] arrayOfDosen) {
        int tua = 0;

        for (Dosen29 dosen29 : arrayOfDosen) {
            if (dosen29.usia > tua) {
                tua = dosen29.usia;
            }
        }

        System.out.println("Usia dosen yang paling tua: " + tua);
    }

    public void infoDosenPalingMuda(Dosen29[] arrayOfDosen) {
        int muda = 100;

        for (Dosen29 dosen29 : arrayOfDosen) {
            if (dosen29.usia < muda) {
                muda = dosen29.usia;
            }
        }

        System.out.println("Usia dosen yang paling muda: " + muda);
    }
}
