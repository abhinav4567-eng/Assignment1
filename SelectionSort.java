package com.capgemini.programs;

public class SelectionSort {
	public static void main(String[] args) {
		int [] a= {48,43,19,17,7,6,26,16};
		int min,temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] +" ");
		}
	}

}
