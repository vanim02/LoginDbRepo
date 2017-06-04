package levelSimple;

public class ReshapeMatrix {

	/**
	 * You're given a matrix represented by a two-dimensional array,
	 *  and two positive integers r and c representing the row number and
	 *   column number of the wanted reshaped matrix, respectively.
	 *   The reshaped matrix need to be filled with all the elements of the
	 *    original matrix in the same row-traversing order as they were.
	 *    If the 'reshape' operation with given parameters is possible and legal,
	 *     output the new reshaped matrix; Otherwise, output the original matrix.
	 */
	public static void main(String[] args) {
		int[][] num=new int[][]{{2,3},{1,4}};
		int[][] reshaped=reshapeMatrix(num,1,4);
		for(int i=0;i<reshaped.length;i++){
			for(int j=0;j<reshaped[0].length;j++){
				System.out.println(reshaped[i][j]);
			}
			System.out.println("\n");
		}
	}
	private static int[][] reshapeMatrix(int[][] num,int r,int c){
		int row=num.length;
		int col=num[0].length;
		int[][] result = null;
		if(row*col!=r*c)
			return num;
		result=new int[r][c];
		int l=0,m=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				result[l][m]=num[i][j];
				m++;
				if(m==c){
					m=0;
					l++;
				}
			}
		}
		return result;
	}
}
