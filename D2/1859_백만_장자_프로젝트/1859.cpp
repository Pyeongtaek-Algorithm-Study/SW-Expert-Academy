#include<iostream>
#include <vector>

using namespace std;

int main(int argc, char** argv)
{
	int test_case;
	int T;

	cin>>T;

	for(test_case = 1; test_case <= T; ++test_case) {
        int n;
        cin >> n;
        vector<int> v(n, 0);
        for(int i = 0, a; i < n; i++) cin >> v[i];
        
        int max_num = -1;
        long long v_total = 0, dp_total = 0;
        for(int i = n - 1; i >= 0; i--) {
            max_num = max(max_num, v[i]);
            v_total += v[i];
            dp_total += max_num;
        }
        
        cout << "#" << test_case << " " << dp_total - v_total << '\n';
    }
	return 0;
}