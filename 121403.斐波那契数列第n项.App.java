package pac;

import java.util.Scanner;

public class feibo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入：");
		int n=s.nextInt();
		
		int a=1;//初始值
		int b=1;//初始值
		int c = 0;
		
		if (n<=40) {
				for (int i = 1; i <=n; i++) {														
				a++;
				a=b;
				b++;							
				b=c;
				c=a+b;
				System.out.println(c);
			}
				System.out.println("第"+n+"项的数是："+c);
		}
			
		
	}

}
