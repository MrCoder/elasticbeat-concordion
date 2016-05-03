package io.github.mrcoder.elasticsearch.beat.sample;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import testsupport.SpringifiedConcordionRunner;

@RunWith(SpringifiedConcordionRunner.class)
@ContextConfiguration
@EnableAnnotationConfiguration
public class BeatServiceFixture {

    @Autowired
    public AnotherBean anotherBean;


    public void setUpClient(String type) {
        System.out.println(anotherBean);
    }

    public void indexBook() {

    }

    public Book retrieveTheBook() {
        Book book = new Book();
        book.name = "book name";
        return book;
    }


    class Book {

        public String name;
    }

    class Result {
        public String firstName;
        public String lastName;
    }
}