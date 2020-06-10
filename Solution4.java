package com.capgemini.programs;
public class Solution4 {
	public static void main(String[] args) {
		String prob="Hello  my   dear  best  friend";
		String [] st=prob.split("[ ]+");
		String [] st2=new String[st.length];
		for (int i = 0; i < st.length; i++) {
			if(i%2==0 && i+2<st.length)
				st2[i+2]=st[i];
			else if(i%2==0)
			{
				st2[0]=st[i];
			}
			else
				st2[i]=st[i];
			
			
		}
		for (int i = 0; i < st2.length; i++) {
			System.out.print(st2[i]+" ");
		}

	}

}
