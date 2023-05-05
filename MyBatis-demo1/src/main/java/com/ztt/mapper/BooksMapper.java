package com.ztt.mapper;

import com.ztt.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {

    int insert();

    int updateBooks();

    int deleteBooks();

    List<Books> books();

    Books getBooksId();
}
