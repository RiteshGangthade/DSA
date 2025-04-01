import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        String $="Hello World";
        System.out.println($);
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number to check if it is prime or not :");
//        int number=sc.nextInt();
//        JavaBasics.isPrime(number);
//        numPrint(1,20);
//        printSum(5);
//        reverseNum(1234567890);
//        pattern1();
//        pattern2(4);
//        pattern3(5);
        pattern4(4);

    }

    //*
    //**
    //***
    //****
    public static void pattern1(){
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //****
    //***
    //**
    //*
    public static void pattern2(int n){
        for(int line=n;line>=1;line--){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //1
    //12
    //123
    //1234
    public static void pattern3(int n){
        for(int line=1;line<=n;line++){
            for(int number=1;number<+line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }

    //A
    //BC
    //DEF
    //GHIJ
    public static void pattern4(int n){
        char ch='A';
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void reverseNum(int number){
        int reverse=0;
        while(number!=0){
            int lastDigit=number%10;
            reverse=reverse*10+lastDigit;
            number=number/10;

        }
        System.out.println("Reverse of the number is : "+reverse);
    }
    public static void printSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+n+" numbers is : "+sum);
    }

    // Function to print numbers from start to end
    public static  void numPrint(int start, int end){
        int counter=start;
        while(counter<=end){
            System.out.println(counter);
            counter++;
        }
    }
    // Function to check if a number is prime
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
