

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[2][3];
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;

		
//		for (int i = 0; i < 2; i++) {
//			System.out.println();
//			for (int j = 0; j < 3; j++) {
//				System.out.print(matriz[i][j] + " ");
//			}
//		}
		
		for (int[] fila : matriz) {
			System.out.println();
			
			for (int is2 : fila) {
				System.out.print(is2 + " ");
			}
		}
	}

}
