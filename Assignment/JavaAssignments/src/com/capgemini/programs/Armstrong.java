package com.capgemini.programs;

public class Armstrong {
public static void main(String[] args) {
	int r,t,s=0;
	int n=371;
	t=n;
	while(n>0) {
		r=n%10;
		n=n/10;
		s=s+(r*r*r);
	}
	if(t==s) 
		System.out.println("The no is Armstrong");
		else 
			System.out.println("The no is not Armstrong");
		}
	}


