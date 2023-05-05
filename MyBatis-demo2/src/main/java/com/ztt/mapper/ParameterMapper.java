package com.ztt.mapper;

import com.ztt.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface ParameterMapper {

    List<Books> getAllBooks();

    Books getUsernameBooks(String bookname);

    Books getByBooks(String bookname,int bookCount);

    Books getByMap(Map<String, Object> map);

    int setByBooks(Books books);

    Books getByParam(@Param("bookName") String bookName,@Param("bookCount") int bookCount);
}
