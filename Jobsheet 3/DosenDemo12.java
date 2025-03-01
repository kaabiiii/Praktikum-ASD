import java.util.Scanner;
public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine();

        Dosen12[] daftarDosen = new Dosen12[jumlahDosen];

       
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1) + ":");
            System.out.print("Kode: ");
            String kode = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Jenis Kelamin (L untuk laki-laki, P untuk perempuan): ");
            char jk = scanner.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); 
            daftarDosen[i] = new Dosen12(kode, nama, jenisKelamin, usia);
        }

       
        for (Dosen12 dosen : daftarDosen) {
            dosen.tampilkanInfo();
        }
        System.out.println("\nDaftar Dosen:");
        DataDosen12.dataSemuaDosen(daftarDosen);
        DataDosen12.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen12.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen12.infoDosenPalingTua(daftarDosen);
        DataDosen12.infoDosenPalingMuda(daftarDosen);
    }
}