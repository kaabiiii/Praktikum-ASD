public class Dosen12 {
    
    String idDosen, nama, bidangKeahlian;
    int tahungabung;
    boolean statusAktif;

    void tampilkanInformasi(){
        System.out.println("Id Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahungabung);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2025) + " tahun");
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }
    void SetStatusAktif(boolean status){
        statusAktif = status;
        System.out.println("Status dosen telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    void ubahKeahlianBidang(String bidang){
        bidangKeahlian = bidang;
    }
    int hitungMasaKerja(int thnSkrng){
        return thnSkrng - tahungabung;
    }
    public Dosen12(String idDosen, String nm, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        nama = nm;
        this.statusAktif = statusAktif;
        this.tahungabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}