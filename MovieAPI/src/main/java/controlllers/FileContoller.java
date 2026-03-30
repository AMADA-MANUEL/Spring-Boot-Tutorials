package controlllers;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import service.FileService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@RestController //this class handles HTTP requests (API endpoints)
@RequestMapping("/file/")
public class FileContoller {
    private final FileService fileservice ;

    public FileContoller(FileService fileservice) {
        this.fileservice = fileservice;
    }

    @Value("${projects.poster}") //reads the path from the resource file
    private String path ;
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFileHandler(@RequestPart MultipartFile file) throws IOException{
        String uploadedFileName =fileservice.uploadFile(path,file);//Calls your service layer   Saves the file

        return ResponseEntity.ok("File uploaded :" + uploadedFileName);

    }
    @GetMapping("/{filename}")
    public void serverFileHandler(@PathVariable String filename , HttpServletResponse response) throws IOException {
        InputStream resourceFile = fileservice
                .getResourceFile(path , filename); //Get file from service
        response.setContentType(MediaType.IMAGE_PNG_VALUE); //This forces everything to be treated as PNG
        StreamUtils.copy(resourceFile,response.getOutputStream()); //This streams the file directly to the client

    }



}
