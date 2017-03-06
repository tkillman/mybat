package member.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import member.DTO.MemDto;

public class Dao {
	
	List<MemDto> list ;
	
	
	public List<MemDto> selectAll(){
		
		//쿼리를 실행시킬 수 있는 메소드를 가지고 있다.
			SqlSession sqlSession =MakeSqlSessionFactory.factory.openSession();	
		
		// 매개변수로  mapper namespace . select id값을 넣어준다. 
		list=sqlSession.selectList("member.getlist");
		
		sqlSession.close();
		
		return list;
	}
	
		public void  insert(MemDto memDto){
		
		SqlSession sqlSession =  MakeSqlSessionFactory.factory.openSession();
		
		
		
		sqlSession.insert("member.add", memDto);
		sqlSession.commit();
		
		sqlSession.close();
	
	
	}
	
	public int  delete(String memberId){
		int resultNum =-1;
		SqlSession sqlSession =  MakeSqlSessionFactory.factory.openSession();
		
		resultNum =sqlSession.delete("member.del", "a");
		sqlSession.commit();
		sqlSession.close();
	
		return resultNum;
	}
	
	public int update(Map map){
		int resultNum =-1;
		SqlSession sqlSession =  MakeSqlSessionFactory.factory.openSession();
	
		
		resultNum = sqlSession.update("member.Modify",map);
		sqlSession.commit();
		sqlSession.close();
	
		return resultNum;
	}
	
	
}
