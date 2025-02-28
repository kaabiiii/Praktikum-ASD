import java.util.Scanner;
public class MataKuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Matakuliah12[]arrayOfMatakuliah12 = new Matakuliah12[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode           : ");
            kode = sc.nextLine();
            System.out.print("Nama           : ");
            nama = sc.nextLine();
            System.out.print("Sks            : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam     : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------");

            arrayOfMatakuliah12[i] = new Matakuliah12(kode, nama, sks, jumlahJam);

            
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data MataKuliah ke- " + (i+1));
            System.out.println("Kode         : " + arrayOfMatakuliah12[i].kode);
            System.out.println("Nama         : " + arrayOfMatakuliah12[i].nama);
            System.out.println("Sks          : " + arrayOfMatakuliah12[i].sks);
            System.out.println("JumlahJam    : " + arrayOfMatakuliah12[i].jumlahJam);
            System.out.println("---------------------------------------------");

        }
    }
}
