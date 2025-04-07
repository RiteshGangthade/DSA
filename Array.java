public class Array {

    public static void sample(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    //Brute force approach
    public static void subArray(int a[]){
        int count=0;

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i+1;j<a.length;j++){
                int end=j;
                int currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum+=a[k];
                }
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
                System.out.println("Subarray is from "+start+" to "+end+" and sum is "+currentSum);
                count++;
            }
        }
        System.out.println("Maximum sum is "+maxSum);
        System.out.println("Total subarrays are "+count);
    }

   //Optimized approach prefix sum
    public static void subArray2(int a[]){
        int count=0;

        int maxSum=Integer.MIN_VALUE;
        int prefixSum[]=new int[a.length];
        prefixSum[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefixSum[i]=prefixSum[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i+1;j<a.length;j++){
                int end=j;
                int currentSum=start==0?prefixSum[end]:prefixSum[end]-prefixSum[start-1];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
                System.out.println("Subarray is from "+start+" to "+end+" and sum is "+currentSum);
                count++;
            }
        }
        System.out.println("Maximum sum is "+maxSum);
        System.out.println("Total subarrays are "+count);
    }

    public static void kadanesAlgo(int a[]){
        int max=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<a.length;i++){
            cs+=a[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
        }

        System.out.println("Maximum sum is "+max);
    }

    public static void possiblePairs(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                 System.out.println("("+a[i]+","+a[j]+")");
                 count++;
                }
            }

        System.out.println("Total pairs are "+count);
    }

    public static int[] reverseArray(int a[]){
        int start=0;
        int end=a.length-1;
        while(start<=end){
           int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return a;
    }

    public static int binarySearch(int a[], int n){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==n){
                return mid;
            }
            if(a[mid]<n) {
                start = mid + 1;
            }else{
            end=mid-1;}
        }
        return -1;
    }

    public static void largestElement(int a[]){

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
        int a[]= {2,4,6,8,10};
        sample(a);
        largestElement(a);
        int n= binarySearch(a,8);
        if(n==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at "+n);
        }
        int b[]= reverseArray(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        possiblePairs(a);
        subArray(a);
        subArray2(a);
        kadanesAlgo(a);
    }
}
