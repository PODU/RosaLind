def ins(n,arr):
    count = 0
    for i in range(n):
        key = arr[i]
        j = i-1
        while(j>=0 and arr[j]>key):
            arr[j+1] = arr[j]
            j-=1
            count+=1
        arr[j+1] = key
    return count

def main():
    n = int(raw_input())
    l = map(int,raw_input().split(" "))
    print(ins(n,l))


main()