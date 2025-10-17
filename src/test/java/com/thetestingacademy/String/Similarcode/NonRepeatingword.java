package com.thetestingacademy.String.Similarcode;

public class NonRepeatingword {
    public static void main(String[] args) {
        String str="I will automate this automate code in my automate framework";
        String[] splitstr=str.split(" ");

        for(int i=0;i<splitstr.length;i++){
            int count=0; //for looping count print inside for and declare below first for
            for(int j=0;j<splitstr.length;j++){
                if(splitstr[i].equals(splitstr[j])){
                  count++;
                }
            }
            if (count==1){
                System.out.print(splitstr[i]+" ");
            }
        }

    }
}
