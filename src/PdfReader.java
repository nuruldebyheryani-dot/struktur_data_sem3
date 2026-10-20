import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfReader {
    public static String bacaTeks(String filePath) {
        String teks = "";
        try {
            File file = new File(filePath);
            PDDocument document = Loader.loadPDF(file);

            if (!document.isEncrypted()) {
                PDFTextStripper stripper = new PDFTextStripper();
                teks = stripper.getText(document);

                // Merapikan baris & enter berlebihan dari watermark PDF
                teks = teks.replaceAll("(?m)^[ \\t]*\\r?\\n", "")
                        .replaceAll("\\s+", " ");
            }
            document.close();
        } catch (IOException e) {
            System.out.println("Gagal membaca file PDF: " + e.getMessage());
        }
        return teks;
    }
}