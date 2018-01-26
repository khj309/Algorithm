package FindingRule;

import java.util.Scanner;

public class Q1475 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		Integer[] numCnt= 
			{0,0,0,
					0,0,0,
					0,0,0
			};
		int numSet=0;

		do{
			int n=num%10;
			num/=10;
			if(n==9)n=6;

			numCnt[n]++;
		}while(num>0);
		
		int max=0;
		numCnt[6]=(int) Math.ceil((double)numCnt[6]/2);
		for (Integer integer : numCnt) {
			if(max<integer)max = integer;
		}

		System.out.println(max);
	}
}
