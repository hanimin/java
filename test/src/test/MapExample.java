package test;
//HashMap에아이디(String)와점수(Integer)가저장되어있습니다. 
//실행결과와같이평균점수를출력하고최고점수와최고점수를받은아이디를출력해보세요
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();


		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key =entry.getKey();
			Integer value = entry.getValue();
			totalScore += value;
			if(value > maxScore) {
				maxScore = value;
				name = entry.getKey();
			}
		}	
	
		int avg = totalScore/3;
		
		System.out.println("평균점수: " + avg);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
	
}

