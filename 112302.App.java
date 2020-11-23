package demo;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			int y=(int)(Math.random()*100%100);
			int x=(int)(Math.random()*100%100);
			
			System.out.println("R("+x+","+y+")");
		}
		

	}

}
