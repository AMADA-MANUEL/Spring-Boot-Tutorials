package com.movieflix.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

//These come from Project Lombok and reduce boilerplate.
//
//@NoArgsConstructor → creates empty constructor
//@Getter → generates getters
//@Setter → generates setters
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

//This class is a JPA Entity, meaning:
//It maps a Java object to a database table
@Entity
@NoArgsConstructor
@Getter
public class Movie {

    //@Id → marks this as primary key
    //@GeneratedValue → database auto-generates it
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Integer movieId;

    //nullable = false → cannot be NULL
    //length = 200 → max characters
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
