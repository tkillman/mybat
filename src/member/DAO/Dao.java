package member.DAO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import member.DTO.MemDto;
import member.DTO.Name;

public class Dao {

	List<MemDto> list;

	// selectList()
	public List<MemDto> selectAll() {

		// ������ �����ų �� �ִ� �޼ҵ带 ������ �ִ�.
		SqlSession sqlSession = MakeSqlSessionFactory.factory.openSession();

		// �Ű������� mapper namespace . select id���� �־��ش�.
		list = sqlSession.selectList("member.getlist");

		sqlSession.close();

		return list;
	}

	//insert()
	public void insert(MemDto memDto) {

		SqlSession sqlSession = MakeSqlSessionFactory.factory.openSession();

		sqlSession.insert("member.add", memDto);
		sqlSession.commit();

		sqlSession.close();

	}

	// delete()
	public int delete(String memberId) {
		int resultNum = -1;
		SqlSession sqlSession = MakeSqlSessionFactory.factory.openSession();

		resultNum = sqlSession.delete("member.del", "a");
		sqlSession.commit();
		sqlSession.close();

		return resultNum;
	}

	// update()
	public int update(Map map) {
		int resultNum = -1;
		SqlSession sqlSession = MakeSqlSessionFactory.factory.openSession();

		resultNum = sqlSession.update("member.Modify", map);
		sqlSession.commit();
		sqlSession.close();

		return resultNum;
	}
	
	//useIf
	public List<MemDto> useIf(Name name) {

		// ������ �����ų �� �ִ� �޼ҵ带 ������ �ִ�.
		SqlSession sqlSession = MakeSqlSessionFactory.factory.openSession();

		
		list = sqlSession.selectList("member.useIf",name);

		sqlSession.close();

		return list;
	}
	
	// ModifyUseSetIf
		public int modifyUseSetIf(MemDto memDto) {
			int resultNum = -1;
			SqlSession sqlSession = MakeSqlSessionFactory.factory.openSession();

			resultNum = sqlSession.update("member.ModifyUseSetIf", memDto);
			sqlSession.commit();
			sqlSession.close();

			return resultNum;
		}

		// useForeach()
		public List<MemDto> useForeach(String[] strs) {

			// ������ �����ų �� �ִ� �޼ҵ带 ������ �ִ�.
			SqlSession sqlSession = MakeSqlSessionFactory.factory.openSession();

			// �Ű������� mapper namespace . select id���� �־��ش�.
			list = sqlSession.selectList("member.useForeach", strs);

			sqlSession.close();

			return list;
		}
		
		//useLike
		public List<MemDto> useLike(String str) {

			// ������ �����ų �� �ִ� �޼ҵ带 ������ �ִ�.
			SqlSession sqlSession = MakeSqlSessionFactory.factory.openSession();

			// �Ű������� mapper namespace . select id���� �־��ش�.
			list = sqlSession.selectList("member.useLike", str);

			sqlSession.close();

			return list;
		}

}
