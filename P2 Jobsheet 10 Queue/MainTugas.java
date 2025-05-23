import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRSTugas antrian = new AntrianKRSTugas(10); 
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil 2 Mahasiswa untuk Proses KRS");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Lihat Jumlah Mahasiswa yang Sudah Proses");
            System.out.println("10. Lihat Jumlah Mahasiswa yang Belum Proses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa[] dipanggil = antrian.prosesKRS();
                    if (dipanggil != null) {
                        System.out.println("Mahasiswa yang dipanggil untuk KRS:");
                        for (Mahasiswa m : dipanggil) {
                            m.tampilkanData();
                        }
                    }
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkan2Terdepan();
                    break;

                case 5:
                    antrian.tampilkanAkhir();
                    break;

                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;

                case 7:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;

                case 8:
                    antrian.kosongkan();
                    break;

                case 9:
                    antrian.cetakJumlahDiproses();
                    break;

                case 10:
                    antrian.cetakJumlahSisa();
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
