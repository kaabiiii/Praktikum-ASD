public class DataMahasiswa {
    public static Mahasiswa[] mahasiswa = new Mahasiswa[3];

    void isiData() {
        mahasiswa[0] = new Mahasiswa("22001", "Alih Rahman");
        mahasiswa[0].prodi = "Informatika";
        mahasiswa[1] = new Mahasiswa("22002", "Budi");
        mahasiswa[1].prodi = "Sistem Informasi";
        mahasiswa[2] = new Mahasiswa("22003", "Cindy");
        mahasiswa[2].prodi = "Teknik Komputer";
    }

    void tampil() {
        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i] != null) {
                mahasiswa[i].tampilMahasiswa();
            }
        }
    }

    int sequentialSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < mahasiswa.length; j++) {
            if (mahasiswa[j].nim.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(String x, int posisi) {
        if (posisi != -1) {
            System.out.println("Data Mahasiswa dengan NIM: " + x + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int posisi) {
        if (posisi != -1) {
            System.out.println("NIM : " + mahasiswa[posisi].nim);
            System.out.println("Nama : " + mahasiswa[posisi].nama);
            System.out.println("Prodi : " + mahasiswa[posisi].prodi);
        } else {
            System.out.println("Data mahasiswa dengan NIM: " + x + " tidak ditemukan");
        }
    }
}
