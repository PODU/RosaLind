import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int p = arr[0];
        int j = 0;
        int i = 1;
        for(i=1;i<n;i++){
            if(arr[i]<=p){
                j++;
                arr[j] = arr[j] + arr[i] - (arr[i]=arr[j]);
            }
        }
        arr[0] = arr[0] + arr[j] - (arr[j] = arr[0]);
        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
