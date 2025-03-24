import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen: ");
    int elemen = input.nextInt();

    Sum sm = new Sum(elemen);
    for (int i = 0; i < elemen; i++) {
        System.out.println("Masukkan kentungan ke- "+ (i+1)+": ");
        sm.keuntungan[i] = input.nextDouble();
    }
    System.out.println("Total keuntungan menggunakan BF: "+ sm.totalBF());
    System.out.println("Total keuntungan menggunakan D&C: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
    double keuntungan[];

    Sum(int el){
        keuntungan = new double[el];
    }
    double totalBF(){
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total+keuntungan[i];
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }

        int mid = (l+r)/2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
    return lsum + rsum; 
    }

}
