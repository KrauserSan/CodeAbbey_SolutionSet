'''
Created on Jun 9, 2017

@author: vivpa
'''

def main():
    dat = map(int,raw_input().split(' '))
    ans = []
    for _ in dat:
        x = "{0:08b}".format(_)
        ones = x.count('1')
        if ones%2!=0:
            continue
        else:
            if x[0] == '1':
                x = '0'+ x[1:]
        ans.append(chr(int(x,2)))
    print "".join(ans)

if __name__ == '__main__':
    main()