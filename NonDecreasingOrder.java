public class NonDecreasingOrder {
	public static void main(String []args) {
		int [] arr = {1, 2,3, 4, 5, 6, 7, 8};
		//int [] arr = {1, 42,33, 34, 23, 12, 55, 56, 38,77};
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("Decreasing Order");
				return;
			}
		}
		System.out.println("In Non-Decreasing Order");
	}
}
