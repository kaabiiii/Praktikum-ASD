public class Surat12 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' = sakit, 'I' = izin lain
    int durasi;

    public Surat12(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkan() {
        System.out.println("ID Surat       : " + idSurat);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Kelas          : " + kelas);
        System.out.println("Jenis Izin     : " + jenisIzin);
        System.out.println("Durasi         : " + durasi + " hari");
    }
}
