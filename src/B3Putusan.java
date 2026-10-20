public class B3Putusan {
    private String nama;
    private int umur;
    private JenisKelamin jenisKelamin;
    private String nomorPutusan;

    public B3Putusan(String nama, int umur, JenisKelamin jenisKelamin, String nomorPutusan) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.nomorPutusan = nomorPutusan;
    }

    public void tampilkanInfo() {
        System.out.println("========================================");
        System.out.println("       DATA PUTUSAN PENGADILAN          ");
        System.out.println("========================================");
        System.out.println("Nomor Putusan : " + nomorPutusan);
        System.out.println("Nama Terdakwa : " + nama);
        System.out.println("Umur          : " + umur + " Tahun");
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("========================================");
    }
}