package pac;

import java.math.BigInteger;

public class number {

	public static void main(String[] args) {
				
		long sum=0;
		for (long i = 1; i <=2147483647; i=i+2) {
			sum=sum+i;
		}
		
		System.out.println("和为："+sum);
	}

}
