public class FindElement {
	public static void main(String[] args) {
		int []arr = {1,3,4,5,6,9,7,10,7,3};
		
		int ele = Integer.parseInt(IO.readln("Enter element to find: "));
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				IO.println("Element found at position: "+i);
				break;
			}
		}
		IO.println("Element no found");
	}
}
