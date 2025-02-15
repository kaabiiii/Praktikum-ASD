import java.util.Scanner;

public class array12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        
        String[] namaMK = new String[jumlahMK];
        int[] sksMK = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHurufMK = new String[jumlahMK];
        
        double totalSKS = 0;
        double totalNilai = 0;

        for (int i = 0; i < jumlahMK; i++) {
            scanner.nextLine(); 
            System.out.print("Nama mata kuliah: ");
            namaMK[i] = scanner.nextLine();
            
            System.out.print("Bobot SKS: ");
            sksMK[i] = scanner.nextInt();
            
            System.out.print("Masukkan Nilai Angka untuk " + namaMK[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            
            if (nilaiAngka[i] <= 39) {
                nilaiHurufMK[i] = "E";
                nilaiAngka[i] = 0;
            } else if (nilaiAngka[i] <= 50) {
                nilaiHurufMK[i] = "D";
                nilaiAngka[i] = 1;
            } else if (nilaiAngka[i] <= 60) {
                nilaiHurufMK[i] = "C";
                nilaiAngka[i] = 2;
            } else if (nilaiAngka[i] <= 65) {
                nilaiHurufMK[i] = "C+";
                nilaiAngka[i] = 2.5;
            } else if (nilaiAngka[i] <= 73) {
                nilaiHurufMK[i] = "B";
                nilaiAngka[i] = 3;
            } else if (nilaiAngka[i] <= 80) {
                nilaiHurufMK[i] = "B+";
                nilaiAngka[i] = 3.5;
            } else {
                nilaiHurufMK[i] = "A";
                nilaiAngka[i] = 4;
            }
            
            totalSKS += sksMK[i];
            totalNilai += nilaiAngka[i] * sksMK[i];
        }
        
        if (totalSKS == 0) {
            System.out.println("Tidak ada SKS yang dimasukkan.");
        } else {
            double ipSemester = totalNilai / totalSKS;
            System.out.printf("IP Semester Anda: %.2f%n", ipSemester);
        }
    }
}