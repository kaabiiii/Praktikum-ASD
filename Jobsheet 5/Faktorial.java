import java.util.Scanner;
public class Faktorial {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial " + nilai + " Menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " Menggunakan DC: " + fk.faktorialDC(nilai));
    }
    int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }
    int faktorialDC(int n){
if (n==1) {
    return 1;
}else {
    int fakto = n * faktorialDC(n-1);
    return fakto;
}
    }

}
