public class Methods {
    public static void  swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a+" b: "+b);
    }

    public static int factorial(int n){
        int value=1;
        for(int i=1;i<=n;i++){
            value=value*i;
        }

        System.out.println("Factorial of "+n+" is "+value);
        return value;
    }

    public static void prime(int n){
        if(n==2){
            System.out.println("Prime");
        }
        else if(n==1){
            System.out.println("Not Prime");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }

    public static void binoamialCoefficient(int n, int r){
        int v1=factorial(n);
        int v2=factorial(r);
        int v3=factorial(n-r);
        int bc=v1/(v2*v3);
        System.out.println("Binomial Coefficient of "+n+"C"+r+" is "+bc);
    }


    public static void main(String[] args) {
        swap(10,15);
        factorial(4);
        binoamialCoefficient(5,2);
        prime(10);

    }
}
