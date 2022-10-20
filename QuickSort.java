package com.jsp.Array;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n= scn.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
		}
		sort(a,0,n-1);
		for(int num:a) {
			System.out.print(num+" ");
		}
	}
		public static void sort(int a[],int start,int end)
		{
			if(start>=end) return;
			int pivot =a[(start+end)/2];
			int i= start, j=end;
			while(i<=j)
			{
				while(a[i]<pivot) i++;
				while(a[j]>pivot) j--;
				if(i<=j)
				{
					int temp=a[i];
					a[i]= a[j];
					a[j]=temp;
					i++;
					j--;
				}
			}
			sort(a,start,j);
			sort(a,i,end);
		}
	}


