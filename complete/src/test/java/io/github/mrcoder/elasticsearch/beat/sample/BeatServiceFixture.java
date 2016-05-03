package io.github.mrcoder.elasticsearch.beat.sample;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class BeatServiceFixture {

    public void setUpClient(String type) {

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