
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ztt.mapper.EmpMapper;
import com.ztt.pojo.Emp;
import com.ztt.pojo.EmpExample;
import com.ztt.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MyEmp {

    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        List<Emp> emps = mapper.selectByExample(null);
//        emps.forEach(emp -> System.out.println(emp));

        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andFirstNameEqualTo("Karen").andSalaryGreaterThanOrEqualTo(8000.0);
        empExample.or().andDepartmentIdEqualTo(30);
        System.out.println(mapper.selectByExample(empExample));
    }

    @Test
    public void test2(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        mapper.updateByPrimaryKeySelective(new Emp(100,"ztt","K_ing","ZT",null,"AD_VP",11000.00, null,null,90,null));

    }

    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(1,5);
        List<Emp> emps = mapper.selectByExample(null);
        PageInfo<Emp> empPageInfo = new PageInfo<>(emps, 5);
        System.out.println(empPageInfo);
        for (Emp emp : emps) {
            System.out.println(emp);

        }
    }
}
