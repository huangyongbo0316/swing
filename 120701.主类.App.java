package pac;

public class App {
	 
	public static void main(String[] args) {
		int array2d[][]={
				{1,2,3,4,5},
				{4,5,6,7,8},
				{8,9,12,0,23},
				{48,69,11,16,24},
				{80,99,15,17,28}
				};
		
		new Find().findZero(array2d);
		new Find().findUp(array2d);
		new Find().findLeft(array2d);
		new Find().findRight(array2d);
		new Find().findDown(array2d);
	}

}
