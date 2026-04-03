package service;

import dto.Moviedto;
import org.springframework.web.multipart.MultipartFile;

public interface MovieService {
    Moviedto addMovie(Moviedto moviedto , MultipartFile file);
}
