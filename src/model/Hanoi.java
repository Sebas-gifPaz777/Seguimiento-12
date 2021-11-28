package model;

public class Hanoi {
	
	int begin=1;
	
	public void Hanoi(int n,int start,int temp,int fin,int st,int tm,int fn) {
		if(begin==1) {
			System.out.println(st+""+tm+""+fn);
			begin++;
		}
		if(n==1) {
			st-=1;
			fn+=1;
			System.out.println(st+""+tm+""+fn);
		}
		else {
			Hanoi(n-1,start,fin,temp,st,tm,fn);
			st-=1;
			fn+=1;
			System.out.println(st+""+tm+""+fn);
			Hanoi(n-1,temp,start,fin,st,tm,fn);
		}
	}
	
	
}
