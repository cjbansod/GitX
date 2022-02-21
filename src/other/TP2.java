package other;

import java.util.Scanner;

public class TP2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
   StringBuffer sb=new StringBuffer();
   StringBuffer st=new StringBuffer();
   while(scan.hasNext()) 
    {
	   sb.append(scan.nextLine());
	   sb=sb.append("\n");
	   if(sb.toString().contains("//")) 
	   {
		   int index=sb.indexOf("//");
		   st.append(sb.substring(index+2));
		   //st=st.append("\n");
	   }
    }
    System.out.println(st);
	}

}
