package smaple;


import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int aa=sc.nextInt();
		int first= aa;
		boolean flag= true;
		int cnt=0;
		
		while(flag) {
			int One=aa%10;
			int Ten=aa/10;
			int result=One+Ten;

			int ReOne=result%10;
			int ReTen=result/10;
			String StrResult=One+""+ReOne;
			
			
			if(Integer.parseInt(StrResult)==first) {
				++cnt;
				flag=false;
				System.out.println(cnt);
				break;
			}else {
				aa=Integer.parseInt(StrResult);
				++cnt;
			}

		}
		
	}

	static class Solution { 
		public String[] solution(String[] logs) { 
	     return null;

		}
	}



}

	


