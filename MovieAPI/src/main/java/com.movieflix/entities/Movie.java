package com.movieflix.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
public class Movie {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Integer movieId;
    @Column(nullable = false,length = 200 )
    @NotBlank(message   = "Please provide movies title")

    private String title;
    @Column(nullable = false )
    @NotBlank(message   = "Please provide movies title")

    private String director;
    @Column(nullable = false )
    @NotBlank(message   = "Please provide movies director")

    private String studio;
    @Column(nullable = false)
    @NotBlank(message   = "Please provide movies studio")


    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast ;

    @Column(nullable = false )
    @NotBlank(message   = "Please provide movies title")
    private Integer releaseYear;

    @Column(nullable = false )
    @NotBlank(message   = "Please provide movies title")

    private String poster;
//    @Column(nullable = false )
//    @NotBlank(message   = "Please provide movies poster")
}
