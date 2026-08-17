public class MissingNumber {
	public static void main(String[] args) {
		int []arr = {1,3,4,5,6,7};
		
		int n = arr.length+1;
		int expectedSum = n*(n+1)/2;
		int actualSum=0;
		for(int num:arr) {
			actualSum+=num;
		}
		IO.println("Missing Number: "+(expectedSum-actualSum));
	}
}
