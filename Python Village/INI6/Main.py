import collections

s = raw_input().split(" ")
asd = dict()
for x in s:
    if(x in asd):
        asd[x] = asd[x]+1;
    else:
        asd[x]=1
asd = collections.OrderedDict(sorted(asd.items()))
for key,val in asd.iteritems():
    print(key+" "+str(val))
