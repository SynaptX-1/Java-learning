// for-each loop , Enhanced for loop , Advanced for loop

public class A03{
    public static void main(String[] args){
        int [][]arr = {{1,2,3},{1,2,3}};
        for(int row[]:arr){
            for(int elem:row){
            System.out.print(" "+elem);
        }
            System.out.println();
        }
    }
}
// not suitable for all the cases we cannot access the elemnts is reverse order or any other order with this approach index not reachable randomly