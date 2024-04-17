import com.hasity.mybatis.entity.Department;
import com.hasity.mybatis.mapper.DepartmentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisApplication3 {
    
    public static void main(String[] args) throws Exception {
        InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取Mapper接口的代理
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = departmentMapper.findById("18ec781fbefd727923b0d35740b177ab");
        int i = departmentMapper.deleteById("18ec781fbe0d35740b177ab");
        System.out.println(department);
        System.out.println(i);
        departmentMapper.insert(new Department("19", "测试部门", "1234356"));
        sqlSession.commit();
        sqlSession.close();
    }
}