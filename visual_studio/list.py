olympic = [[1, '미국', 46, 37, 38, 121],
           [2, '영국', 27, 23, 17, 67],
           [3, '중국', 26, 18, 26, 70],
           [4, '러시아', 19, 18, 19, 55],
           [5, '독일', 17, 10, 15, 42],
           [6, '일본',12, 8, 21, 41],
           [7, '프랑스',10, 18, 14, 42],
           [8, '대한민국', 9,3,9,21]]

print(olympic[0][1], '금메달 개수:', olympic[0][2])
print(olympic[4][1], '금메달 개수:', olympic[4][2])
print()

print(olympic[0][1], '금은동 메달 개수:', olympic[0][2:5])
print(olympic[4][1], '금은동 메달 개수:', olympic[4][2:5])
print()

print(olympic[:4])
print()

for row in olympic:
    print(row)
    
print('금메달보다 은메달이 더 많은 나라')
for r in olympic:
    if r[2] < r[3]:
        print(r[1])
print()
print('동메달보다 은메달이 더 많은 나라')
for r in olympic:
    if r[4] < r[3]:
        print(r[1])
print()

total_gold = 0
for row in olympic:
    total_gold += row[2]
print(total_gold)        

for row in olympic:
    gold = row[2] /row[-1] *100

    if gold > 40:
        print(row[1], gold, '%')