package member.DAO;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MakeSqlSessionFactory {

	static SqlSessionFactory factory;
	static {

		Reader res = null;
		try {
			res = Resources.getResourceAsReader("config.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		factory = new SqlSessionFactoryBuilder().build(res);
	}

	
}
