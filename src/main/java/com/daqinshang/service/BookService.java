package com.daqinshang.service;

import co.cantina.spring.jooq.sample.model.Tables;
import co.cantina.spring.jooq.sample.model.tables.records.BooksRecord;
import com.daqinshang.domain.Book;
import com.daqinshang.mapper.BookMapper;
import lombok.AllArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @Auther: jacobzheng
 * @Date: 2019/2/14 15:40
 * @Description:
 */
@Service
@AllArgsConstructor
public class BookService {

    private final DSLContext dsl;
    private final BookMapper bookMapper;

    public List<Book> getBooks(){
        return dsl.selectFrom(Tables.BOOKS).fetch()
                .map(bookMapper::bookRecordsToBook);

    }

    public String saveBook(){

        BooksRecord record = dsl.newRecord(Tables.BOOKS);
        record.setTitle("你好世界"+ new Random().nextInt());
        record.store();
        return record.toString();
    }

}
