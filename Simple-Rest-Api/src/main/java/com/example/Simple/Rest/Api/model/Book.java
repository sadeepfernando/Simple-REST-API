package com.example.Simple.Rest.Api.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Books")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String author;

}
