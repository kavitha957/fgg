package Prgm;

import java.util.Scanner;

public class PatternPrinting {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int n=5;
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print((n++)+" ");
		}
		System.out.println();
	}
}
}
