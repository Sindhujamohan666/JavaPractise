package com.thetestingacademy.String.StringReverse;

public class StringReverseStringBuilder {
    public static void main(String[] args) {
        String[] str={"Jovika","Poovika","Malavika"};
        for(String s:str){
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            System.out.println(sb);
        }
    }
}
/* Output:
akivoJ
akivooP
akivalaM
 */
