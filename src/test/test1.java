package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {

	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

}

public class test1 {

	public static void main(String[] args) {
		List<Map<String,Object>> lp2 = new ArrayList<>();

		for (int i = 1; i <= 4; i++) {
			Map<String, Object> ps = new HashMap<>();

			// ps.setAge(i);
			// ps.setName("동진" + i);
			ps.put("name", "동진" + i);
			ps.put("age", i);

			// lp2.add(ps.get(key));

			lp2.add(ps);
			

		}
System.out.println(lp2.get(2).get("name"));
	}

}
