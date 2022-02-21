package other;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demoregex {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//demoregex g=new demoregex();
		//g.checker("(wiki)");
	    
		//Scanner s=new Scanner(System.in);
		//s.hasNextLine();
		//s.nextLine();
		
		String re="\\d\\d";
		String test="69";
		Pattern pattern=Pattern.compile(re);
		Matcher match=pattern.matcher(test);
		boolean check=match.find();
		System.out.println(check);

		System.out.println("Sample Pattern matcher: "+Pattern.matches("[^amn]", "e"));
		System.out.println("Name pattern matcher: "+Pattern.matches("[MS][a-z]{5}","Monica"));
		System.out.println("Number of times pattern matcher: "+Pattern.matches("[xyz]*","xxyyyz"));
		
		
		    Scanner scan = new Scanner(System.in);
	        int numofinputs = scan.nextInt();
	        int count=0;
	        while(numofinputs>=0)
	        {
	            String t=scan.nextLine();
	            
	            Pattern pattern1= Pattern.compile("hackerrank",Pattern.CASE_INSENSITIVE);
	            Matcher match1=pattern1.matcher(t);
	            
	            
	            if(match1.find()) 
	            {
	            	count++;
	            }
	            numofinputs--;
	        }
	        System.out.println(count);
		
		
	}
	
	public void checker(String Regex_Pattern){
	    System.out.println("Enter the text in which matches are to be found");
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while(m.find()){
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }   

}
