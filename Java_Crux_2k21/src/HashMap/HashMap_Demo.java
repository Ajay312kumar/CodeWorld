package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//import com.sun.org.apache.bcel.internal.generic.INEG;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
		map.put("USA", 200);
		map.put("UK", 201);
		map.put("INDIA", 202);
		map.put("CHINA", 203);
		System.out.println(map);
		
		
		
		map.put("sweden", 100);
		System.out.println(map);
	
		map.put("INDIA", 333);
		System.out.println(map);
		
		
		System.out.println(map.get("INDIA"));
		System.out.println(map.get("RASIA"));
        System.out.println(map);	
        
        System.out.println(map.containsKey("INDIA"));
        System.out.println(map.containsKey("USA"));
        
        System.out.println("******KEYS*****");
        Set<String> keys = map.keySet();
        for(String key : keys)
        {
        	System.out.println(key);
        }
        System.out.println("******VALUES******");
        Collection<Integer> values = map.values();
        for(Integer value : values)
        {
        	System.out.println(value);
    
        }
        
        System.out.println("*******EntrySet*******");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
	    for(Map.Entry<String, Integer> entry : entries)  	
	    {
	    	System.out.println(entry.getKey()+ "-->"+ entry.getValue()); 
	    	
	    }
	}
	

}
