
public class T1 {
	public static void main(String[] args) {
		int[] arr = {10,3,5,18,20};
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
