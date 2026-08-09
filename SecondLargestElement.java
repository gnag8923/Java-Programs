public class SecondLargestElement{
  public static void main(String[] args){
    int [] arr = {12, 22, 32, 44, 11, 54, 76, 77, 86, 34, 37};
    int largest, secLargest;
    if(arr[0] > arr[[1]{
      largest = arr[0];
      secLargest = arr[1];
    }
    else{
      largest = arr[1];
      secLargest = arr[0];
    }

    for(int i = 2; i < arr.length;i++){
      if(arr[i] > largest){
        secLargest = largest;
        largest = arr[i];
      }
      else if(arr[i] > secLargest && arr[i] != largest){
        secLargest = arr[i];
      }
    }
    System.out.println("Second Largest Element in the array is: "+secLargest);
  }
}
