public class JumpStatements {
    public static void main(String[] args) {
        /*for (int i=0;i<=100;i++){
            if (i<70){
                continue;
            }
            System.out.print(i+" ");
        }  */

//to print even numbers;
        for(int i=0;i<=20;i++){
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
