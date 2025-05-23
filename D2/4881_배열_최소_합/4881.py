# import sys
# sys.stdin = open("input.txt", "r")

T = int(input())
for test_case in range(1, T + 1):
    n = int(input())

    board = [list(map(int, input().split())) for _ in range(n)]

    ans = float('inf')
    def dfs(cnt, vis, sum):
        global ans
        if sum > ans:
            return
        if cnt == n:
            ans = sum
            return

        for i in range(n):
            if vis[i]:
                continue
            vis[i] = True
            dfs(cnt + 1, vis, sum + board[cnt][i])
            vis[i] = False

    dfs(0, [False] * n, 0)
    print(f"#{test_case} {ans}")
