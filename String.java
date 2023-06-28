import javax.xml.transform.Source;
//length() contagem de quantos caractere 
//charAt(x) posiçao da letra da variavel
//substring()
//toUpperCase()
//toLoveCase()
//concat()



public class String {

        public static void main(String[] args) {
            char c;
            String st,st1,st2;
            int i;

            st = "yes";
            c = 'x';           
            st1 = "algoritmos";
            st2 = "Estruturas de dados";
            System.out.printf("var c : %c \n" , c);
            System.out.printf("var st : %s \n" , st);
            System.out.println(st1==st2);
            System.out.println(st1.length()); 
            System.out.println(st1.charAt(st1.length()-2));
            System.out.println(st1.substring(0, 5+1));
            System.out.println(st1.toUpperCase());
            System.out.println(st1.toLoveCase());

            System.out.println(st1.concat(" e ").concat(st2));
            System.out.println(st1 + " e " + st2);


            for(i=0;i<st1.length();i++){
                System.out.println(st1.charAt(i));
            }


        }




    
}
