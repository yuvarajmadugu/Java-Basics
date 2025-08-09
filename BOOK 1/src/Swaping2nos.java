public class Swaping2nos {
    public static void main(String[] args) {
        // with 3rd variable
        int a=20,b=10;
//        int c=a;
//        a=b;
//        b=c;
//        System.out.println(a);
//        System.out.println(b);


        // without 3rd variable with arithme tic opr :
       a+=b;  // a=a+b;  //a=20+10=30
        b=a-b; // b=30-10=20
        a=a-b; // a=30-20=10
        System.out.println(a);
        System.out.println(b);


        // without arithmetic operation and 3rd variable
//        a=a^b;
//        b=b^a;
//        a=b^a;
//        System.out.println(a);
//        System.out.println(b);

    }
}