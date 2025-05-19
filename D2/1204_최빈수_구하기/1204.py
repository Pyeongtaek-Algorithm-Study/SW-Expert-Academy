from collections import defaultdict
 
T = int(input())

for test_case in range(1, T + 1):
    _ = int(input())
    arr = list(map(int, input().split()))

    dd = defaultdict(int)
    
    for el in arr:
        dd[el] += 1
    
    sorted_dd = sorted(dd.items(), key = lambda x : x[1], reverse = True)
    print(f"#{test_case} {sorted_dd[0][0]}")