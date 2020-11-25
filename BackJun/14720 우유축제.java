package smaple;


import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int v=scanner.nextInt();
		
		int [] a=new int[1001];
		for(int i=0;i<v;i++) {
			a[i]=scanner.nextInt();
		}
		int []b= {0,1,2};
		int answer=b[0];
		int cnt=0;
		for(int i=0;i<v;i++) {
			if(a[i]==answer) {
				++cnt;
				int ee=cnt%3;
				answer=b[ee];
			}
		}
		System.out.print(cnt);
		
	}

	static class Solution { 
		public String[] solution(String[] logs) { 
	     return null;

		}
	}



}

	


