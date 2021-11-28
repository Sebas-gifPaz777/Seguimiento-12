package ui;

import java.util.Scanner;

import model.Hanoi;

public class Main {
	
	
	public static void main(String[]args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		Hanoi h= new Hanoi();
		
		System.out.println("How many tests do you want to do?");
		int i=sc.nextInt();
		sc.nextLine();
		
		int[]nb= new int[i];
		
		for(int j=0;j<i;j++) {
			System.out.println("Insert the values #"+(j+1));
			nb[j]=sc.nextInt();
			sc.nextLine();
		}
		
		for(int s=0;s<i;s++) {
			h.Hanoi(nb[s],1,2,3,nb[s],0,0);
			System.out.println("-------------------------");
		}
		
	}
}
