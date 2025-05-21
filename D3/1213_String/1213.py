T = 10

for test_case in range(1, T + 1):
    _ = int(input())
    find_word = input().rstrip()
    string = input().rstrip()
    print(f"#{test_case} {string.count(find_word)}")