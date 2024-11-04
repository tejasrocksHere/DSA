class Solution {
public:
    string compressedString(string word) {
string ans="";
       int cnt=1;
bool last_ele=false;
int i=0;
int j=0;
      while(i<word.size()){
        bool f=false;
     
        while(word[i]==word[++j])
        {
        if(cnt==9){
     f=true;
break;
        }
        cnt++;


       


        }

         if(f==true){
            ans+='9';
            ans+=word[i];
            cnt=1;

        }
else{
    
        ans+=to_string(cnt);
        ans+=word[i];
        cnt=1;
}
        i=j;
      }
       return ans; 
    }
};