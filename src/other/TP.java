package other;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		String str[]=new String[N];
		for(int i=0; i<N; i++)
		{
			str[i]=sc.nextLine();
		}

		int K=Integer.parseInt(sc.nextLine());
		for(int j=0; j<K; j++)
		{
			int count=0;
			String TestCase=sc.nextLine();
			String se=TestCase.replace("our","or");
			for(int i=0; i<N; i++)
			{

				Pattern p=Pattern.compile("\\b"+TestCase+"\\b"+"|"+"\\b"+se+"\\b");
				Matcher m=p.matcher(str[i]);
				while(m.find())
				{
					count++;
				}

			}
			System.out.println(count); 

		}

	}

}
