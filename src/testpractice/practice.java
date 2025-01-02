package testpractice;

import java.util.ArrayList;
import java.util.Arrays;


public class practice {

public static void main(String[] args) {
	
String str="agsb6aiudn657auy8";
	
	int sum =0;
	
	StringBuilder build = new StringBuilder();
	
	char[] ch = str.toCharArray();
	
	for(int i=0;i<=ch.length-1;i++)
	{
		if(Character.isDigit(ch[i]))
		{
			build.append(Integer.parseInt(String.valueOf(ch[i])));
		}
		else if(build.length()>0)
		{
		   sum = sum + Integer.parseInt(build.toString());
		   
		   build.setLength(0);
			
		}
		
	}
	
	sum = sum+Integer.parseInt(build.toString());
	
	
	System.out.println(sum);
		
	System.out.println("code is added to check commit");
	/*String str="agsb6aiudn657auy8";
	
	int sum =0;
	
	ArrayList<Integer> ary = new ArrayList<Integer>();
	
	char[] ch = str.toCharArray();
	
	for(int i=0;i<=ch.length-1;i++)
	{
		if(Character.isDigit(ch[i]))
		{
			ary.add(Integer.parseInt(String.valueOf(ch[i])));
		}
	}
	
	for(int num:ary)
	{
		sum = sum+num;
	}
	System.out.println(sum);*/
	
		
   /*int[] arr= {1,2,5,7,3,9,6};
	
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));*/
	}
	}