public class ArithmeticDemo {
    public static void main(String[] args) {


        //UNARY OPERATOR
//        int a=-5;
//        System.out.println(-a);


        //TERNARY OPERATOR
        //ex1:
       /*    int a=10,b=7;
            System.out.println("ex1:"+(a<b?a:b));
            //ex2:
                System.out.println("ex2:"+(!(a>b)?a+1:b*2));
                //[(a>b)=T ,!=F ,if F therefore b, b*2=14]      */

        //BINARY OPERANDS
      /*  int a=10,b=7;
        System.out.println("a+b is "+(a+b)); // brackets is must, else it works as concatenation
        System.out.println("a-b is "+(a-b)); // brackets is must - opr not in javalang
        System.out.println("a/b is "+a/b);
        System.out.println("a*b is "+a*b);
        System.out.println("a%b is "+a%b);    */

       /* boolean t=true, f=false;
        System.out.println(t+f); //boolean cant have any arithmetic opr */

//        char ch1='A', ch2='B';
//        System.out.println(""+ch1+ch2); //if no "" (empty string) it will print unicode val of A+B

//        int a=10;
//        int result= a++ - --a;
//        System.out.println(result);

        int a=10,b=20;
        int result=a=b - b++ + ++a - a++ * ++b;
        System.out.println(result);

    }
}
