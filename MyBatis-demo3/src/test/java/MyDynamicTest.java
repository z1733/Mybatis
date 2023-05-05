
import com.ztt.mapper.DynamicSQLMapper;
import com.ztt.pojo.jobs;
import com.ztt.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyDynamicTest {

    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        System.out.println(mapper.deptList(new jobs(null, "President", null, null)));
    }

    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        System.out.println(mapper.jobs_list(new jobs(null, "", null, null)));
    }

}
