public class BinarySearch {
     static boolean recursiveBinarySearch(int[] sortedArray,int highIndex,int lowIndex, int key)
     {
          int mid = (lowIndex + highIndex) / 2;

          if(lowIndex > highIndex)
               return false;
          else if(key == sortedArray[mid]) {
               System.out.println("Key found at element number "+mid);
               return true;
          }
          else if(key < sortedArray[mid])
               return recursiveBinarySearch(sortedArray,mid-1,lowIndex,key);
          else if(key > sortedArray[mid])
               return recursiveBinarySearch(sortedArray, highIndex, mid+1, key);

          return false;

     }

     public static void main(String[] args)
     {
          int[] array= {1,2,3,4,5,6,7,8,9};
         boolean result = recursiveBinarySearch(array,8, 0, 10);
         if(!result){
              System.out.println("Not found!");
         }
         else {

         }
     }
}
