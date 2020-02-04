package vechile;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static int add(int[] arr){
        int r=0;
        for(int i=0; i<arr.length; i++){
            r= r+ arr[i];
        }
        return r;
    }

}
