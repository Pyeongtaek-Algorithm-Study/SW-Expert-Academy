T = int(input())

for test_case in range(1, T + 1):
    n = int(input())
    arr = list(map(int, input().split()))
    dp = [0] * n
    max_num = 0
    
    for i in range(n - 1, -1, -1):
        max_num = max(max_num, arr[i])
        dp[i] = max_num
        
    print(f'#{test_case} {sum(dp) - sum(arr)}')