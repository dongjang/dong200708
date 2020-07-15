package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

	
	
	public static void main(String[] args) {
		
		
		List<Map<String,Object>> mList = new ArrayList<>();
		Map<String,Object> mMap = new HashMap();
		
		mMap.put("하나", 1);
		mMap.put("둘", 2);
		mMap.put("셋", 3);
		
		
		mList.add(mMap);
		
		
		
		
		
	System.out.println(mMap.get(""));
	System.out.println(mList.get(0).get(""));
	
	
	}
}
