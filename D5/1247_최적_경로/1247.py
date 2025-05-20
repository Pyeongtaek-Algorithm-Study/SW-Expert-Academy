# import sys
# sys.stdin = open("input.txt", "r")

T = int(input())

ans = float('inf')

def back(cur_coor, cnt, vis, total_distance):
    global ans
    if ans < total_distance:
        return
    if cnt == n:
        total_distance += abs(cur_coor[0] - h_x) + abs(cur_coor[1] - h_y)
        ans = min(ans, total_distance)
        return

    for i in range(n):
        if vis[i]:
            continue

        distance = abs(cur_coor[0] - homes[i][0]) + abs(cur_coor[1] - homes[i][1])
        vis[i] = True
        back(homes[i], cnt + 1, vis, total_distance + distance)
        vis[i] = False

for test_case in range(1, T + 1):
    n = int(input())
    tmp = list(map(int, input().split()))
    h_x, h_y = tmp[0], tmp[1]
    c_x, c_y = tmp[2], tmp[3]
    homes = []
    visited = [False] * n
    for i in range(4, len(tmp), 2):
        homes.append((tmp[i], tmp[i + 1]))

    ans = float('inf')
    back((c_x, c_y), 0, visited, 0)

    print(f"#{test_case} {ans}")
