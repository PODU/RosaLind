import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String z = sc.nextLine();
        StringBuilder t = (new StringBuilder(z)).reverse();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='A'){
                t.setCharAt(i,'T');
            }else if(t.charAt(i)=='T'){
                t.setCharAt(i,'A');
            }else if(t.charAt(i)=='C'){
                t.setCharAt(i,'G');
            }else{
                t.setCharAt(i,'C');
            }
        }
        System.out.println(t);
    }
}
