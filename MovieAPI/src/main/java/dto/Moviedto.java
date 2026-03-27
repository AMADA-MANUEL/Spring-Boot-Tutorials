package dto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor




public class Moviedto {


    private Integer movieId;

    @NotBlank(message   = "Please provide movies title")

    private String title;
    @NotBlank(message   = "Please provide movies title")

    private String director;
    @NotBlank(message   = "Please provide movies director")

    private String studio;
    @NotBlank(message   = "Please provide movies studio")

    private Set<String> movieCast ;
    //NotBlank(message   = "Please provide movies title")
    private Integer releaseYear;


    @NotBlank(message   = "Please provide movies title")
    private String poster;

    @NotBlank(message = "please provide poster url")
    private String posterUrl;




}
