#include<iostream>
#include <string>

using namespace std;

int main(int argc, char** argv)
{
	int test_case;
	int T = 10;

	for(test_case = 1; test_case <= T; ++test_case)
	{
	    int n;
        cin >> n;
        
        string word, st;
        cin >> word;
        cin.ignore();
        getline(cin, st);
        
        int cnt = 0;

        for(int i = 0; i < st.length() - word.length() + 1; i++) {
            if(st[i] == word[0]) {
                bool find = true;
                
                for(int j = 1; j < word.length(); j++) {
                    if(st[i + j] != word[j]) {
                        find = false;
                        break;
                    }
                }
                if(find) cnt++;
            }
        }
        
        cout << "#" << n << " " << cnt << '\n';
	}
	return 0;
}