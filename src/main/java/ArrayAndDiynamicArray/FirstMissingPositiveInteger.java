package ArrayAndDiynamicArray;
import java.util.Scanner;
public class FirstMissingPositiveInteger {
    /*
    * Given an unsorted integer array, A of size N. Find the first missing positive integer.
    * Note: Your algorithm should run in O(n) time and use constant space.
    *[-8, -7, -6] ans 1
    *[1, 2, 0]   ans 3
    *[3, 4, -1, 1] ans 2
    * */
    public static  void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("insert the size of array:-" );
        int size = sc.nextInt();
        int count =0;
        int[] arr = new int[size];
        while(count<size){
            System.out.println("insert "+ count  +" element of array  array:-" );
            arr[count]= sc.nextInt();
            count++;
        }

        System.out.println("this is the max max abs difference :- "  + firstMissingPositiveInteger(arr));

    }

    private static int firstMissingPositiveInteger(int[] arr) {


        for (int i =0 ; i < arr.length ; i++ ){

            if(arr[i]<= arr.length && arr[i]>0){
                int swap=arr[i];
                while (true){

                    if(swap<= arr.length && swap>0){

                        if(arr[swap-1]!= swap ){
                            int temp = arr[swap-1];
                            arr[swap-1] = swap;
                            swap =temp;

                        }else{
                            break;
                        }

                    } else
                    {
                        break;
                    }

                }

            }

        }


        for (int i =0 ; i < arr.length ; i++ ){

            if (arr[i] != i +1) {
                return i +1;
            }
        }
        return arr.length +1;
        }
    }

