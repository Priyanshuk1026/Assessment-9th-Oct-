import java.util.*;
public class matrixOperation {
	public void printmatrix(int[][] matrix, int r, int c) {
		for(int i =0; i<r; i++) {
			for(int j= 0; j<c; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public void addition(int[][]a, int[][]b, int r, int c) {
		int[][] result = new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				result[i][j] = a[i][j]+b[i][j];
			}
		}
		printmatrix(result,r,c);
	}
	
	public void substraction(int[][]a, int[][]b, int r, int c) {
		int[][] result = new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				result[i][j] = a[i][j]-b[i][j];
			}
		}
		printmatrix(result,r,c);
	}
	
	public void multiplication(int[][]a, int[][]b, int n) {
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
		printmatrix(result,n,n);
	}
	
	public void transpose(int[][]a, int r, int c) {
		int[][] result = new int[c][r];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				result[j][i] = a[i][j];
			}
		}
		printmatrix(result,c,r);
	}
	
	public boolean isquare(int r, int c) {
		return r==c;
	}
	
	public boolean isdiagonal(int[][]a, int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i!=j && a[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isidentity(int[][]a, int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i==j && a[i][j]!=1) {
					return false;
				}
				if(i!=j && a[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		matrixOperation obj = new matrixOperation();
		System.out.println("Row & column");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int[][] b = new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		obj.addition(a, b, r, c);
		obj.substraction(a, b, r, c);
		obj.transpose(a, r, c);
		
		 if (obj.isquare(r, c)) {
	            System.out.println("Square matrix.");
	            if (obj.isdiagonal(a, r)) {
	                System.out.println("Diagonal matrix.");
	            } 
	            else {
	                System.out.println("Not a diagonal matrix.");
	            }
	            if (obj.isidentity(a, r)) {
	                System.out.println("Identity matrix.");
	            } 
	            else {
	                System.out.println("Not an identity matrix.");
	            }
	            obj.multiplication(a, b, r);
		 }   
		 else {
			 System.out.println("Not a square matrix.");
		 }
	}

}

