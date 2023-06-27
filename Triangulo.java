public class Triangulo{
     
    public static void linhaCaractere(int x){
        int i;
        for(i=0;i<x;i++){
            System.out.printf("*");

        }
        System.out.println();
    }
//public static void triangulo(int n){
    //int i;
    //for(i=n;i>0;i--){
        //linhaCaractere(n);
    //}

//}

    public static void trianguloRec(int n){
        //int i;
        if(n>0){

        //for(i=n;i>0;i--){
            linhaCaractere(n);
            trianguloRec(n-1);
            linhaCaractere(n);
        }

    }
    public static void main(String[] args){
     trianguloRec(5);

    }

}