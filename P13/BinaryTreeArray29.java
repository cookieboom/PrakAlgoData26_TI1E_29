package P13;

public class BinaryTreeArray29 {
    Mahasiswa29[] dataMahasiswa29;
    int idxLast;

    public BinaryTreeArray29() {
        this.dataMahasiswa29 = new Mahasiswa29[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa29 dataMhs[], int idxLast) {
        this.dataMahasiswa29 = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa29 data) {
        if (idxLast < dataMahasiswa29.length - 1) {
            idxLast++;
            dataMahasiswa29[idxLast] = data;
        } else {
            System.out.println("Array penuh!");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa29[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa29[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa29[idxStart] != null) {
                dataMahasiswa29[idxStart].tampilInformasi();
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxStart+2);
            }
        }
    }
}
