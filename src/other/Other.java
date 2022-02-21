package other;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.exec.util.StringUtils;

public class Other 
{

	public static void main(String[] args) 
	{

		String k= "i love java";
		System.out.println("Original String: "+k);
		System.out.println("Capital every first Alphabet and print in reverse order");
		String[] j=k.split(" ");
		String l="";

		for (int i=j.length-1;i>=0;i--) 
		{
			l+=(j[i].charAt(0)+"").toUpperCase()+j[i].substring(1)+" ";    
		}
		System.out.println(l+"\n");


       System.out.println("Reverse all the words ");
		String p="";
		for(String g: j) 
		{	
			for(int w=g.length()-1;w>=0;w--) 
			{
                p+= (g.charAt(w)+"");
			}
			p+=" ";
		}
		System.out.println(p+"\n");
		
		System.out.println("Reverse each word in the same order");
		String p1="";
		int f=j.length-1;
		while(f>=0) 
		{
			p1+=j[f]+" ";
			f--;
		}
		System.out.println(p1);
		
		
		int pal=1221;
		int r=0;
		int sum=0;
		int temp;
		temp=pal;
		while(pal>0) 
		{
			r=pal%10;
			sum=sum*10 + r; 
			pal=pal/10;		
		}
		if(sum==temp) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}

		
		
	}
      
}


