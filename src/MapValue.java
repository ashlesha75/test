import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapValue {

	public static void main(String[] args) {
		Map<String,Integer> map= new LinkedHashMap<String,Integer>();
		
		map.put("Ram", 3);
		map.put("Syam", 2);
		map.put("Ashlesha", 1);
		map.put("Rupali", 6);
		map.put("Ajay", 5);
     Set<Entry<String,Integer>> entry=map.entrySet();
	List<Entry<String,Integer>> list = new LinkedList<Entry<String,Integer>>(entry);
       for(int i=0;i<list.size();i++) {
    	   for(int j=i+1;j<list.size();j++) {
    		   if(list.get(i).getValue()>list.get(j).getValue()) {
    			   Entry<String,Integer> temp=list.get(i);
    			   list.set(i, list.get(i));
    			   list.set(j, temp);
    		   }
    	   }
       }
       System.out.println("Sorted Map value in ascending order:"+map);
       Map<String,Integer> sortedMap = new LinkedHashMap<String,Integer>();
       for(Entry<String,Integer> v:list) {
    	   sortedMap.put(v.getKey(), v.getValue());
       }
       System.out.println(sortedMap);
	}

}
