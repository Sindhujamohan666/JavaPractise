package com.thetestingacademy.String;

public class Isomorphic {
    //Isomorphic p->t, a->i,p->t(again as bef) if this is diff then not isomorphic
    public static void main(String[] args) {
        String s1="paper";
        String s2="title";
        boolean isomorphic=true;
        int n=s1.length();
        for(int i=0;i<n;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            for(int j=0;j<n;j++){
                if(s1.charAt(j)==c1&&s2.charAt(j)!=c2){
                    isomorphic=false;
                    break;
                }
                else if(s2.charAt(j)==c2&&s1.charAt(j)!=c1){
                    isomorphic=false;
                    break;
                }
                if(!isomorphic)
                    break;
            }
        }
        if(isomorphic)
            System.out.println("Isomorphic");
        else
            System.out.println("Non Isomorphic");
    }
}
