package pdf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.RestController;
import pdf.demo.service.PdfService;
@RestController
public class Runner  implements ApplicationRunner {
  @Autowired
  private PdfService pdfService;

   public Runner(PdfService pdfService){
     this.pdfService=pdfService;
   }

    @Override
    public void run(ApplicationArguments args) throws Exception {
      System.out.println("Application file Start To Run");
       pdfService.createPdf();
    }
}
