import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            if (pilihan == 5) {
                System.out.println("Terima kasih!");
                break;
            }
            
            switch (pilihan) {
                case 1:
                    System.out.println("\nJadwal Kuliah:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hariKuliah[i]);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah: ");
                    String cariHari = scanner.nextLine();
                    System.out.println("\nJadwal Kuliah untuk " + cariHari + ":");
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(cariHari)) {
                            System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int cariSemester = scanner.nextInt();
                    System.out.println("\nJadwal Kuliah untuk Semester " + cariSemester + ":");
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == cariSemester) {
                            System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - " + hariKuliah[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String cariMataKuliah = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMataKuliah[i].equalsIgnoreCase(cariMataKuliah)) {
                            System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hariKuliah[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
