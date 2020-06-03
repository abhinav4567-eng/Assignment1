package com.capgemini.programs;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] a= {9,8,5,54,5,7,3,7};
		System.out.println("Duplicate elements are");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j])&& (i!=j)) {
					System.out.print(a[j]+" ");
				}
			}
		}
	}

}
