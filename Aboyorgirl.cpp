#include<iostream>
#include<string>
using namespace std;
int main(){
string f ;
cin >> f;
//cout<< f.length()<<endl;
int sum;


for(int i=0; i<f.length();i++){
  int  count = 0;

  //cout<<f[i];
for(int j = 0 ;j<f.length();j++){
cout<<f[i]<<f[j]<<" ";
    if(f[i]==f[j]&&i>j){
        count++;
        break;

    }
}
     sum=sum+count;
   // cout<<count;

}
//mmcout<<sum<<endl;;
int cal = 0;
cal =f.length()-sum;
//cout<<cal;
if(cal%2!=0){
    cout<<"IGNORE HIM!"<<endl;

}
else
    cout<<"CHAT WITH HER!"<<endl;
}
