'''
Created on Jun 8, 2017

@author: vivpa
'''

def func(x):
    done = [x]
    iter_ = 0
    while (True):
        x = str(int(x)**2)
        if len(x)!=8:
            x = ('%08d' % int(x))
        x = x[2:6]
        iter_ +=1
        if x in done:
            break
        done.append(x)
        
    return iter_
def main():
    elem = input()
    arr = raw_input().split(' ')
    ans = map(func, arr)
    for i in range(len(ans)):
        print ans[i],
    
    
        

if __name__ == '__main__':
    main()