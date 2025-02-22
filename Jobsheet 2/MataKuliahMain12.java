public class MataKuliahMain12 {
    public static void main(String[] args) {
        MataKuliah12 mk1 = new MataKuliah12();
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        
        System.out.println(); 
        
        MataKuliah12 mk2 = new MataKuliah12("MK101", "Pemrograman Java", 4, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
    }
}
