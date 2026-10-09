import java.util.*;
public class Operations {
	
	public void insertion(ArrayList<Integer> list, int value, int position) {
		 if (position < 0 || position > list.size()) {
	            return;
	        }
		 list.add(position, value);
	}
	
	public void deletion(ArrayList<Integer> list, int position) {
		 if (position < 0 || position >= list.size()) {
	            return;
	        }
		 list.remove(position);
	}
	
	public int linearSearch(ArrayList<Integer> list, int value) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)==value) {
				return i;
			}
		}
		return -1;
	}
	
	public void InsertionSort(ArrayList<Integer> list) {
		 for (int i = 1; i < list.size(); i++) {
	            int key = list.get(i);
	            int j = i - 1;
	            while (j >= 0 && list.get(j) > key) {
	                list.set(j + 1, list.get(j));
	                j--;
	            }
	            list.set(j + 1, key);
	        }
	}
	
	public int binarySearch(ArrayList<Integer> list, int value) {
		int low = 0;
		int high = list.size()-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(list.get(mid)== value) {
				return mid;
			}
			else if(list.get(mid) <value) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	public int maximum(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) >max) {
				max = list.get(i);
			}
		}
		return max;
	}
	
	public void EvenOdd(ArrayList<Integer> list) {
		int even = 0;
		int odd = 0;
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) %2==0) {
				even ++;
			}
			else {
				odd++;
			}
		}
		System.out.println("even: " +even);
		System.out.println("Odd: " +odd);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>  list= new ArrayList<>(n);
		Operations obj = new Operations();
		for(int i = 0; i<n; i++) {
			list.add(sc.nextInt());
		}
		int choice;
		do {
			System.out.println("Choice: ");
			choice = sc.nextInt();
			int value;
			int position;
			int result;
			switch(choice) {
			case 1:
				System.out.println("Value: ");
				value = sc.nextInt();
				System.out.println("Position: ");
				position = sc.nextInt();
				obj.insertion((ArrayList<Integer>) list, value, position);
				System.out.println("list: " + list);
				break;
			case 2:
				System.out.println("Position: ");
				position = sc.nextInt();
				obj.deletion((ArrayList<Integer>) list, position);
				System.out.println("Updated list: " + list); 
				break;
			case 3:
				
				value = sc.nextInt();
				result = obj.linearSearch((ArrayList<Integer>) list, value);
				if (result != -1) {
					System.out.println("Found at index: " + result); 
					} 
				else {
					System.out.println("Element not found.");
					} 
				break;
			case 4:
				if (list.isEmpty()) {
					break; 
					}
				obj.InsertionSort((ArrayList<Integer>) list);
				System.out.print("Enter value to search: ");
				value = sc.nextInt();
				result = obj.binarySearch((ArrayList<Integer>) list, value);
				if (result != -1) { 
					System.out.println("Found at index: " + result);
					}
				else { 
					System.out.println("Element not found.");
					}
				break;
			case 5:
				if (list.isEmpty()) { 
					System.out.println("List is empty."); 
					}
				else {
					System.out.println("Maximum: " + obj.maximum((ArrayList<Integer>) list));
				}
				break;
			case 6:
				obj.EvenOdd((ArrayList<Integer>) list);
				break;
			case 7:
				obj.InsertionSort((ArrayList<Integer>) list);
				System.out.println("Sorted list: " + list);
				break;
			default:
				System.out.println("Invalid choice");
		   }
		}
		while(choice !=8);
			sc.close();
		}
	}
