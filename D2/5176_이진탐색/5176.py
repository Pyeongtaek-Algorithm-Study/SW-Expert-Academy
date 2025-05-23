# import sys
# sys.stdin = open("input.txt", "r")

def bst(idx):
    global num
    if idx > n:
        return

    bst(idx * 2)
    tree[idx] = num
    num += 1
    bst(idx * 2 + 1)

T = int(input())
for test_case in range(1, T + 1):
    n = int(input())
    tree = [0] * (n + 1)

    num = 1
    bst(1)

    print(f"#{test_case} {tree[1]} {tree[n // 2]}")