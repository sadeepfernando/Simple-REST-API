package com.example.Simple.Rest.Api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="Books")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Book {
    private Long id;
    private String title;
    private String author;
}
