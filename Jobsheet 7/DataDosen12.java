public class DataDosen12 {
    Dosen12[] dataDosen = new Dosen12[10];
    int idx = 0;

   

    public void tambah(Dosen12 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    
    public void tampil() {
        if (idx == 0) {
            System.out.println("Tidak ada data dosen.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    
    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen12 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan secara ASCENDING berdasarkan usia.");
    }

    
    public void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia < dataDosen[j + 1].usia) {
                    Dosen12 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan secara DESCENDING berdasarkan usia.");
    }

    
    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen12 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data telah diurutkan dengan Insertion Sort (ASCENDING).");
    }


    public void sequentialSearchByNama(String nama) {
        int hasil = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("\nData ditemukan pada indeks " + i + ":");
                dataDosen[i].tampil();
                hasil++;
            }
        }
        if (hasil == 0) {
            System.out.println("Data dengan nama '" + nama + "' tidak ditemukan.");
        } else if (hasil > 1) {
            System.out.println("Peringatan: Ditemukan " + hasil + " data dengan nama yang sama!");
        }
    }

    
    public void binarySearchByUsia(int usia) {
        
        SortingASC();

        int left = 0, right = idx - 1, hasil = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataDosen[mid].usia == usia) {
                int i = mid;
                while (i >= 0 && dataDosen[i].usia == usia) {
                    System.out.println("\nData ditemukan pada indeks " + i + ":");
                    dataDosen[i].tampil();
                    hasil++;
                    i--;
                }
                i = mid + 1;
                while (i < idx && dataDosen[i].usia == usia) {
                    System.out.println("\nData ditemukan pada indeks " + i + ":");
                    dataDosen[i].tampil();
                    hasil++;
                    i++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (hasil == 0) {
            System.out.println("Data dengan usia " + usia + " tidak ditemukan.");
        } else if (hasil > 1) {
            System.out.println("Peringatan: Ditemukan " + hasil + " data dengan usia yang sama!");
        }
    }
}