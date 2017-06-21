'''
Created on Jun 12, 2017

@author: vivpa
'''

def main():
    elem, K = map(int, raw_input().split(' '))
    lines = []
    for _ in range(elem):
        lines.append(raw_input())
    for x in lines:
        temp = []
        for y in x:
            asc = ord(y)
            if asc>=65 and asc<=90:
                if asc - K>=65:
                    y = chr(ord(y)-K)
                    temp.append(y)
                else:
                    y = chr(90 + asc -65 -K+1)
                    temp.append(y)
            else:
                temp.append(y)
        print "".join(temp),
            
if __name__ == '__main__':
    main() 