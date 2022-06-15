import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int arr[], int lengthOfArray)
    {
        for(int j=1 ; j<lengthOfArray; j++){
            int key = arr[j];
            int i = j-1;
            while (i>-1 && arr[i]>key)
            {
               arr[i+1]=arr[i];
               i = i - 1;
            }
            arr[i+1]= key;
        }

    }

    static void print(int arr[], int length){
        for (int i = 0; i<length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int length,k;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of array :");
        length = input.nextInt();

        int array[] = new int[length];

        System.out.println("Enter "+length+" elements of the array:");
        for (k=0;k<length;k++){
            array[k]=input.nextInt();
        }

        System.out.println("Before sorting:");
        print(array, length);
        System.out.println("\nAfter sorting:");
        insertionSort(array,length);
        print(array,length);
    }
}
