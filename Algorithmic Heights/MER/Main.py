def ins(n1,arr1,n2,arr2):
    count = 0
    res = []
    i,j,k = 0,0,0
    while(i<n1 and j<n2):
        if(arr1[i]<=arr2[j]):
            res.append(arr1[i])
            i+=1
        else:
            res.append(arr2[j])
            j+=1
        k+=1
    while(i<n1):
        res.append(arr1[i])
        i+=1
        k+=1
    while(j<n2):
        res.append(arr2[j])
        j+=1
        k+=1
    return " ".join(list(map(str,res)))

def main():
    n1 = int(raw_input())
    l1 = map(int,raw_input().split(" "))
    n2 = int(raw_input())
    l2 = map(int,raw_input().split(" "))
    print(ins(n1,l1,n2,l2))


main()