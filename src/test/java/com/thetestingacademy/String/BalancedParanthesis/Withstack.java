package com.thetestingacademy.String.BalancedParanthesis;

import java.util.Stack;

public class Withstack {
    public static void main(String[] args) {
        String s="{[()]}";
        Stack<Character> stack=new Stack<>();
        boolean balanced=true;
        for(char ch: s.toCharArray()){
            if(ch=='{'||ch=='['||ch=='(')
            stack.push(ch);
            else if(ch=='}' &&(stack.isEmpty()||(stack.pop()!='{'))){
                balanced=false;
                break;
            }
            else if(ch==']' &&(stack.isEmpty()||(stack.pop()!='['))){
                balanced=false;
                break;
            }
            else if(ch==')' &&(stack.isEmpty()||(stack.pop()!='('))){
                balanced=false;
                break;
            }

        }
        if(balanced){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }


}
