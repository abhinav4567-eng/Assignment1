package com.capgemini.programs;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] a= {50,60,70,80,90};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"a[i] copying to b[i]"+b[i]);
		}

	}

}
