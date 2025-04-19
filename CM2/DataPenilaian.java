public class DataPenilaian {
    Penilaian[] isiPenilaian;
    int idx = 0;

    DataPenilaian(int jumlah) {
        isiPenilaian = new Penilaian[jumlah];
    }

    void tambahDataPenilaian(Penilaian p) {
        isiPenilaian[idx] = p;
        idx++;
    }

    void tampilkanPenilaian() {
        for (int i = 0; i < idx; i++) {
            isiPenilaian[i].tampilPenilaian();
        }
    }

    void sortingPenilaian() {
        for (int i = 1; i < idx; i++) {
            Penilaian tmp = isiPenilaian[i];
            int j = i;
            while (j > 0 && isiPenilaian[j - 1].nilaiAkhir < tmp.nilaiAkhir) {
                isiPenilaian[j] = isiPenilaian[j - 1];
                j--;
            }
            isiPenilaian[j] = tmp;
        }
    }
}
