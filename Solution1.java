package com.capgemini.programs;
public class Solution1 {
public static void main(String[] args) {
	String p="How are you doing";
	String[] s=p.split("[ ]+");
	
	int count=1;
	for (int i = 0; i < s.length; i++) {
		String st=s[i];
		if(i%2!=0 && count%2!=0)
		{String temp1="";
		String temp2="";
			for(int j=0;j<st.length();j++)
			{
				if(j>=st.length()/2)
				temp1=temp1+st.charAt(j);
				else
					temp2=temp2+st.charAt(j);
			}
			s[i]=temp1+temp2;
			count++;
			
		}
		else if(i%2!=0 && count%2==0)
		{
			s[i]=reverse(s[i]);
			
			
		}
	}
	
	for (int i = 0; i < s.length; i++) {
		System.out.print(s[i]+" ");
	}
}
public static String reverse(String str)
{
	StringBuffer sb=new StringBuffer(str);
	
	
	sb.reverse();
	
	
	return sb.toString();
}

}

