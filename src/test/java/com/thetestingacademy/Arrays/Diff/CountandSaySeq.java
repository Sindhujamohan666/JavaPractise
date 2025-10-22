package com.thetestingacademy.Arrays.Diff;

public class CountandSaySeq {
    //The count-and-say sequence is the sequence of integers with the first five terms as follows:
    // 1, 11, 21, 1211, 111221, ...
    public static void main(String[] args) {
        int n=9;
        String result="1";
        for(int i=1;i<=n;i++){
            System.out.println(i +":"+result


            );
            int count=1;
            StringBuilder next=new StringBuilder();
            for(int j=1;j<result.length();j++){
                if(result.charAt(j)==result.charAt(j-1)){
                    count++;
                }
                else{
                    next.append(count).append(result.charAt(j-1));
                    count=1;
                }
            }
            next.append(count).append(result.charAt(result.length()-1));
            result= next.toString();
        }
    }

    }


