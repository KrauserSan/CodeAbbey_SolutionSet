'''
Created on Jun 9, 2017

@author: vivpa
'''

def calc(i):
    S,R,P = i
    begin = 0
    while S < R:
        begin +=1
        S += round((S*P/100),2)
    return begin
def main():
    task = []
    for _ in range(input()):
        task.append(map(float,raw_input().split(' ')))
    ans = map(calc,task)
    print " ".join(map(str,ans))
if __name__ == '__main__':
    main()