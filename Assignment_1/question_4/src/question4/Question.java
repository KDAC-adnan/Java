package question4;

public class Question {

	public static void pyramidPattern(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row - 1 && j<=(2*i-1); j++) {
				System.out.print("*");
			}
//			for(int k=1;k<=(2*i-1);k++)
//			{
//				System.out.print("A");
//			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramidPattern(10);
	}

}
