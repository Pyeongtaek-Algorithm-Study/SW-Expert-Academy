#include<iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(int argc, char** argv)
{
	int test_case;
	int T;
	cin>>T;

    int n = -1;
	for(test_case = 1; test_case <= T; ++test_case) {
        cin >> n;
        
        int h_x, h_y, c_x, c_y;
        cin >> h_x >> h_y >> c_x >> c_y;
        
        vector<pair<int, int>> coor;
        for(int i = 0, x, y; i < n; i++) {
            cin >> x >> y;
            coor.push_back({x, y});
        }
        
        sort(coor.begin(), coor.end());
        
        int ans = 1e9;
        do {
            pair<int, int> cur = {c_x, c_y};
            int total_distance = 0;
            bool chk = false;
            
            for(int i = 0; i < coor.size(); i++) {
                int distance = abs(cur.first - coor[i].first) + abs(cur.second - coor[i].second);
                cur = coor[i];
                total_distance += distance;
                
                if(ans < total_distance) {
                    chk = true;
                    break;
                }
            }
            
            // 마지막 배달 후, 집으로 도착
            total_distance += abs(cur.first - h_x) + abs(cur.second - h_y);
            
            // 집까지 도착하는 것까지 최소길이를 저장
            ans = min(ans, total_distance);
        } while(next_permutation(coor.begin(), coor.end()));
        
        cout << "#" << test_case << ' ' << ans << '\n';
	}
	return 0;
}