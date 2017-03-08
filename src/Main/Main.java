package Main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import member.DAO.Dao;
import member.DTO.MemDto;
import member.DTO.Name;

public class Main {
	static Dao dao = new Dao();
	static List<MemDto> list = null;

	public static void main(String[] args) {

		// 1.selectList()
		/*
		 * list = dao.selectAll();
		 * 
		 * for(MemDto memberDto: list){ System.out.println(memberDto); }
		 */

		/*
		 * //2.insert() MemDto memDto = new MemDto(); memDto.setMemberId("김");
		 * memDto.setPassword("가"); memDto.setName("gkgk");
		 * memDto.setEmail("아");
		 * 
		 * dao.insert(memDto);
		 * 
		 * 
		 * //3.delete() int a =dao.delete("a");
		 */

		// 4.update()

		/*
		 * Map<String, String> map = new HashMap<>(); map.put("memberId", "a");
		 * map.put("password", "123");
		 * 
		 * int a = dao.update(map);
		 * 
		 * System.out.println(a);
		 */

		// 5.useIf()

		/*
		 * Name name = new Name(); name.setName("kimdong"); list =
		 * dao.useIf(name); for(MemDto memberDto: list){
		 * System.out.println(memberDto); }
		 */

		// 6.ModifyUserSetIf()
		/*
		 * MemDto memDto = new MemDto(); memDto.setMemberId("tk");
		 * memDto.setPassword("1232"); memDto.setName("modi");
		 * memDto.setEmail("modify@naver.com");
		 * 
		 * int resultNum =dao.modifyUseSetIf(memDto);
		 * System.out.println(resultNum);
		 */

		// 7. useForeach()

		/*
		 * String[] strs = {"modi","kimdong"}; list = dao.useForeach(strs);
		 * 
		 * for(MemDto memberDto: list){ System.out.println(memberDto); }
		 */

		// 8.useLike

		String str = "naver";
		list = dao.useLike(str);
		for (MemDto memberDto : list) {
			System.out.println(memberDto);
		}

	}// 메인 메소드 종료
} // 클래스 종료
