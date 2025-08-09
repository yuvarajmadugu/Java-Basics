import java.util.Arrays;

public class CodingExercises1DArray {
    static int[] reversedArray(int[] yourArray){
        int rightIndex=yourArray.length-1;
        int halfIndex=yourArray.length/2;
        for (int i=0;i<halfIndex; i++){
            int temp=yourArray[rightIndex];
            yourArray[rightIndex]=yourArray[i];
            yourArray[i]=temp;
            rightIndex--;
        }
        return yourArray; //if return is used, returntype of method is int[]
        //System.out.println(Arrays.toString(yourArray));
        // if sout arr.toString() then returntype is void
    }

    static int[] twoSum(int[] myArray,int num){
        int [] resultArray=new int[2];
        for(int i=0; i<myArray.length; i++){
            for (int j=i+1; j< myArray.length; j++){
                if(num==myArray[i]+myArray[j]){
                    resultArray=new int[] {i,j};
                    return resultArray;
                    //System.out.println("i= "+i+" j= "+j);
                }
            }
        }
        return null;
    }

    static void moveZeros(int[] myArray){
        int i=0;
        for(int j=0; j<myArray.length; j++){
            if (myArray[j]!=0){
                int temp=myArray[j];
                myArray[j]=myArray[i];
                myArray[i]=temp;
                i++;
            }
            System.out.println(Arrays.toString(myArray));
        }
    }

    static void missingNumber(int[] yourArray){
        //broote force approach, makes time complexity=Order(n^2)
        /*int n=yourArray.length;
        for (int i=0; i<=n; i++){   //time complexity=n
            boolean flag=false;
            for (int j=0; j< yourArray.length; j++){  //time complexity=Order(n), Order(nlogn) [minimal time complexity]
                if(i==yourArray[j]) {
                    flag=true;
                    break;
                }
            }
            if (flag==false) {
                System.out.println(i);
            }
        }*/
        //optimal approach:
        int n= yourArray.length;
        int sum=(n*(n+1))/2; //(9*(10))/2=45
        int sumOfArray=0;
        for (int j : yourArray) {
            sumOfArray += j;
        }
        int missingNumber=sum-sumOfArray;
        System.out.println(missingNumber);
    }
    public static void main(String[] args) {
        //refer reversedArray method in class main-
        /* int[]myArray={1,2,3,4,5};
//        System.out.println("yourArray= "+Arrays.toString(myArray));
//        System.out.print("reversedArray= ");
//        reversedArray(myArray);

        //general method:
        for (int i=myArray.length-1;i>=0;i--){
            System.out.print(myArray[i]+" ");
        }  */

//two-sum -LeetCode:
        //refer twosum method in class main-
        /*int [] myArray={1,2,3,4,5};  //index of {1,2,3,4,5}={0,1,2,3,4}
        int target=9;
        //twosum(myArray,target);  //when there is no returntype in if block of code in class-
        System.out.println(Arrays.toString(twoSum(myArray,target)));   */

//move zeros sum -LeetCode:
        /*int [] myArray={0,11,0,3,12};
        moveZeros(myArray);   */

//missing Number in an array:
        int[] myArray={9,6,5,1,0,3,2,4,7};
        missingNumber(myArray);
    }
}
