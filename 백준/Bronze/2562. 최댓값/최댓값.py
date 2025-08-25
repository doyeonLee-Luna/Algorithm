nums = [int(input()) for _ in range(9)] 

max_value = nums[0]
index = 1

for j in range(1, 9):
    if nums[j] > max_value:
        max_value = nums[j]
        index = j + 1

print(max_value)
print(index)