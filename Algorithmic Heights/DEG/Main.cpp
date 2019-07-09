#include<bits/stdc++.h>
using namespace std;

int main(){
    int v,e;
    cin>>v>>e;
    int arr[v][v];
    for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            arr[i][j]=0;
        }
    }
    for(int i=0;i<e;i++){
        int m,n;
        cin>>m>>n;
        arr[m-1][n-1] = 1;
        arr[n-1][m-1] = 1;
    }
    for(int i=0;i<v;i++){
        int s=0;
        for(int j=0;j<v;j++){
            if(arr[i][j]==1){
                s++;
            }
        }
        cout<<s<<" ";
    }
}
