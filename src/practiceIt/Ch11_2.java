package practiceIt;

import java.util.Map.Entry;
import java.util.*;

public class Ch11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1= new ArrayList<Integer>();
		ArrayList<Integer> list2= new ArrayList<Integer>();
		for (int i =0; i<10; i++) {
		list1.add(i);
		list2.add(i);
		}
		System.out.println(alternate(list1, list2));
		
		Map<String, String> map =new HashMap<String, String>();
		map.put("Marty", "Stepp");
		map.put("Stuart", "Reges");
		map.put("Jessica", "Miller");
		map.put("Amanda", "Camp");
		map.put("Hal", "Perkins");
		map.put("Bruce", "Perkins");
		//Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
		
		
 		
		System.out.println(map.entrySet());
		System.out.println(isUnique2(map));
	}
public static List<Integer> alternate(List<Integer> list1, List<Integer> list2){
	Iterator<Integer> i1 = list1.iterator();
	Iterator<Integer> i2 = list2.iterator();
	ArrayList<Integer> result = new ArrayList<Integer>();
	
	
	while(i1.hasNext() || i2.hasNext()) {
		if(i1.hasNext())
		result.add(i1.next());
		if(i2.hasNext())
			result.add(i2.next());
	}
	
	return result;
	
}

public static void removeInRange(List<Integer>list, int value, int start, int end) {
	Iterator<Integer> i = list.iterator();
	int index = 0;
	while(i.hasNext()) {
		if(index <end  && index >= start) {
			if(i.next()==value) {
				i.remove();
				index --;
				end --;
			}
		}else {
			i.next();
			
		}
		index++;
	}
	
	//Iterater<Type> i = list.iterator();
	//next(); hasNext(); remove();
	
}




public int countUnique(List<Integer> list) {
	HashSet<Integer> seto= new HashSet<Integer>();
	
	for(int n: list) {
		seto.add(n);
	}
	
	return seto.size();
}

public int common(List<Integer>list1, List<Integer> list2){
	HashSet<Integer> set1 = new HashSet<Integer>();
	HashSet<Integer> set2 = new HashSet<Integer>();
	int count = 0;
	for (int n : set1) {
		if(set2.contains(n))
			count ++;
	}
	return count;
}
public int maxLength(Set<String>set) {
	int max = 0;
	Iterator<String> i = set.iterator();
	
	while(i.hasNext()) {
		String word = i.next();
		if(word.length()>max)
			max= word.length();
	}
	
	return max;
	
}

public boolean hasOdd(Set<Integer> set) {
	Iterator<Integer> i = set.iterator();
	
	while(i.hasNext()) {
		if(i.next()%2!=0)
			return true;// once returned, mothod ends
		else continue;
			
	}
	return false;
	
}

public void removeEvenLength(Set<String> set) {
	Iterator<String> i = set.iterator();
	
	while(i.hasNext()) {
		String word =i.next();
		if(word.length()%2 ==0)
			i.remove();
	}
}

public boolean contains3(List<String> list) {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	for(String str : list) {
		if(map.containsKey(str)){
			map.put(str,map.get(str)+1);
			
			if(map.get(str)==3)
				return true;
			
		}
		else {
			map.put(str, 1);
		}
	}return false;
	
	

		
}

public static boolean isUnique(Map <String, String> map) {
	HashSet<String> set = new HashSet<String>();
	
	for(String key : map.keySet()) {
		String value = map.get(key);
		
		if(set.contains(value)) {
			return false;
		}
		else set.add(value);
	}
	
	return true;
	
	
	}

public static boolean isUnique2(Map <String, String > map) {// my own 
	HashMap<String, Integer> freqValue = new HashMap<String, Integer>();
	
	for(String key : map.keySet()) {
		freqValue.put(map.get(key), 0);
		
		if(freqValue.containsKey(map.get(key)))
		{
			//int count = freqValue.get(key);
			int count = 1;
			count ++;
			freqValue.put(key, count);
		}
	}
	
	//Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
	
	for(String keyFreq : freqValue.keySet()) {
		if(freqValue.get(keyFreq)>=2) {
			return false;
		}
	}
	
	return true;
	
}
}
