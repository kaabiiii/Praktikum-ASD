public class AntrianKRSTugas {
    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahProses;

    public AntrianKRSTugas(int kapasitas) {
        max = kapasitas;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        sudahProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void kosongkan() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak dapat menambah.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa berhasil masuk antrian.");
        }
    }

    public Mahasiswa[] prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, proses tidak dapat dilakukan.");
            return null;
        } else {
            Mahasiswa[] dipanggil = new Mahasiswa[2];
            for (int i = 0; i < 2; i++) {
                dipanggil[i] = data[front];
                front = (front + 1) % max;
                size--;
                sudahProses++;
            }
            return dipanggil;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[idx].tampilkanData();
            }
        }
    }

    public void tampilkan2Terdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
        } else {
            System.out.println("2 Mahasiswa Terdepan:");
            for (int i = 0; i < 2; i++) {
                int idx = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[idx].tampilkanData();
            }
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir:");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah diproses KRS: " + sudahProses);
    }

    public void cetakJumlahSisa() {
        System.out.println("Jumlah mahasiswa yang belum diproses KRS: " + size);
    }
}
