import com.ztt.mapper.BooksMapper;
import com.ztt.pojo.Books;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mytest {

    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(is);
        SqlSession session = build.openSession();
        BooksMapper mapper = session.getMapper(BooksMapper.class);
        int insert = mapper.insert();
        session.commit();
        System.out.println(insert);
    }

    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = build.openSession(true);
        BooksMapper mapper = session.getMapper(BooksMapper.class);
        mapper.updateBooks();
        List<Books> books = mapper.books();
        for (Books book : books) {
            System.out.println(book);
        }
        mapper.deleteBooks();
        List<Books> books2 = mapper.books();
        for (Books book : books2) {
            System.out.println(book);
        }
    }

    @Test
    public void test3() throws IOException {
        InputStream stream = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = build.openSession();
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        Books id = mapper.getBooksId();
        System.out.println(id);
    }
}
