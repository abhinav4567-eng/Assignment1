package com.capgemini.programs;
public class Solution3 {
	public static void main(String[] args) {
		String prob="Hello  my   dear   friend";
		String [] st=prob.split("[ ]+");
		for (int i = 0; i < st.length; i++) {
			if(i%2==0)
				st[i]=Solution1.reverse(st[i]);
			System.out.print(st[i]+" ");
		}

	}

}

