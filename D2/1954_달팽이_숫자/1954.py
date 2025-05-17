T = int(input())

for test_case in range(1, T + 1):
    n = int(input())
    arr = [[0] * n for _ in range(n)]
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    def snail(x, y, d, num):
        arr[x][y] = num
        
        if num == n*n:
            return
        nx = x + dx[d]
        ny = y + dy[d]
        if 0 <= nx < n and 0 <= ny < n and not arr[nx][ny]:
            snail(nx, ny, d, num + 1)
        else:
            d = (d + 1) % 4
            snail(x, y, d, num)
    
    snail(0, 0, 0, 1)
    print(f"#{test_case}")
    for a in arr:
        print(*a)