import java.util.Scanner;

// Another represntation
// int []arr= new int[] {1,2,3,4};
// int []arrrr={1,3,4,2};

// 2D Regular Array 
// public class A01 {
//     public static void main(String[] args) {
//         int [][]marks = new int[3][4];
//         Scanner scan = new Scanner(System.in);
//         for(int i =0;i<marks.length;i++){
//             for(int j=0;j<marks[0].length;j++){
//                 marks[i][j]=scan.nextInt();
//             }
//         }
//         for(int i=0;i<marks.length;i++){
//             for(int j=0;j<marks[i].length;j++){
//                 System.out.print(" "+marks[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }


//Below is jagged array
public class A01{
    public static void main(String[] args) {
        int [][][]arr = new int[2][][];
        arr[0] = new int[2][];
        arr[1]=new int[3][];

        arr[0][0]=new int[4];
        arr[0][1]=new int[3];

        arr[1][0]=new int[2];
        arr[1][1]=new int[3];
        arr[1][2]=new int[2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    arr[i][j][k]= sc.nextInt();
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

// in java arrays are guarded with boundaries if u try to surpass the minimum and maximum boundaries it will through an exception "ArrayIndexOutOfBoundException"

// Java is a Robust prog. lanug there would be not be any buffer over problem unlike c lanug

// int --> uses Base2 format to convert the data in 010101....
// float/doouble --> IEEE single precision
// char --> UNICODE