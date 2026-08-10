import java.util.*;

public class Prime {
    public static void main(String[] args) {
        int n = 7;
        boolean check = true;
        if (n <= 1) check = false;
 
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check =  false;
            }
        }
        if(check){
            System.out.print("Number is prime");
        }else{
            System.out.print("Number is not prime");
        }
    }
}
