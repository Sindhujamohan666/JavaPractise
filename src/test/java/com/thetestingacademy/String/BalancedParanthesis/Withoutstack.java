package com.thetestingacademy.String.BalancedParanthesis;

public class Withoutstack {
    public static void main(String[] args) {
        String s = "(()())";
        int count=0;
        boolean balanced=true;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }
            else if (ch==')'){
                count--;
            }
            if(count<0){
                balanced=false;
                break;
            }
        }
        //printing
        if(count==0&& balanced){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
}
