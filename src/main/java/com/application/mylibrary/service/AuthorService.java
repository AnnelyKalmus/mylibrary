package com.application.mylibrary.service;

import com.application.mylibrary.entity.Author;
import com.application.mylibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAllAuthors(){
      return authorRepository.findAll();
    }

    public Author findAuthorById(Long id){
        Author author;
        author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
        return author;
    }

    public void createAuthor(Author author){
        authorRepository.save(author);
    }

    public void removeAuthor(Long id){
        Author author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
        authorRepository.deleteById(id);
    }

    public void updateAuthor(Author author){
        authorRepository.save(author);
    }

}
