import java.util.Scanner;
public class Pangkat {
    int nilai, pangkat;

    Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }
    int pangkatBF(int a, int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil*a;

        }
        return hasil;
    }
    int pangkatDC(int a, int n){
        if (n==1) {
            return a;
        }else{
            if (n%2 == 1) {
                return (pangkatDC(a, n/2)* pangkatDC(a, n/2) * a);
            }
            return (pangkatDC(a, n/2)* pangkatDC(a, n/2));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai basis elemen ke-" + (i+1)+": ");
            int basis = input.nextInt();
            System.out.println("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }
            System.out.println("HASIL PANGKAT BRUTE FORCE:");
            for (Pangkat p : png){
                System.out.println(p.nilai+ "^"+ p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
            }
            System.out.println("HASIL PANGKAT DEVIDE AND CONQUER:");
            for(Pangkat p : png){
                System.out.println(p.nilai + "^" + p.pangkat+ ": " + p.pangkatDC(p.nilai, p.pangkat));
            }
        

    }
}
