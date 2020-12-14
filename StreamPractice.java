

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
	
	public static void main(String args[]) {
		
		Student s1 = new Student(1,"aaa",600);
		Student s2 = new Student(2,"bbb", 6600);
		Student s3 = new Student(4,"bbc", 900);
		Student s7 = new Student(9,"bttbc", 980);
		Student s4 = new Student(1,"aaa", 600);
		Student s5 = new Student(2,"bbb", 6600);
		Student s6 = new Student(4,"bbc", 900);
		
		List<Student> list1 = new ArrayList<Student>();
		List<Student> list2 = new ArrayList<Student>();

		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list2.add(s4);
		list2.add(s5);
		list2.add(s6);
		list1.add(s7);
		
		
		/*
		 * StreamPractice.getMultiplesOf3(); StreamPractice.getEvenNum();
		 * StreamPractice.cooncat2Streams(); StreamPractice.anyMatchExample();
		 * StreamPractice.filterNullvalues(); StreamPractice.getCountOfStrings();
		 * StreamPractice.getStudentNames(); StreamPractice.getDataInSet();
		 * StreamPractice.getScoreAvg(); StreamPractice.hashmapExample();
		 * StreamPractice.sortHashMapByKey(); StreamPractice.sortHashMapbyvalueInDesc();
		 * StreamPractice.getDiscreancyInScore(list1, list2);
		 * StreamPractice.getItemsNotPresentInList2(list1, list2);
		 * StreamPractice.getDistinctItemsFromBothLists(list1, list2);
		 */
		
		//StreamPractice.sortHashMapByValueInAsc();
		StreamPractice.sortHashMapByKey();
		//StreamPractice.sortHashMapbyvalueInDesc();

		StreamPractice.sortHashMapbyvalueInDesc();
	}

	public static void getMultiplesOf3() {
		
		Stream.iterate(1,count->count+1)
			.filter(num->num%3==0)
				.limit(6).forEach(System.out::println);
	}
	
	public static void getEvenNum() {
		Stream.iterate(1, count->count+1)
		.filter(n->n%2==0)
		.limit(5)
		.forEach(System.out::println);
	}
	
	public static void cooncat2Streams() {
		
		List<String>  stream1 = Arrays.asList("aaaa","bbb","ccc");
		List<String>  stream2 = Arrays.asList("ddd","eee","fff");
		Stream<String>  result = Stream.concat(stream1.stream(), stream2.stream());
		result.forEach(System.out::println);
		
	}
	
	
	public static boolean anyMatchExample() {
		
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(1,"Pritam",100));
		list1.add(new Student(2, "Heena", 90));
		list1.add(new Student(3,"Aarez",95));
		
		Predicate<Student> p1 = s->s.name.startsWith("P") && s.score==100;
		boolean b = list1.stream().anyMatch(p1);
		System.out.println(b);
		return b;
	}
	
	
	public static void filterNullvalues() {
		
		List<String> list = Arrays.asList("aaaa","bbbb",null,"cccc");
		list.stream().filter(s->s!=null).forEach(System.out::println);
		//another way
		List<String> list1 = list.stream()
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
		
		list1.forEach(x->System.out.println(x));
	}
	
	public static void getCountOfStrings() {
		List<String> list = Arrays.asList("aaaa","bbbb","cccc","aaaa","ccc");
		Map<String, Long> map = list.stream()
				.collect(Collectors
						.groupingBy(Function.identity(),Collectors.counting()));

		System.out.println(map);
		
	}
	
	public static void getStudentNames() {
		
		
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(1,"Pritam",100));
		list1.add(new Student(2, "Heena", 90));
		list1.add(new Student(3,"Aarez",95));
		
		List<String> names = list1.stream().map(s->s.name).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
	
	public static void getDataInSet() {
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(1,"Pritam",100));
		list1.add(new Student(2, "Heena", 90));
		list1.add(new Student(3,"Aarez",85));
		list1.add(new Student(1,"Saba",90));
		list1.add(new Student(1, "Pritam", 100));
		list1.add(new Student(3,"Aarez",85));
		
		Set<Student> set = list1.stream().filter(n->n.score>85).collect(Collectors.toSet());
		
		set.forEach(System.out::println);
	}
	
	public static void getScoreAvg() {
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(1,"Pritam",100));
		list1.add(new Student(2, "Heena", 90));
		list1.add(new Student(3,"Aarez",85));
	
		int avg = list1.stream().filter(n->n.score>85).collect(Collectors.averagingInt(m->m.score)).intValue();
	

		System.out.println("avg " + avg);
	}
	
	public static void hashmapExample() {
		
		Map<Student,Integer> map = new HashMap<Student, Integer>();
		Student s1 = new Student(1,"aaa", 100);
		Student s2 = new Student(2,"bbb", 110);
		map.put(s1,1);
		map.put(s2,2);
		
		Map<Student, Integer> collect=map.entrySet()
				.stream()
				.filter(m->m.getKey().equals(s1))
						.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		collect.forEach((k,v)-> System.out.println("k " + k + " v " + v));
		
	}
	
	public static void sortHashMapByKey() {
		
		Map<String,Integer> map1 = new HashMap<String, Integer>();
		map1.put("aaa",9);
		map1.put("ccc", 3);
		map1.put("bbb", 5);
		
		Map<String,Integer> output = map1.entrySet()
				.stream().sorted(Collections.reverseOrder(
						Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		output.forEach((k,v)-> System.out.println("k " + k + "v " + v));
		
	}
	
	public static void sortHashMapByValueInAsc() {
		
		Map<Student,Integer> map = new HashMap<Student, Integer>();
		Student s1 = new Student(1,"aaa", 100);
		Student s2 = new Student(2,"bbb", 10);
		map.put(s1,6);
		map.put(s2,2);
		
		Map<Student, Integer> collect=map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry:: getKey,
						Map.Entry::getValue,(sk,sv)->sk,LinkedHashMap::new));
	
		
		collect.forEach((k,v)-> System.out.println("k " + k + " v " + v));
		
	}
	
	public static void sortHashMapbyvalueInDesc() {
		Map<Student,Integer> map = new HashMap<Student, Integer>();
		Student s1 = new Student(1,"aaa", 100);
		Student s2 = new Student(2,"bbb", 800);
		Student s3 = new Student(4,"bbc", 900);
		map.put(s1,6);
		map.put(s2,2);
		map.put(s3, 56);
		
		Map<Student, Integer> map1 = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (sk,sv)->sk, LinkedHashMap::new));
		map1.forEach((k,v)->System.out.println("k" + k + " v" + v));;
	}
	
	/*
	 * public static void getDiscreancyInScore(List<Student> list1, List<Student>
	 * list2) {
	 * 
	 * 
	 * System.out.println("Score Discrepancy is: "); List<Student> list =
	 * list1.stream().filter(two->list2.stream() .anyMatch(one.getId()==two.getId()
	 * && !(one.getScore()==two.getScore()))).collect(Collectors.toList());
	 * 
	 * list.forEach(e-> System.out.println("get id " + e.getId() +
	 * " score discrepancy " + e.getScore())); }
	 */
	
	public static List<Student> getItemsNotPresentInList2(List<Student> list1, List<Student> list2){
		
		List<Student> result = list1.stream().filter(e-> !list2.contains(e)).collect(Collectors.toList());
		
		System.out.println("items present in list1 and not in list2");
		result.forEach(System.out::println);
		return result;
	}
	
	public static void getDistinctItemsFromBothLists(List<Student> list1,List<Student> list2) {
		
		
		System.out.println("Distinct items list");
		List<Student> result = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		result.forEach(System.out::println);
	}
	
	
}
