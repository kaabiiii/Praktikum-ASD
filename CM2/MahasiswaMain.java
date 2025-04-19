import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataMahasiswa data = new DataMahasiswa();
        data.isiData();

        Mahasiswa[] mahasiswa = DataMahasiswa.mahasiswa;

        MataKuliah[] matkul = {
            new MataKuliah("MK001", "Struktur Data"),
            new MataKuliah("MK002", "Basis Data"),
            new MataKuliah("MK003", "Desain Web")
        };

        DataPenilaian dp = new DataPenilaian(10);
        dp.tambahDataPenilaian(new Penilaian(mahasiswa[0], matkul[0], 80, 85, 90));
        dp.tambahDataPenilaian(new Penilaian(mahasiswa[0], matkul[1], 60, 75, 70));
        dp.tambahDataPenilaian(new Penilaian(mahasiswa[1], matkul[0], 75, 70, 80));
        dp.tambahDataPenilaian(new Penilaian(mahasiswa[2], matkul[1], 85, 90, 95));
        dp.tambahDataPenilaian(new Penilaian(mahasiswa[2], matkul[2], 80, 90, 65));

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Semua Penilaian");
            System.out.println("4. Urutkan Mahasiswa berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa dan Tampilkan Nilai");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
        
            switch (pilihan) {
                case 1:
                    data.isiData();
                    System.out.println("Daftar Mahasiswa:");
                    data.tampil();
                    break;
               
                case 2:
                System.out.println("Daftar Mata Kuliah:");
                for (int i = 0; i < matkul.length; i++) {
                    if (matkul[i] != null) {
                        System.out.println((i + 1) + ". " + matkul[i].namaMK + " (" + matkul[i].kode + ")");
                    }
                }
                break;
            
                case 3:
                    System.out.println("=== DATA PENILAIAN ===");
                    dp.tampilkanPenilaian();
                    break;
                case 4:
                    dp.sortingPenilaian();
                    System.out.println("=== Data Setelah Diurutkan Berdasarkan Nilai Akhir ===");
                    dp.tampilkanPenilaian();
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String cariNIM = sc.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < dp.idx; i++) {
                        if (dp.isiPenilaian[i].mahasiswa.nim.equalsIgnoreCase(cariNIM)) {
                            dp.isiPenilaian[i].tampilPenilaian();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Data penilaian mahasiswa dengan NIM " + cariNIM + " tidak ditemukan.");
                    }
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);        

        sc.close();
    }
}
