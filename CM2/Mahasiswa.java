public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    void tampilMahasiswa() {
        System.out.print("NIM : " + nim);
        System.out.print(" | Nama : " + nama);
        System.out.println(" | Prodi : " + prodi);
    }
}
