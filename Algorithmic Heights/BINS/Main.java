import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{

    public static int binarySearch(int[] arr, int key, int l,int h){
        int m = l + (h - l) / 2;
        while(l<h){
            if(arr[m]==key){
                return m;
            }else if(arr[m]>key){
                return binarySearch(arr, key, l, m);
            }else{
                return binarySearch(arr, key, m+1, h);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            int res = binarySearch(arr,sc.nextInt(),0,n-1);
            res = (res!=-1)?(res+1):(-1);
            System.out.print(res+" ");
        }
        System.out.println();
    }
}
