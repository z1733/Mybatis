import com.ztt.mapper.EmpployeesMapper;
import com.ztt.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyEmpTest {

    @Test
    public void test1(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        EmpployeesMapper mapper = session.getMapper(EmpployeesMapper.class);
        System.out.println(mapper.getEmpAll());
    }

    @Test
    public void test2(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        EmpployeesMapper mapper = session.getMapper(EmpployeesMapper.class);
        System.out.println(mapper.getEmpAll());
    }

    @Test
    public void test3(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        EmpployeesMapper mapper = session.getMapper(EmpployeesMapper.class);
        System.out.println(mapper.getEmpAndDept(100));
    }

    @Test
    public void test4(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        EmpployeesMapper mapper = session.getMapper(EmpployeesMapper.class);
        System.out.println(mapper.getEmpAndDeptSearTor(100));
        System.out.println(mapper.getEmpAll());
    }
}
