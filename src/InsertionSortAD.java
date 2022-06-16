
import java.util.Scanner;

public class InsertionSortAD {
    static void insertionSortA(int arr[], int lengthOfArray)
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

    static void insertionSortD(int arr[], int lengthOfArray)
    {
        for(int j=1 ; j<lengthOfArray; j++){
            int key = arr[j];
            int i = j-1;
            while (i>-1 && arr[i]<key)
            {
                arr[i+1]=arr[i];
                i = i - 1;
            }
            arr[i+1]= key;
        }

    }

    static void print(int array[]){
        int length=array.length;
        for(int i =0; i< length; i++)
        {
            System.out.print(array[i]+" ");
        }


    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int arryLength = 0;

        try {
             arryLength = input.nextInt();
        }
        catch(Exception e) {
            System.out.println("Wrong input type!");
            System.exit(0);
        }

        int array[]= new int[arryLength];
        System.out.println("Enter elements of array:");

        try {
            for(int i =0 ; i< arryLength; i++){
                array[i]=input.nextInt();
            }
        }
        catch(Exception e) {
            System.out.println("Wrong input type!");
            System.exit(0);
        }

        System.out.println("Select 1 to sort in ascending order or 2 for descending: ");

        int expression = 0;
        try {
            expression = input.nextInt();

        }
        catch(Exception e) {
            System.out.println("Wrong input type!");
            System.exit(0);
        }


        while(expression!=1 && expression != 2){
            System.out.println("You have entered wrong order key!");
            System.out.println("Enter again (Select 1 to sort in ascending order or 2 for descending) : ");
            try {
                expression = input.nextInt();

            }
            catch(Exception e) {
                System.out.println("Wrong input type!");
                System.exit(0);
            }
        }

        System.out.println("Before Sorting:");
        print(array);

       switch(expression) {
            case 1:
                insertionSortA(array,arryLength);
                break;
            case 2:
                insertionSortD(array,arryLength);
                break;

        }

        if(expression==1)
        {
            System.out.println("\nAfter Sorting in Ascending order:");
            print(array);

        }
        else if (expression== 2){
            System.out.println("\nAfter Sorting in descending order :");
            print(array);
        }
        else System.out.println("Error Noticed!");


    }
}

