class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        
        string cur="";
        int count=1;
        for(int i=0;i<sentence.size();i++){
            if(sentence[i]==' ')
            {
                size_t pos=cur.find(searchWord);
                if(pos!=string::npos)
                {
              if(pos==0)
                    return count;
                
                
                }count ++;
                cur="";
            }
            else
            cur+=sentence[i];
        }

           size_t pos=cur.find(searchWord);
                if(pos!=string::npos)
                   if(pos==0)
                return count;

                return -1;

    }
};