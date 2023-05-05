import com.ztt.mapper.ParameterMapper;
import com.ztt.pojo.Books;
import com.ztt.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Mytest {

    @Test
    public void test1() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.getAllBooks());
    }

    @Test
    public void test2() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.getUsernameBooks("java"));
    }

    @Test
    public void test3() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.getByBooks("java", 1));
    }

    @Test
    public void test4() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("bookName", "java");
        map.put("bookCounts", 1);
        System.out.println(mapper.getByMap(map));
    }

    @Test
    public void test5() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int i = mapper.setByBooks(new Books(5, "Python", 3, "人工智障"));
        System.out.println(i);
    }

    @Test
    public void test6() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.getByParam("java", 1));
    }
}