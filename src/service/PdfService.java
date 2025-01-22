package pdf.demo.service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class PdfService {

    public void createPdf() {
        String filepath = "C:\\Users\\gaura\\OneDrive\\Desktop\\spring PDF\\gaurav.pdf";

        try {
            PdfWriter pdfWriter = new PdfWriter(filepath);


            PdfDocument pdfDocument = new PdfDocument(pdfWriter);

            pdfDocument.addNewPage();


            Document document = new Document(pdfDocument);

            document.close();

            System.out.println("PDF created successfully at: " + filepath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
