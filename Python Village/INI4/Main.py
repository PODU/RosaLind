a,b = map(int, raw_input().split(" "))
sums=0
while(a<=b):
    if(a%2==1):
        sums = sums+a
    a=a+1
print(sums)
