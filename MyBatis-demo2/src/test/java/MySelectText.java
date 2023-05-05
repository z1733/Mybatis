import com.ztt.mapper.SelectMapper;
import com.ztt.pojo.Books;
import com.ztt.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MySelectText {

    @Test
    public void test(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = session.getMapper(SelectMapper.class);
        System.out.println(mapper.getBoosById(1));

    }

    @Test
    public void test2(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = session.getMapper(SelectMapper.class);
        System.out.println(mapper.getCount());

    }

    @Test
    public void test3(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = session.getMapper(SelectMapper.class);
        System.out.println(mapper.getBoosById(1));

    }

    @Test
    public void test4(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = session.getMapper(SelectMapper.class);
        System.out.println(mapper.getBooksBy());

    }

    @Test
    public void test5(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = session.getMapper(SelectMapper.class);
        System.out.println(mapper.insertBooks(new Books(null,"C#",3,"拉空间")));

    }
}
