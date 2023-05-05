package com.ztt.mapper;

import com.ztt.pojo.Books;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface SelectMapper {

    Books getBoosById(@Param("bookId") Integer bookId);

    Integer getCount();

    Map<String,Object> getMapById(@Param("bookId") Integer bookId);

    @MapKey("bookID")
   Map<String,Object> getBooksBy();

    boolean insertBooks(Books books);
}
