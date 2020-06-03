package com.capgemini.programs;

public class AscendingOrder {
	public static void main(String[] args) {
		int [] a = {10,15,4,8,7,6,5,2};
		int t=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(" "+a[j]+" ");
		}
	}
}
