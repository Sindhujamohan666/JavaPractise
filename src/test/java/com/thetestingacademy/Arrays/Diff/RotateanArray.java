package com.thetestingacademy.Arrays.Diff;


public class RotateanArray {
    //Rotate an array left/right by k positions.
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
      int k=3; //no of positions to rotate
      String direction="left";
        System.out.println("Array before rotation:");
        for(int num:arr){
            System.out.println(num);
        }

        k=k% arr.length;
        int[] rotated=new int[arr.length];
        if(direction.equals("right")){
            for(int i=0;i< arr.length;i++){
                rotated[(i+k)% arr.length]=arr[i];
            }
        }
        else if(direction.equals("left")){
            for(int i=0;i<arr.length;i++){
                rotated[i]=arr[(i+k)%arr.length];
            }
        }
        System.out.println("Rotated  " +direction +" by "+k);
        for (int n:rotated){
            System.out.println(n);
        }
    }
}
