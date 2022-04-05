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
    public CommandLineRunner initialCreate(BookService bookService) {
        return (args) -> {
            Book book1 = new Book("978-0-385-34994-9", "Lean In: Women, Work and the Will to Lead", "The book challenges us to change the conversation from what women can’t do to what we can do, and serves as a rallying cry for us to work together to create a more equal world.");
            Author author1 = new Author("Sheryl Sandberg", "Sheryl Sandberg is chief operating officer at Meta. ");
            Category category1 = new Category("Memoir");
            Publisher publisher1 = new Publisher("Alfred A. Knopf");
            book1.addAuthor(author1);
            book1.addCategory(category1);
            book1.addPublisher(publisher1);
            bookService.createBook(book1);

                Book book2 = new Book("978-0-525-55538-4", "Turtles All the Way Down", "At its heart is Aza Holmes, a young woman navigating daily existence within the ever-tightening spiral of her own thoughts.");
                Author author2 = new Author("John Green", "John Michael Green is an American author, YouTube content creator, and podcaster. He won the 2006 Printz Award for his debut novel, Looking for Alaska");
                Category category2 = new Category("Novel");
                Publisher publisher2 = new Publisher("Dutton Books");
                book2.addAuthor(author2);
                book2.addCategory(category2);
                book2.addPublisher(publisher2);
                bookService.createBook(book2);

                Book book3 = new Book("0141321873 ", "My Family and Other Animals", "It tells in an exaggerated and sometimes fictionalised way of the years that he lived as a child with his siblings and widowed mother on the Greek island of Corfu between 1935 and 1939.");
                Author author3 = new Author("Gerald Durrell.", "British naturalist, writer, zookeeper, conservationist, and television presenter.");
                Category category3 = new Category("Autobiography");
                Publisher publisher3 = new Publisher("Rupert Hart-Davis");
                book3.addAuthor(author3);
                book3.addCategory(category3);
                book3.addPublisher(publisher3);
                bookService.createBook(book3);
            };
        }
}
