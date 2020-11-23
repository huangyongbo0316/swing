package demo;

import java.util.Random;
import java.util.Scanner;

public class Tset {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while (true) {			
			System.out.println("请输入:");
			int num=scanner.nextInt();
			if (num==1) {
				int y=(int)(Math.random()*100%100);
				int x=(int)(Math.random()*100%100);
				
				System.out.println("R("+x+","+y+")");
			}
			
		}
		

	}

}

