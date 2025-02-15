public class fungsi12 {
    public static void main(String[] args) {
        
        String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        
        int[] hargaBunga = {75000, 50000, 60000, 10000};
    
        int[] bungaMati = {-1, -2, 0, -5};

        
        int[][] stokBunga = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };

        
        tampilkanPendapatan(namaCabang, stokBunga, hargaBunga);

        
        System.out.println("\nStok sebelum pengurangan:");
        tampilkanStok(namaCabang, stokBunga, namaBunga);

        
        updateStok(stokBunga, bungaMati);

        
        System.out.println("\nStok setelah pengurangan:");
        tampilkanStok(namaCabang, stokBunga, namaBunga);
    }

    public static void tampilkanPendapatan(String[] namaCabang, int[][] stok, int[] harga) {
        System.out.println("\nPendapatan setiap cabang jika semua bunga terjual:");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            System.out.println(namaCabang[i] + " : Rp " + pendapatan);
        }
    }

    
    public static void tampilkanStok(String[] namaCabang, int[][] stok, String[] namaBunga) {
        System.out.printf("%-15s %-10s %-10s %-10s %-10s%n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < stok.length; i++) {
            System.out.printf("%-15s", namaCabang[i]);
            for (int j = 0; j < stok[i].length; j++) {
                System.out.printf("%-10d", stok[i][j]);
            }
            System.out.println();
        }
    }


    public static void updateStok(int[][] stok, int[] bungaMati) {
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                stok[i][j] += bungaMati[j]; 
                if (stok[i][j] < 0) stok[i][j] = 0; 
            }
        }
    }
}
