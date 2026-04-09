package P6;

public class DataDosen29 {
    Dosen29[] dataDosen;
    int idx;
    
    DataDosen29() {
        dataDosen = new Dosen29[10];
        idx = 0;
    }
    
    void tambah(Dosen29 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan!");
        } else {
            System.out.println("Array penuh! Data tidak dapat ditambahkan.");
        }
    }
    
    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }
        System.out.println("========== DATA DOSEN ==========");
        for (int i = 0; i < idx; i++) {
            System.out.print((i+1) + ". ");
            dataDosen[i].tampil();
        }
        System.out.println("===============================");
    }
    
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen29 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data dosen berhasil diurutkan secara ASC (berdasarkan usia)!");
    }
    
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen29 temp = dataDosen[i];
            dataDosen[i] = dataDosen[maxIdx];
            dataDosen[maxIdx] = temp;
        }
        System.out.println("Data dosen berhasil diurutkan secara DSC (berdasarkan usia)!");
    }
}
