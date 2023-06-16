package network.com.ict.edu;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// json : xml 과 함께 정보를 전달할 때 사용
//		  JavaScript Object Notation(JSON) : 데이터 교환 포멧
//		  json_simple 라이브러리 다운받기

public class Ex05 {
	public static void main(String[] args) {
		String jsonData = "{\"Persons\":[{\"name\":\"고경태\",\"age\":\"30\",\"블로그\":\"ktko.tistory.com\",\"gender\":\"남자\"},"
				+ " {\"name\":\"이홍준\",\"age\":\"31\",\"블로그\":\"없음\",\"gender\":\"남자\"},"
				+ " {\"name\":\"서정윤\",\"age\":\"30\",\"블로그\":\"없음\",\"gender\":\"여자\"}],"
				+ " \"Books\":[{\"name\":\"javascript의모든것\",\"price\":\"10000\"},"
				+ "{\"name\":\"java의모든것\",\"price\":\"15000\"}]}";
		
		try {
			JSONParser jsonParser = new JSONParser();
			// jsonParser에 json 데이터를 넣어 파싱한 다음 jSONObject로 변환한다.
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonData);
			
			// person이 배열로 되어 있으므로 JSONArray
			JSONArray personArray = (JSONArray) jsonObj.get("Persons");
			
			for (int i = 0; i < personArray.size(); i++) {
				System.out.println("===== persons :" + i + " =======");
				JSONObject person_obj = (JSONObject) personArray.get(i);
				System.out.print(person_obj.get("name") + "\t");
				System.out.print(person_obj.get("age")+ "\t");
				System.out.println(person_obj.get("gender"));
			}
			
			System.out.println();
			System.out.println("========================");
			System.out.println();
			
			JSONArray booksArray = (JSONArray) jsonObj.get("Books");
			for (int i = 0; i < booksArray.size(); i++) {
				System.out.println("===== Books :" + i + " =======");
				JSONObject book_obj = (JSONObject) booksArray.get(i);
				System.out.print(book_obj.get("name") + "\t");
				System.out.println(book_obj.get("price"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		
		}
}
