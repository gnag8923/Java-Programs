public FactorialUsingRecursive{
  public static void main(String[] args){
    int num = IO.readln("Enter the Number: ");  //5
    IO.println("The Factorial of "+num+" is : "+getFactorial(num));  //The Factorial of 5 is : 120
  }
  public static int getFactorial(int num){
    if(num==1){
      return 1;
    }
    return num*getFactorial(num-1);
  }
}
