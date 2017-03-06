package Main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import member.DAO.Dao;
import member.DTO.MemDto;

public class Main {
		static Dao dao = new Dao();
	
	public static void main(String[] args) {
		
		//selectList()
		
		
		List<MemDto> list = dao.selectAll();
		
		for(MemDto memberDto: list){
			
			System.out.println(memberDto);
			
		}
		/*
		//insert()
		
		MemDto memDto = new MemDto();
		memDto.setMemberId("±è");
		memDto.setPassword("°¡");
		memDto.setName("gkgk");
		memDto.setEmail("¾Æ");
		
		dao.insert(memDto);
		
		
		//delete()
		int a =dao.delete("a");
		*/
		
		//update()
		
		/*Map<String, String> map = new HashMap<>();
		map.put("memberId", "a");
		map.put("password", "123");
		
		int a = dao.update(map);
		
		System.out.println(a);*/
		
		
		
	}
	
	
}
