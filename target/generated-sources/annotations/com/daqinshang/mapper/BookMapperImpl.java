package com.daqinshang.mapper;

import co.cantina.spring.jooq.sample.model.tables.records.BooksRecord;
import com.daqinshang.domain.Book;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-03-06T17:33:08+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Book bookRecordsToBook(BooksRecord booksRecord) {
        if ( booksRecord == null ) {
            return null;
        }

        Book book = new Book();

        book.setAuthorName( booksRecord.getAuthor() );
        book.setTitle( booksRecord.getTitle() );

        return book;
    }
}
