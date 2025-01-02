package testpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class test {
	
	public static void main(String[] args) {
		
		String str="agsb6aiudn657auy8";
		
		int sum =0;
		
		StringBuilder build = new StringBuilder();
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				build.append(String.valueOf(ch[i]));
			}
			else if(build.length()>0)
			{
			   sum = sum + Integer.parseInt(build.toString());
			   
			   build.setLength(0);
				
			}
			
		}
		
		sum = sum+Integer.parseInt(build.toString());
		
		
		System.out.println(sum);

	}
		/*String str = "abc";
		permute(str, "");
		}
		
	
	static void permute(String str, String prefix) {
			
		if (str.length() == 0) 
		{
		System.out.println(prefix);
		} 
		else 
		{
		
			for (int i = 0; i < str.length(); i++)
			{
		    String rem = str.substring(0,i) + str.substring(i+1);
		    permute(rem,prefix + str.charAt(i));
		    }
		}
		}*/

	/*public static void main(String[] args) {

		String str = "abc";
		String prefix = "";
		
		permute(str,prefix);
				
	}
	
	public static void permute(String txt, String add)
			{
		
		for(int i=0;i<=txt.length()-1;i++)
		{
			String rem = txt.substring(0,i) + txt.substring(i+1);
			System.out.println(rem);
			permute(rem,add+txt.charAt(i));
		}
			}*/
}


