package week14;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
public class CollectionEx {

	public static void main(String[] args) {
		//ArrayList
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("OOP");
		list.add("객체지향프로그래밍");
		
		System.out.println("리스트 총개수 = " + list.size());
		
		String item = list.get(2);
		System.out.println("리스트 2번 인덱스 값 = " + item);
		
		for(int i =0; i<list.size(); i++)
			System.out.println(i + " = " + list.get(i));
		
		list.remove(1);
		
		for(int i =0; i<list.size(); i++)
			System.out.println(i + " = " + list.get(i));
		
		//Vector
		List<String> Vector = new Vector<String>();
		Vector.add("홍길동");
		Vector.add("이순신");
		for(String s : Vector)
			System.out.println(s);
			
		List<String> linkedList = new LinkedList <String>();
		linkedList.add("apple");
		linkedList.add("melon");
		linkedList.add("banana");
		linkedList.add("apple");
		
		for(String s : linkedList)
			System.out.println(s);
		
		linkedList.remove("apple");
		for(String s : linkedList)
			System.out.println(s);
		
		//Set
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("kiwi");
		set.add("tomato");
		set.add("apple");
		set.add("melon");
		
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		//map
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("nickname", "홍길동");
		map.put("name", "이순신");
		map.put("gender", "남자");
		map.put("age", "25");
		map.put("id", "admin");
		map.put("password", "1234");
		
		//key 만 가져오기 => keySet()
		Set<String> key = map.keySet();
		for(String s : key)
			System.out.println(s + "=" + map.get(s));
		
	}
}
