package FindingRule;

import java.util.Scanner;

public class Q1193 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int cnt=1, i=1, j=1;
		String cmd="right";
		
		while(cnt!=num) {
			switch(cmd) {
			case "right":
				j++;
				cmd="bottom";
				break;
			case "down":
				i++;
				cmd="top";
				break;
			case "top":
				i--;
				j++;
				if(i==1)cmd="right";
				break;
			case "bottom":
				i++;
				j--;
				if(j==1)cmd="down";
				break;
			}
			cnt++;
		}
		System.out.println(i+"/"+j);
	}
}
