#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    int array[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            array[i][j] = 0;
        }
    }
    for(int i=0;i<m;i++){
        int x,y;
        cin>>x>>y;
        array[x-1][y-1] = 1;
        array[y-1][x-1] = 1;
    }
    for(int i=0;i<n;i++){
        int sum = 0;
        for(int j=0;j<n;j++){
            if(array[i][j]==1){
                int c = 0;
                for(int k=0;k<n;k++){
                    if(array[j][k]==1){
                        c++;
                    }
                }
                sum = sum + c;
            }
        }
        cout<<sum<<" ";
    }
}
