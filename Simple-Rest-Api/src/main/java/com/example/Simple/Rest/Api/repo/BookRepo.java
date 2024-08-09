package com.example.Simple.Rest.Api.repo;

import com.example.Simple.Rest.Api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
