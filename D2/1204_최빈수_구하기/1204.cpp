#include<iostream>
#include <map>
#include <vector>
#include <algorithm>

using namespace std;

bool cmp(pair<int, int> a, pair<int, int> b) {
    if(a.second == b.second) {
        return a.first > b.first;
    }
    return a.second > b.second;
}

int main(int argc, char** argv)
{
	int test_case;
	int T;

	cin >> T;

	for(test_case = 1; test_case <= T; ++test_case) {
        int tmp;
        cin >> tmp;
        
        map<int, int> students;
        
        for(int i = 0; i < 1000; i++) {
            int a;
            cin >> a;
            if(students[a]) students[a]++;
            else students[a] = 1;
        }
        
        vector<pair<int, int>> v_s(students.begin(), students.end());
        sort(v_s.begin(), v_s.end(), cmp);
        
        cout << "#" << test_case << ' ' << v_s[0].first << "\n";
	}
	return 0;
}