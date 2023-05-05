import com.ztt.mapper.SqlMapper;
import com.ztt.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MySqlTest {

    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        System.out.println(mapper.list("L"));
    }

    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        System.out.println(mapper.deleteById("206,207,208"));
    }
    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        System.out.println(mapper.getEmpByID("employees"));
    }
}
