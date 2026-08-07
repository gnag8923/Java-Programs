public class GreatestOfTwo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int greatest;

        if(num1>num2){
            greatest = num1;
        }
        else{
            greatest = num2;
        }

        System.out.println("The greatest number is: "+greatest);
    }
}
