import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    
    public static int[] sort(int[] list, int s, int m, int d){
        int i=s,j=m+1,k=0;
        int[] temp1 = new int[d-s+1];
        while(i<=m && j<=d){
            if(list[i]<list[j]){
                temp1[k++] = list[i++];
            }else{
                temp1[k++] = list[j++];
            }
        }
        while(i<=m){
            temp1[k++] = list[i++];
        }
        while(j<=d){
            temp1[k++] = list[j++];
        }
        for(int z=0;z<k;z++){
            list[s+z] = temp1[z];
        }
        return list;
    }

    public static int[] msort(int[] list, int s, int d){
        if(s<d){
            int m = s+(d-s)/2;
            list = msort(list, s, m);
            list = msort(list, m+1, d);
            list = sort(list,s,m,d);
        }
        return list;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++){
            l[i] = sc.nextInt();
        }
        l = msort(l, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(l[i]+" ");
        }
    }
}
