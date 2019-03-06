package com.daqinshang.mapper;

import co.cantina.spring.jooq.sample.model.tables.records.BooksRecord;
import com.daqinshang.domain.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @Auther: jacobzheng
 * @Date: 2019/3/6 17:08
 * @Description:
 */
@Mapper(componentModel = "spring")
public interface BookMapper {
    @Mapping(source = "author",target= "authorName")
    Book bookRecordsToBook(BooksRecord booksRecord);
}
