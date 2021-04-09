public class BoardTest {
	public static void main(String[] args) { 
		int[][] seed = { {0, 0, 0, 0, 1}, 
						 {1, 1, 1, 0, 0}, 
						 {0, 1, 0, 1, 0}, 
						 {0, 0, 1, 1, 0}, 
						 {0, 1, 0, 0, 0} };
		Board b = new Board(5, seed); 
		System.out.println(b); 	
		for (int i = 0; i < 10; i++) 
		{ 
			b.tick(); System.out.println(b);
		} 
		}
}