#include<bits/stdc++.h>
using namespace std;

int main(){
    string s,t;
    cin>>s>>t;
    int diff=0;
    int max;
    if(s.length()>t.length()){
        diff = s.length() - t.length();
        max = t.length();
    }else if(t.length()>s.length()){
        diff = t.length() - s.length();
        max = s.length();
    }else{
        diff = 0;
        max = s.length();
    }
    for(int i=0;i<max;i++){
        if(t[i]!=s[i]){
            diff++;
        }
    }
    cout<<diff<<endl;
}
