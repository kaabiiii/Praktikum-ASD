import java.util.Scanner;

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = input.nextInt();
        input.nextLine(); // membersihkan newline

        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();

            Mahasiswa12 m = new Mahasiswa12(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.insertionSort(); // urutkan dulu sebelum binary search
        list.tampil();

        System.out.println("----------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = input.nextDouble();

        System.out.println("----------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("----------------------");

        int posisi = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}