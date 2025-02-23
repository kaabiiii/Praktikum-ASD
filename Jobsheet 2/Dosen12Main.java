public class Dosen12Main {
    public static void main(String[] args) {
        Dosen12 dsn1 = new Dosen12("003278", "Ka Abi Muhammad", true, 2025, "Teknik Mesin");
        dsn1.tampilkanInformasi();
        dsn1.SetStatusAktif(false);
        dsn1.ubahKeahlianBidang("Teknik Metallurgi");
        dsn1.tampilkanInformasi();

    }
}