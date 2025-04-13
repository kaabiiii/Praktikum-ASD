import java.util.Scanner;
public class DosenMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen12 listDosen = new DataDosen12();

        while (true) {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Bubble Sort)");
            System.out.println("5. Sorting ASC (Insertion Sort)");
            System.out.println("6. Sequential Search (by Nama)");
            System.out.println("7. Binary Search (by Usia)");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                System.out.println("\nMasukkan Data Dosen:");
                System.out.print("Kode         : ");
                String kode = sc.nextLine();
                System.out.print("Nama         : ");
                String nama = sc.nextLine();
                System.out.print("Jenis Kelamin (L/P): ");
                char jk = sc.next().charAt(0);
                boolean jenisKelamin = (jk == 'L' || jk == 'l');
                System.out.print("Usia         : ");
                int usia = sc.nextInt();
                sc.nextLine();

       
                Dosen12 dsn = new Dosen12(kode, nama, jenisKelamin, usia);
                listDosen.tambah(dsn);
                break;

                case 2: 
                System.out.println("\n===== DATA DOSEN =====");
                listDosen.tampil();
                break;

                case 3:
                listDosen.SortingASC();
                System.out.println("\nData setelah sorting ASCENDING:");
                listDosen.tampil();
                break;
                
                case 4:
                listDosen.SortingDSC();
                System.out.println("\nData setelah sorting DESCENDING:");
                listDosen.tampil();
                break;

                case 5:
                listDosen.insertionSort();
                System.out.println("\nData setelah Insertion Sort ASCENDING:");
                listDosen.tampil();
                break;

                case 6:
                    System.out.print("\nMasukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    listDosen.sequentialSearchByNama(cariNama);
                    break;

                case 7:
                    System.out.print("\nMasukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    sc.nextLine();
                    listDosen.binarySearchByUsia(cariUsia);
                    break;

                case 8:
                    System.out.println("Program selesai.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}