import csv
import matplotlib.pyplot as plt
f= open('C:\\Users\\user\\Desktop\\Untitled Folder\\card.csv', encoding='utf8')
data = csv.reader(f)
next(data)
data = list(data)
#print(data)
#s_mon = [0,0,0]
#for row in data:
#    if row[-1] == '전표매입':
#        mon, payment = int(row[0].split('-')[1]), int(row[-3])
#        idx = mon - 10
#        s_mon[idx] +=  payment
        
#print(s_mon)
#plt.rc('font', family = 'Malgun Gothic')
#plt.title('10월~12월 지출현황')
#plt.bar(['10월', '11월', '12월'], s_mon, color='royalblue')
#plt.show()

taxi=[0,0,0]
for fow in data:
    if row[-1] == '전표매입' and '택시' in row[5]:
        mon,payment = int(row[0].split('-')[1]), int(row[-3])
        idx = mon -10
        taxi[idx] += payment
print(taxi)

plt.rc('font', family='Malgun Gothic')
plt.title("10~12월 택시비 지출현황")
plt.plot(['10월', '11월','12월'], taxi, color='red', label='택시비 지출액')
plt.legend()
plt.show()