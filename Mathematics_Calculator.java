import java.util.*;
public class Mathematics_Calculator {
		public int addition(int[] arr) {
			int sum = 0;
			for(int i =0; i<arr.length; i++) {
				sum+=arr[i];
			}
			return sum;	
		}
		public int substraction(int[] arr) {
			int substractor = 0;
			for(int i =0; i<arr.length; i++) {
				substractor-=arr[i];
			}
			return substractor;
		}
		public int multiplication(int[] arr) {
			int multi = 1;
			for(int i = 0; i<arr.length; i++) {
				multi*=arr[i];
			}
			return multi;
		}
		public int Divide(int[] arr) {
			int divider = arr[0];
			for(int i =1; i<arr.length; i++) {
				divider/=arr[i];
			}
			return divider;
		}
		public int Reminder(int[] arr) {
			int quotient = arr[0];
			for(int i =1; i<arr.length; i++) {
				quotient%=arr[i];
			}
			return quotient;
		}
		public void square(int[] arr) {
			int squareNo = 1;
			for(int i =0; i<arr.length; i++) {
			  squareNo = arr[i]*arr[i];
			  System.out.print(squareNo + " ");
			}
			System.out.println();
		}
		public void cube(int[] arr) {
			int cubeNo = 1;
			for(int i =0; i<arr.length; i++) {
			  cubeNo = arr[i]*arr[i]*arr[i];
			  System.out.print(cubeNo + " ");
			}
			System.out.println();
		}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i =0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	Mathematics_Calculator m = new Mathematics_Calculator();
	System.out.println(m.addition(arr));
	System.out.println(m.substraction(arr));
	System.out.println(m.multiplication(arr));
	System.out.println(m.Divide(arr));
	System.out.println(m.Reminder(arr));
	m.square(arr);
	m.cube(arr);
   }
}

