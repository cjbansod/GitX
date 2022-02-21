package com.qa.FirstProjectBasic;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Duplicate elements in array
		String []infra= {"Amazon","GCP","Azure","Amazon","AliBaba","Saucelabs","Azure","GCP"};
	    
		//Brute Force
		System.out.println("*****************Brute Force**********************");
		for(int i=0;i<infra.length;i++) 
		{
			for(int j=i+1;j<infra.length;j++) 
			{
				if(infra[i].equals(infra[j])) 
				{
					System.out.println("Duplicate element present is "+infra[j]);
				}
			}
		}
		
		//HashSet
		System.out.println("*****************Hash Set**************************");
	    Set<String> harm=new HashSet<String>();
	    for(String e: infra) 
	    {
	    	if(harm.add(e) == false) 
	    	{
	    		System.out.println(e);
	    	}
	    }
	    
	    System.out.println("*****************Hash Map**************************");
	    Map<String, Integer> inframap=new HashMap<String, Integer>();
	    for(String e: infra) 
	    {
	    	 Integer count=inframap.get(e);
	    	 if(count == null) 
	    	 {
	    		 inframap.put(e, 1);
	    	 }else 
	    	 {
	    		 inframap.put(e, ++count);
	    	 }
	    }
	    //print duplicate
	    Set<Entry<String,Integer>> entryset =inframap.entrySet();
	    for(Entry<String,Integer> entry : entryset) 
	    {
	    	if(entry.getValue() > 1) 
	    	{
	    		System.out.println(entry.getKey());
	    	}
	    }
	
	    System.out.println("*****************Stream Set and filter**************************");
	    Set<String> dataset=new HashSet<String>();
	    Set<String> hp=
	    Arrays.asList(infra)
	                      .stream()
	                         .filter(e-> !dataset.add(e))
	                             .collect(Collectors.toSet());
	    
	    System.out.println(hp);
	    
	    
	    System.out.println("*****************Stream Grouping By*****************************");
	
	    Set<String> groupset=Arrays.asList(infra)
	    .stream()
	        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	           .entrySet()
	              .stream()
	                .filter(e -> e.getValue() > 1)
	                  .map(Map.Entry::getKey).
	                      collect(Collectors.toSet());
	            
	   System.out.println(groupset);
	   
	   System.out.println("*****************Stream using frequency**************************");
		
	    List<String> freqlist=Arrays.asList(infra);
	    Set<String> freqset= 
	    		freqlist.
	    		      stream()
	                    .filter(e -> Collections.frequency(freqlist,e) > 1)
	                          .collect(Collectors.toSet());
	   System.out.println(freqset);
	    
	}
	

}
