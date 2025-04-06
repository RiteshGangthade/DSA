public class Array {

    public static void sample(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void mn(int a[]){

        int min=a[0];
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Minimum is "+min);
        System.out.println("Maximum is "+max);
    }

    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7,8};
        sample(a);
        mn(a);
    }
}
