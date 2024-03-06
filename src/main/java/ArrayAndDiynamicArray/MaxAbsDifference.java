package ArrayAndDiynamicArray;

import java.util.Scanner;

public class MaxAbsDifference {

/*    Q1 Given an integer array we need to find the max abs value of f(i,j)=|A[i]-A[j]| + |i-j| for i ,j  indexes
* a=[1,3,-1] ans=5
* */

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("insert the size of array:-" );
        int size = sc.nextInt();
        int count =0;
        int[] arr = new int[size];
        while(count<size){
            System.out.println("insert "+ count  +" element of array  array:-" );
            arr[count]= sc.nextInt();
            count++;
        }

        System.out.println("this is the max max abs difference :- "  + maxAbsDifference(arr));

    }

    /* observation
    * f(i,i) =0
    * f(i,j)=f(j,i) so we can only check i < j
    * so we  can solve question further
    * f(i,j)=|A[i]-A[J]| +(j-i)
    * now we can say either of 2 case will be possible
    * case 1 A[i]<=A[j]
    * f(i,j)=A[j]-A[i] + j - i = (A[j]+j) - (A[i] +i)
    * case 2 A[i]>A[j]
    * f(i,j)=A[j]-A[i] + j - i = (A[i]-i) - (A[j] - j)
    * So the further
    * Ans will be = max((A[j]+j) - (A[i] +i) ; (A[i]-i) - (A[j] - j) )
    * let us assume
    * X = A[i] + i
    * Y = A[i] - i
    * so we can say that
    * Ans = max(Xmax -Xmin ; Ymax - Ymin  )
    * */

    private static int maxAbsDifference(int[] arr) {

        int xmax=  Integer.MIN_VALUE;
        int xmin = Integer.MAX_VALUE ;
        int ymax=  Integer.MIN_VALUE;
        int ymin=  Integer.MAX_VALUE;

        for(int i = 0 ; i< arr.length ; i++){

            if(xmax < arr[i] + i ){
                xmax = arr[i] + i;
            }
            if(xmin > arr[i] + i ){
                xmin = arr[i] + i;
            }
            if(ymax < arr[i] - i ){
                ymax = arr[i] - i;
            }
            if(ymin > arr[i] - i ){
                ymin = arr[i] - i;
            }

        }
        if ((xmax - xmin) > (ymax -ymin) ){
            return  (xmax - xmin);
        }else {
            return (ymax -ymin);
        }
    }

}
