public class Fibonati {

    public static int Fibonati(int n){
        if(n<=2){
            return 1;
        }
        return Fibonati(n-2)+ Fibonati(n-1);
    }
    public static void main (String[]args){
        
        System.out.println(Fibonati(11));
    }

    
}
