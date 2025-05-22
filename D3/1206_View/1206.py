for test_case in range(1, 11):
    n = int(input())
    buildings = list(map(int, input().split()))
    ans = 0

    for i in range(2, n - 2):
        side_h = buildings[i-2:i+3]
        side_h.remove(buildings[i])
        diff_h = buildings[i] - max(side_h)
        ans += diff_h if diff_h > 0 else 0

    print(f"#{test_case} {ans}")