
public class MataKuliah12 {
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;

    public MataKuliah12() {
        this.kodeMK = "0000";
        this.nama = "Mata Kuliah Default";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah12(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    
    
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }
    
    
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }
    
    
    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam tidak mencukupi.");
        }
    }
}
