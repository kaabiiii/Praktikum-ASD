public class Mahasiswa12 {
    
        String nama;
        String nim;
        String kelas;
        double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("kelas: " + kelas);

    }    
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru){
        ipk = ipkBaru;
    }
    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        }else if (ipk >= 3.0) {
            return "Kinerja baik";
        }else if (ipk >= 2.5) {
            return "Kinerja cukup";
        }else {
            return "Kinerja kurang";
        }

    }
    public Mahasiswa12(){

    }
    public Mahasiswa12 (String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;

    }
}

