package com.capgemini.programs;
	public class Solution2 {
		public static void main(String[] args) {
			String prob="How  are  you   doing";
			String [] st=prob.split("[ ]+");
			for (int i = 0; i < st.length; i++) {
				st[i]=st[i]+st[i].length();
				System.out.print(st[i]+" ");
			}
			
		}

	}


