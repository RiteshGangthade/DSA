import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        String $="Hello World";
        System.out.println($);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not :");
        int number=sc.nextInt();
        JavaBasics.isPrime(number);
    }

    public static void isPrime(int n){

        if(n==2){
            System.out.println(n+" is a prime number");

        }else {
            boolean isPrime = true;
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }
    }
}
