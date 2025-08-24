N = int(input().strip())
M = int(input().strip())
L = int(input().strip())

answer1 = N + M - L

s = str(N) + str(M) 
nm = int(s)
answer2 = nm - L

print(answer1)
print(answer2)