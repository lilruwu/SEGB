package ClienteWeb;

import java.io.Serializable;
import java.nio.file.*;


public class MensajeRegistrar_Request implements Serializable {

    
    private static final long serialVersionUID = -6392106198310247028L;
    
    private String nombreDoc;

    private byte[] documentoCifrado;
    private byte[] claveSimetricaCifrada;
    private byte[] parametrosCifrado;
    private byte[] firmaDocumento;
    private byte[] certificadoFirmaC;
    private byte[] certificadoCifradoC;

    public MensajeRegistrar_Request(String docName) {

        nombreDoc = docName;


        try {
            Path path_certificadoCifradoC = Paths.get(System.getProperty("user.home" )+"/SEG/stores/sub-ca-client/cliente_sub.crt");
            byte[] certificadoCifradoC = Files.readAllBytes(path_certificadoCifradoC);

            Path path_documento = Paths.get(System.getProperty("user.home" )+"/SEG/docroot/"+docName);
            byte[] documento = Files.readAllBytes(path_documento);

            Path path_documentoCifrado = Paths.get("C:/temp/test.txt");
            byte[] documentoCifrado = Files.readAllBytes(path_documentoCifrado);

            Path path_claveSimetricaCifrada = Paths.get("C:/temp/test.txt");
            byte[] claveSimetricaCifrada = Files.readAllBytes(path_claveSimetricaCifrada);

            Path path_firmaDocumento = Paths.get("C:/temp/test.txt");
            byte[] firmaDocumento = Files.readAllBytes(path_firmaDocumento);

            Path path_certificadoFirmaC = Paths.get("C:/temp/test.txt");
            byte[] certificadoFirmaC = Files.readAllBytes(path_certificadoFirmaC);

            Path path_parametrosCifrado = Paths.get("C:/temp/test.txt");
            byte[] parametrosCifrado= Files.readAllBytes(path_parametrosCifrado);

        } catch (Exception e) {
            System.out.println("Error leyendo archivos:");
            System.out.println(e.getMessage());
        }
        
    }

}
