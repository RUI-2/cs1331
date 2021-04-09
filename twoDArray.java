public class twoDArray {
	public static void main(String[] args) {
		int[][] TDArray = new int[Integer.valueOf(args[0])][];  //ten rows
		for (int i = 0; i < TDArray.length; i++) { 
			//for each row
			TDArray[i] = new int[i];
			for (int j = 0; j < TDArray[i].length; j++) {
				TDArray[i][j] = i * j;
				System.out.printf("%4d", TDArray[i][j]);
			}
		System.out.println();
		}

	}
}