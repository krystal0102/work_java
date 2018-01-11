package exercise;

import java.util.HashMap;
import java.util.Map;

public class ex_08 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = new String[7]; 
		words[0] = "java";
		words[1] = "c";
		words[2] = "java";
		words[3] = "cpp";
		words[4] = "cpp";
		words[5] = "cobol";
		words[6] = "java";
		
		for (int i = 0; i < words.length; i++) {
			Integer num = map.put(words[i], map.get(words[i]));
			if (num == null) {
				map.put(words[i], 1);
			}
			else {
				map.put(words[i], map.get(words[i])+1);
			}	
		}
		for(String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		Integer num2 = map2.put("count", 1);
		System.out.println("count key값의 이전 value값: " + num2 
							+ "/ 현재 count key값의 value값 : "+ map2.get("count"));				
			
 	}

}
