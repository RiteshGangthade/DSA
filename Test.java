public class Test {
    //We can change args name also can pass the arguments through command line
    public static void main(String[] p) {
        System.out.println(p[2]);
        main(new Integer[]{1, 2, 3});
    }
    public static void main(Integer[] args) {
        System.out.println("This is another main method");
    }

}