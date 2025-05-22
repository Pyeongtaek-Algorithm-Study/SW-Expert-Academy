#include<cstdio>
#include<iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(int argc, char** argv)
{
	// freopen("input.txt", "r", stdin);

	for(int test_case = 1; test_case <= 10; ++test_case)
	{
		int n;
		cin >> n;
		vector<int> buildings(n);

		for(int i = 0, h; i < n; i++) cin >> buildings[i];
		
		int ans = 0;
		for(int i = 2; i < n - 2; i++) {
			// Solution_1
			// vector<int> sub_buildings(buildings.begin() + (i - 2), buildings.begin() + (i + 3));
			// sub_buildings.erase(sub_buildings.begin() + 2);
			// int views = buildings[i] - *max_element(sub_buildings.begin(), sub_buildings.end());
			
			// Solution_2
			int views = max(max(buildings[i - 2], buildings[i - 1]), max(buildings[i + 1], buildings[i + 2]));
			views = buildings[i] - views;
			ans += (views > 0 ? views : 0);
		}

		cout << "#" << test_case << ' ' << ans << '\n';
	}
	return 0;
}