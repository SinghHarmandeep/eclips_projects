
public class ColumnsSort {

	public static double [][] sortColumns(double[][] m){
		double [] s = new double[3];
		
		for(int y = 0; y < m.length; y++) {
			
			for(int x = 0; x < m[0].length; x++) {
			s[x] = m[x][y];//setting the columns to the s array
			System.out.println(s[x]);
			}
			
			int size = s.length;
			for(int i = 0; i < size-1; i++) {
				
				int minInd = i;
				for(int j = i+1; j < size; j++) {
					if(s[j]< s[minInd])
						minInd = j;
				}
				double temp  = s[minInd];
				s[minInd]= s[i];
				s[i]= temp;
				
			}
			for(int k = 0; k < m.length; k++) {
				m[k][y]=s[k];
			}
		}
		
		return m;
	}


	public static void printArray(double[][]n) {
		for(int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[0].length; j ++) {
				System.out.printf("%.3f",n[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}