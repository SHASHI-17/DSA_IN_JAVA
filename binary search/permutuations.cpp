#include<bits/stdc++.h>
using namespace std;

void perm(string &str1,int l,int r){
    if(l==r){
        cout<<str1<<endl;
    }else{
        for(int i=l;i<=r;i++){
            swap(str1[l],str1[i]);
            perm(str1,l+1,r);
            swap(str1[l],str1[i]);
        }
    }
}

int main(){
    string str="abc";
    int n=str.size();

    perm(str,0,n-1);
}