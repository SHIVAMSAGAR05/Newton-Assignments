n=int(input())
while(n):
    n-=1
    string=input()
    temp=True
    for i in range(len(string)):
        if(string[i] in string[i+1:] and i!=len(string)-1):
            print(string[i])
            temp=False
            break
    if(temp):
        print(-1)