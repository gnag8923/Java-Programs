import java.util.Arrays;

public class ZerosInTheEnd {		//Move all the zeros at the end
	public static void main(String[] args) {
		int []arr = {1,3,0,3,2,0,0,3,2,0,4,5,3,0,9};
		
		int index = 0;
		
		for(int num:arr) {
			if(num!=0) {
				arr[index++] = num;
			}
		}
		while(index<arr.length) {
			arr[index++] = 0;
		}
		for(int num:arr) {
			IO.print(num+" ");
		}
		IO.println("\nArray : "+Arrays.toString(arr));
		
	}
}
