import java.util.Scanner;

public class SuratMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat12 stack = new StackSurat12();
        int pilihan;

        do {
            System.out.println("\n--- Menu Surat Izin ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = sc.nextInt(); sc.nextLine();
                    Surat12 s = new Surat12(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat12 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat yang diproses:");
                        diproses.tampilkan();
                    }
                    break;

                case 3:
                    Surat12 teratas = stack.peek();
                    if (teratas != null) {
                        System.out.println("Surat teratas:");
                        teratas.tampilkan();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    Surat12 ditemukan = stack.cariSurat(cari);
                    if (ditemukan != null) {
                        System.out.println("Surat ditemukan:");
                        ditemukan.tampilkan();
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
