'''
Created on Jun 10, 2017

@author: vivpa
'''
import numpy

def func(i):
    name = i[0]
    dat = map(float,i[1:])
    mean = sum(dat)/len(dat)
    commision = mean/100
    stddev = numpy.std(dat)
    if stddev >= 4*commision:
        return name
    else:
        return ''

def main():
    test = []
    for _ in range(input()):
        test.append(raw_input().split(' '))
    
    ans = map(func,test)
    ans = [x for x in ans if x !='']
    print ' '.join(ans)
    

if __name__ == '__main__':
    main()