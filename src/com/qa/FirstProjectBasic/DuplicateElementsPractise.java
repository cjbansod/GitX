package com.qa.FirstProjectBasic;

import java.security.Identity;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;
import com.google.common.base.Functions;

import java.util.Set;
import java.util.function.Function;

public class DuplicateElementsPractise {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        System.out.println(timeConversion("07:05:45 PM"));
        //System.out.println(findgcd(2, 4));
        List<Integer> lst=new ArrayList<Integer>(Arrays.asList(2,4));
        printLCMA(lst);
        //System.out.println(findlcm(2, 4));
        List<Integer> lst1=new ArrayList<Integer>(Arrays.asList(16,32,96));
        printGCDB(lst1);
        System.out.println(generateList());
		String []infra= {"Amazon","GCP","Azure","Amazon","AliBaba","Saucelabs","Azure","GCP"};

		System.out.println("=========Brute Force==========");
		for (int i=0;i<infra.length;i++) 
		{
			for(int j=i+1;j<infra.length;j++) 
			{
				if(infra[i].equals(infra[j])) 
				{
					System.out.println(infra[j]);
				}
			}
		}

		System.out.println("=========Hash Set=============");
		Set<String> hset=new HashSet<String>();
		for (String string : infra) {
			if(hset.add(string)==false) 
			{
				System.out.println(string);
			}
		}


		System.out.println("==========Hash Map=============");
		Map<String, Integer> inframap=new HashMap<String, Integer>();
		for (String string : infra) {
			Integer count=inframap.get(string);
			if(count==null) 
			{
				inframap.put(string, 1);
			}else 
			{
				inframap.put(string, ++count);
			}
		}
          
		Set<Entry<String, Integer>> entryset=inframap.entrySet();
		for(Entry<String, Integer> entry :entryset ) {
			if(entry.getValue()>1) 
			{
				System.out.println(entry.getKey());
			}
		}


		System.out.println("==========Stream Set and filter=============");
		Set<String> dataset=new HashSet<String>();
		Set<String> d= Arrays.asList(infra)
				.stream()
				.filter(e -> dataset.add(e)==false)
				.collect(Collectors.toSet());
		System.out.println(d);
	
	
	System.out.println("==========Stream Grouping By=============");
	        Set<String> gset= Arrays.asList(infra)
	                         .stream()
                                   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                        .entrySet()
                                                .stream()
                                                	.filter(e ->  e.getValue()>1)
	                                                    .map(Map.Entry::getKey)
	                                                         .collect(Collectors.toSet());
	  
    
    
            	System.out.println(gset); 
	 
            	
     System.out.println("==========Stream Frequency=============");
     
     List<String> dest=Arrays.asList(infra);
             
     
                    Set<String> freq=d
                           .stream()
                             .filter(e -> Collections.frequency(dest, e) >1)
                               .collect(Collectors.toSet());
	                  
                    System.out.println(freq);
			   
	
      System.out.println("==========Stream Set and filter=============");
      Set<String> jk=new HashSet<String>();
      
      Set<String> h=Arrays.asList(infra)
              .stream()
               .filter(e -> jk.add(e)==false)
                .collect(Collectors.toSet());
                    
      System.out.println(h);
      
      
	
	}

    
	
	public static String timeConversion(String s) throws ParseException {
	      DateFormat displayFormat = new SimpleDateFormat("hh:mm:ss aa");
	      DateFormat parseFormat = new SimpleDateFormat("HH:mm:ss");
	      Date date = displayFormat.parse(s);
	      String date1= parseFormat.format(date);
		return date1;
	      }

	public static int findgcd(int x,int y) {
		if(y==0) return x;
			
		return findgcd(y, x%y);
		}
	
	public static int findlcm(int x,int y) {
		return (y*x)/findgcd(x, y);
		}
	
	static int a1,b1;
	public static void printLCMA(List<Integer> a) {
	    a1=a.get(0);
	    for(int i=1;i<a.size();i++) {
		a1=findlcm(a1, a.get(i));
		System.out.println(a1);
	}
	}
	
	public static void printGCDB(List<Integer> b) {
        b1=b.get(0);
		for(int i=1;i<b.size();i++) {
			b1=findgcd(b1, b.get(i));
			System.out.println(b1);
		}
		}
	
	public static int generateList() {
	List<Integer> lst=new ArrayList<Integer>();
    int temp=a1;
    int count=0;
    while(temp<=b1) 
    {
      lst.add(temp);
      temp+=a1;
    }
    for (Integer i : lst) {
    	if(b1%i==0)
    		count ++;
    }
    return count;
    }
}


