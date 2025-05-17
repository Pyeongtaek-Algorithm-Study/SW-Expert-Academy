#include <iostream>

using namespace std;

int n;
int arr[10][10] = { 0, };
int dx[4] = {0, 1, 0, -1};
int dy[4] = {1, 0, -1, 0};

void snail(int x, int y, int dir, int num) {
    arr[x][y] = num;
    
    if(num == n * n) return;
    int nx = x + dx[dir];
    int ny = y + dy[dir];
    
    if(nx >= 0 && nx < n && ny >= 0 && ny < n && !arr[nx][ny]) snail(nx, ny, dir, num + 1);
    else {
        dir = (dir + 1) % 4;
        snail(x, y, dir, num);
    }
}

int main(int argc, char** argv)
{
    int test_case;
    int T;

    cin>>T;

    for(test_case = 1; test_case <= T; ++test_case)
    {
        cin >> n;
        fill_n(&arr[0][0], 10 * 10, 0);
        snail(0, 0, 0, 1);

        cout << '#' << test_case << '\n';
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                cout << arr[i][j] << ' ';
            }
            cout << '\n';
        }
    }
    return 0;
}