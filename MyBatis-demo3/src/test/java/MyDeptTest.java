import com.ztt.mapper.DepartmentsMapper;
import com.ztt.pojo.departments;
import com.ztt.pojo.jobs;
import com.ztt.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MyDeptTest {

    @Test
    public void test1(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        DepartmentsMapper mapper = session.getMapper(DepartmentsMapper.class);
        System.out.println(mapper.getDeptEmpOne(100));
    }

    @Test
    public void test2(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        DepartmentsMapper mapper = session.getMapper(DepartmentsMapper.class);
        System.out.println(mapper.getDeptEmpOneSartOne(100));
    }

    @Test
    public void test3(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        DepartmentsMapper mapper = session.getMapper(DepartmentsMapper.class);
        System.out.println(mapper.deptList(new jobs(null, "President", null, null)));
    }

    @Test
    public void test4(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        DepartmentsMapper mapper = session.getMapper(DepartmentsMapper.class);
        Integer integer = mapper.deleteDeptById(new Integer[]{1, 2, 3, 4});
        System.out.println(integer);
    }
    @Test
    public void test5(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        DepartmentsMapper mapper = session.getMapper(DepartmentsMapper.class);
        departments departments = new departments(null,"ztt",null,null);
        departments departments2 = new departments(null,"ztty",null,null);
        departments departments3 = new departments(null,"zttw",null,null);

        List<departments> departments1 = Arrays.asList(departments, departments2, departments3);
        System.out.println(mapper.insertDept(departments1));
    }

    @Test
    public void test6() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        DepartmentsMapper mapper = session.getMapper(DepartmentsMapper.class);
        System.out.println(mapper.list());
    }
}
