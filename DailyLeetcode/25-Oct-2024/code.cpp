static bool comp(string &a, string &b) {
    return a.size() < b.size();
}

class Solution {
public:
    vector<string> removeSubfolders(vector<string>& folder) {
        vector<string> ans;
        unordered_set<string> st;
        sort(folder.begin(), folder.end(), comp);

        for (auto& s : folder) {
            bool isSubfolder = false;
            for (int j = s.size()-1; j >=0; j--) {
                if (s[j] == '/') {
               

                 
                   string tmp = s.substr(0, j);
                    if (st.find(tmp) != st.end()) {
                        isSubfolder = true;
                        break;
                    }

                   
                }
            }
            if (!isSubfolder) {
                ans.push_back(s);
                st.insert(s);
            }
        }

        return ans;
    }
};
