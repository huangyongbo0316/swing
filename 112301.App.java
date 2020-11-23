package demo;

import java.util.Random;
import java.util.Scanner;

public class Tset {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while (true) {			
			System.out.println("请输入:");
			int num=scanner.nextInt();		
			int y=(int)(Math.random()*100%100*num);
			int x=(int)(Math.random()*100%100*num);
			
			System.out.println("R("+x+","+y+")");
		}
		

	}

}
