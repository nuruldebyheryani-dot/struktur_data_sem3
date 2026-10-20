public class Main {
    public static void main(String[] args) {
        // Sesuaikan nama file dengan file PDF di folder data milikmu
        String filePath = "data/putusan.pdf";

        System.out.println("Membaca isi file PDF...");
        String hasilTeks = PdfReader.bacaTeks(filePath);

        if (!hasilTeks.isEmpty()) {
            System.out.println("Berhasil membaca file PDF!\n");
            System.out.println("Cuplikan teks awal:");
            // Menampilkan 250 karakter pertama dari teks PDF
            System.out.println(hasilTeks.substring(0, Math.min(hasilTeks.length(), 250)) + "...\n");
        }

        // Membuat objek data dari putusan Pak Galih
        B3Putusan dataTerdakwa = new B3Putusan(
                "Albadru Railana Muhammad Bin Denny Suryono Panca Setyawan",
                19,
                JenisKelamin.LAKI_LAKI,
                "1012/Pid.Sus/2026/PN Sby"
        );

        // Menampilkan data terstruktur
        dataTerdakwa.tampilkanInfo();
    }
}