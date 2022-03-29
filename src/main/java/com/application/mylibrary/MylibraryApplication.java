package com.application.mylibrary;

import com.application.mylibrary.entity.Author;
import com.application.mylibrary.entity.Book;
import com.application.mylibrary.entity.Category;
import com.application.mylibrary.entity.Publisher;
import com.application.mylibrary.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MylibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MylibraryApplication.class, args);
    }

        @Bean
        public CommandLineRunner initialCreate (BookService bookService){
            return (args) -> {

                Book book1 = new Book("ABC", "Book1 name", "My first book");
                Author author1 = new Author("Test name 1", "Test description");
                Category category1 = new Category("category1");
                Publisher publisher1 = new Publisher("First Publisher");
                book1.addAuthor(author1);
                book1.addCategory(category1);
                book1.addPublisher(publisher1);
                bookService.createBook(book1);

                Book book2 = new Book("ABC1", "Book2 name", "My second book");
                Author author2 = new Author("Test name 2", "Test description");
                Category category2 = new Category("category2");
                Publisher publisher2 = new Publisher("Second Publisher");
                book2.addAuthor(author2);
                book2.addCategory(category2);
                book2.addPublisher(publisher2);
                bookService.createBook(book2);

                Book book3 = new Book("ABC21", "Book3 name", "My third book");
                Author author3 = new Author("Test name 3", "Test description");
                Category category3 = new Category("category3");
                Publisher publisher3 = new Publisher("Third Publisher");
                book3.addAuthor(author3);
                book3.addCategory(category3);
                book3.addPublisher(publisher3);
                bookService.createBook(book3);
            };
        }
}
