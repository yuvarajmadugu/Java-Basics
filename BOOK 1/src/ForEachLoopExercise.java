public class ForEachLoopExercise {
    public static void main(String[] args) {
        //print sum of all elements of an integer array using for each loop
        /*int[] numbers={32,88,16,7,65,32};
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println(sum); */

        //count how many times a specific character appears in a given character array
        /*char[] letters={'a','b','c', 'd','a','a'};
        int count=0;
        int target='a';
        for (char ch: letters){
            if (ch ==target){
                count++;
            }
        }
        System.out.println(count);  */

        //print all the even numbers from an integer array
        /*int[] numbers={32,88,16,7,65,32};
        for(int i:numbers){
            if (i%2==0){
                System.out.println(i);
            }
        }*/

        //using traditional for loop print the array from {1234} to {4321}
        /*int []num={1,2,3,4};
        for (int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }*/

        //create String array with 5 colors, use for each loop to print colors, print index of each color
        /*String[] colors={"Orange", "green","blue","yellow","pink"};
        for (String i:colors){
            System.out.println(i);
        }
        int index=0;
        for (String i:colors){
            System.out.println("Index: " + index + ", Color: " + i);
            index++;
        }  */
    }
}
