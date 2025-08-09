import java.util.Arrays;
import java.util.Scanner;

public class CodingExercises2DArrays {
    static void displaycount(int[][] myArray){
        for (int i=0; i<myArray.length; i++){
            int count=0;
            for (int j=0; j<myArray[i].length; j++){
                count++;
            }
            System.out.println("Row "+(i+1)+" has "+count+" elements.");
        }
    }

    static void calculatesum(int[][] myArray){
        for (int i=0; i<myArray.length; i++){
            int sum=0;
            for (int j=0; j<myArray[i].length; j++){
                sum+=myArray[i][j];
            }
            System.out.println("Row "+(i+1)+" has sum of total "+sum);
        }
    }

    static void maxElement(int[][] myArray){
        for (int i=0; i<myArray.length; i++){
            int max=Integer.MIN_VALUE;
            for (int j=0; j<myArray[i].length; j++){
                if(myArray[i][j]>max){
                    max=myArray[i][j];
                }
            }
            System.out.println("Row "+(i+1)+" max element: "+max);
        }
    }

    static void maxSumRow(int[][] myArray){
        int maxSum=Integer.MIN_VALUE;
        int maxSumRowIndex=-1;
        for (int i=0; i<myArray.length; i++){
            int sum=0;
            for (int j=0; j<myArray[i].length; j++){
               sum+=myArray[i][j];
            }
            System.out.println("Row "+(i+1)+" max element: "+sum);
            if(sum>maxSum){
                maxSum=sum;
                maxSumRowIndex=i;
            }
        }
        System.out.println("Row "+ (maxSumRowIndex+1)+" has max element.");
    }

    public static void main(String[] args) {
//WAP that counts & print total no.of elements in each row of jaggedArray[use methods]
//WAP that counts & print sum no.of elements in each row of jaggedArray[use methods]
//WAP that counts & print max elements in each row of jaggedArray[use methods]
//WAP that counts & print max elements all rows in jaggedArray[use methods]

      int[][] jaggedArray={{1,2,3},{4,5},{6,7,8,9}};
        displaycount(jaggedArray);
        calculatesum(jaggedArray);
        maxElement(jaggedArray);
        maxSumRow(jaggedArray);

//WAP that print 2D Arrays in Matrix format:
        /*int[][] myArray=new int[2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of myArray: ");
        for(int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray[i].length; j++){
                System.out.print("Element["+i+"]["+j+"]: ");
                myArray[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of 2D myArray: ");
        for(int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray[i].length; j++){
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        } */

        //or

        /*Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols=scanner.nextInt();
        int[][] myArray=new int[rows] [cols];
        System.out.println("Enter the elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                myArray[i][j]=scanner.nextInt();
            }
            System.out.println("Printing 2D Array (Matrix): ");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    System.out.print(myArray[i][j]+" ");
                }
                System.out.println();
             } */





//WAP that takes 2D Array of integer as i/p & print the sum of all elements in array:
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] myArray = new int[rows][cols];
        int sum=0;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element["+i+"]["+j+"]: ");
                myArray[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += myArray[i][j];
            }
        }
        System.out.println(sum);  */





//WAP to find and print largest element in 2D Array:
        /*int[][] myArray=new int[2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of myArray: ");
        for(int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray[i].length; j++){
                System.out.print("Element["+i+"]["+j+"]: ");
                myArray[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of 2D myArray(Matrix) : ");
        for(int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray[i].length; j++){
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        int maxElement=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(myArray[i][j]>maxElement){
                    maxElement=myArray[i][j];
                }
            }
        }
        System.out.println("Largest elements in 2D myArray is: "+maxElement); */





//transpose of entered matrix:
        /*int[][] myArray=new int[2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of myArray: ");
        for(int i=0; i<myArray.length; i++){
            for (int j=0; j<myArray[i].length; j++){
                System.out.print("Element["+i+"]["+j+"]: ");
                myArray[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of 2D myArray(Matrix) : ");
        for(int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of 2D myArray(Matrix) : ");
        for(int i=0; i<3; i++){
            for (int j=0; j<2; j++){
                System.out.print(myArray[j][i]+" ");
            }
            System.out.println();
        }  */




//WAP to print multiply 2matrix and print result:

        //Input dimension of first matrix:
        /* Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of rows in first matrix1: ");
        int rows1=sc.nextInt();
        System.out.print("Enter the no.of cols in second matrix1: ");
        int cols1=sc.nextInt();
        int[][] matrix1=new int[rows1][cols1];

        //Input dimension of second matrix:
        System.out.print("Enter the no.of rows in first matrix2: ");
        int rows2=sc.nextInt();
        System.out.print("Enter the no.of cols in second matrix2: ");
        int cols2=sc.nextInt();
        int[][] matrix2=new int[rows2][cols2];

        //condition of multiplying matrices:
        if(cols1!=rows2){
            System.out.println("/n Can't multiply this matrices...!!");
            return;
        }

        //Initializing matrix1:
        System.out.println("Enter elements of matrix1:");
        for(int i=0; i<rows1; i++){
            for (int j=0; j<cols1; j++){
                System.out.print("Element["+i+"]["+j+"]:");
                matrix1[i][j]=sc.nextInt();
            }
        }

        //Initializing matrix2:
        System.out.println("Enter elements of matrix1:");
        for(int i=0; i<rows2; i++){
            for (int j=0; j<cols2; j++){
                System.out.print("Element["+i+"]["+j+"]:");
                matrix2[i][j]=sc.nextInt();
            }
        }

        //Printing matrix1:
        System.out.println("Elements of matrix2:");
        for(int i=0; i<rows1; i++){
            for (int j=0; j<cols1; j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }

        //Printing matrix2:
        System.out.println("Elements of matrix2:");
        for(int i=0; i<rows2; i++){
            for (int j=0; j<cols2; j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        //Initializing matrix3 i.e matrix multiplication:
        //resultant matrix always contains no.of rows1 & cols2
        int[][] matrix3=new int[rows1][cols2];
        for (int i=0; i<rows1; i++){
            for (int j=0; j<cols2; j++){
                int sum=0;
                for (int k=0; k<cols1; k++){
                    sum=sum+(matrix1[i][k]*matrix2[k][j]);
                    matrix3[i][j]=sum;
                }
            }
        }

        //Printing matrix3:
        //resultant matrix always contains no.of rows1 & cols2
        System.out.println("Printing of matrix3: ");
        for (int i=0; i<rows1; i++){
            for (int j=0; j<cols2; j++){
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }    */
    }
}
