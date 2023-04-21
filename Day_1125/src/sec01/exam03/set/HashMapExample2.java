package sec01.exam03.set;

import java.util.*;


public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student,Integer>();
		
		map.put(new Student(1, "È«±æµ¿"), 95 );
		map.put(new Student(1, "È«±æµ¿"), 95 );
		map.put(new Student(2, "aaa"), 95 );
		
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			Integer value =map.get(key);
			System.out.println(key.sno+ key.name+":" +value);
		}
		System.out.println("ÃÑ Entry ¼ö : "+ map.size());
		
		}
	}

