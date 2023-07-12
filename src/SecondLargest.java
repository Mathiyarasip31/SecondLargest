
import java.util.Scanner;

public class SecondLargest {

    public static int secMax(int array[],int size,int max,int secondmax) {
        for(int i=0;i<size;i++) {
            if(array[i]>max) {
                secondmax = max;
                max = array[i];
            }
            else if(array[i]>secondmax && array[i]!=max) {
                secondmax = array[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int [n];
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        int results = secMax(array,n,max,secondmax);
        System.out.println(results);
    }

}