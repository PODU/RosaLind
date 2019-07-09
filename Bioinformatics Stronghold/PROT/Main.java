import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{

    public static String check(String s){
        if(s.equals("UUU") || s.equals("UUC")){
            return "F";
        }else if(s.equals("CUU") || s.equals("CUC") || s.equals("UUA") || s.equals("CUA") || s.equals("UUG") || s.equals("CUG")){
            return "L";
        }else if(s.equals("AUU") || s.equals("AUC") || s.equals("AUA")){
            return "I";
        }else if(s.equals("AUG")){
            return "M";
        }else if(s.equals("GUU") || s.equals("GUC") || s.equals("GUA") || s.equals("GUG")){
            return "V";
        }else if(s.equals("UCU") || s.equals("UCC") || s.equals("UCA") || s.equals("UCG")){
            return "S";
        }else if(s.equals("CCU") || s.equals("CCC") || s.equals("CCA") || s.equals("CCG")){
            return "P";
        }else if(s.equals("ACU") || s.equals("ACC") || s.equals("ACA") || s.equals("ACG")){
            return "T";
        }else if(s.equals("GCU") || s.equals("GCC") || s.equals("GCA") || s.equals("GCG")){
            return "A";
        }else if(s.equals("CGU") || s.equals("CGC") || s.equals("CGA") || s.equals("CGG") || s.equals("AGG") || s.equals("AGA")){
            return "R";
        }else if(s.equals("GGU") || s.equals("GGC") || s.equals("GGA") || s.equals("GGG")){
            return "G";
        }else if(s.equals("UAU") || s.equals("UAC")){
            return "Y";
        }else if(s.equals("CAU") || s.equals("CAC")){
            return "H";
        }else if(s.equals("AAU") || s.equals("AAC")){
            return "N";
        }else if(s.equals("GAU") || s.equals("GAC")){
            return "D";
        }else if(s.equals("UAA") || s.equals("UAG") || s.equals("UGA")){
            return "Stop";
        }else if(s.equals("CAA") || s.equals("CAG")){
            return "Q";
        }else if(s.equals("AAA") || s.equals("AAG")){
            return "K";
        }else if(s.equals("GAA") || s.equals("GAG")){
            return "E";
        }else if(s.equals("UGU") || s.equals("UGC")){
            return "C";
        }else if(s.equals("AGU") || s.equals("AGC")){
            return "S";
        }else if(s.equals("UGG")){
            return "W";
        }
        return "";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String op = "";
        for(int i=0;i<s.length();i=i+3){
            String a = "" + s.charAt(i) + s.charAt(i+1) + s.charAt(i+2);
            String o = check(a);
            if(o.equals("Stop")){
                break;
            }
            op = op + o;
        }
        System.out.println(op);
    }
}