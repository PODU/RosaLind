f = open('rosalind_ini5.txt','r')
a = open('op.txt','a')
i=0
for x in f:
    if(i%2==1):
        a.write(x)
    i=i+1
f.close()
a.close()
