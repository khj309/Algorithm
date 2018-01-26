package FindingRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2775 {
	public static void main(String[] args) {
		int caseTime;
		List<Integer> result=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		
		caseTime=sc.nextInt();
		
		for(int i=0; i<caseTime; i++) {
			int k=sc.nextInt();
			int n=sc.nextInt();
			result.add(m(k,n));
		}
		
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}
	
	public static int m(int k, int n) {
		if(k==0)return n;
		if(n==1)return 1;
		return m(k, n-1)+m(k-1,n);
	}
}
