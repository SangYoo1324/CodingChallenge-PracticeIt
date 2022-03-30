package practiceIt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class MergeNames {
	public static void mapPrac(String[] names1, String[] names2) {
    	List<String> list1 = new ArrayList(Arrays.asList(names1));
    	List<String> list2 = new ArrayList(Arrays.asList(names2));
    	//list1.addAll(list2);
    	
      //  String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
    //    String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
     
    	
    	HashMap<String, Integer> freqChk = new HashMap<String, Integer>();
    	for(String names : list1) {
    		freqChk.put(names, 1);
    	
    		}
    	for(String namest: list2) {
    		
    		if( freqChk.get(namest)==null) {
    			
    			freqChk.put(namest, 1);
    		} else {
    			int i=	freqChk.get(namest);
        		i++;
        		freqChk.put(namest, i);
    		} 
    	}
		
    	Set<String> keySet = freqChk.keySet();
    	for(String key: keySet) {
    		System.out.println(key+"  "+freqChk.get(key));
    	}
    	
    	List <String> finale = new ArrayList<String>();
    	
    	Iterator i = keySet.iterator();
    	while(i.hasNext()){
    	String temp= (String)i.next();
    		if(freqChk.get(temp)==2) {
    			finale.add(temp);
    		}
    			
    			
    		
    	}
    	
    	int finalSize = freqChk.size();
    	System.out.println(finale);
    	
	}
	
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
    	List<String> list1 = new ArrayList(Arrays.asList(names1));
    	List<String> list2 = new ArrayList(Arrays.asList(names2));
    	list1.addAll(list2);
    	
   HashSet <String> uniqueNames = new HashSet<String>();
   Iterator i = list1.iterator();
   while(i.hasNext()) {
	   uniqueNames.add((String) i.next());
	   
	  
   }
   
   int finalSize = uniqueNames.size();
   String [] uniqueNamesToArray = uniqueNames.toArray(new String[finalSize]);
   Arrays.sort(uniqueNamesToArray);
   
   return uniqueNamesToArray;
    	
    	
 /*   	
    	
    List<String> finale = new ArrayList<String>();
   Iterator<String> Keys = freqChk.keySet().iterator();
   while(Keys.hasNext()) {
	   String FinalName =  Keys.next();
	   if(freqChk.get(Keys.next())>1) {
		  finale.add(FinalName);
	   }
	   
   }
   int finaleSize= finale.size();
    	String [] finaleToArray = finale.toArray(new String[finaleSize]);
		return finaleToArray ;
    	
   */ 	
    	
      //  throw new UnsupportedOperationException("Waiting to be implemented.");
        
        
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        MergeNames.mapPrac(names1,names2);
        
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
      
        
    }
}
