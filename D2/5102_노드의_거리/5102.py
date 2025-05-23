# import sys
from collections import deque
# sys.stdin = open("input.txt", "r")

T = int(input())
for test_case in range(1, T + 1):
    v, e = map(int, input().split())
    edges = [[] for _ in range(v + 1)]
    visited = [0] * (v + 1)

    for _ in range(e):
        a, b = map(int, input().split())
        edges[a].append(b)
        edges[b].append(a)

    st, end = map(int, input().split())

    Q = deque()
    Q.append(st)

    while Q:
        cur = Q.popleft()

        for nxt in edges[cur]:
            if visited[nxt] != 0:
                continue

            visited[nxt] = visited[cur] + 1
            Q.append(nxt)

    print(f'#{test_case} {visited[end]}')
