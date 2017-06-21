'''
Created on Jun 12, 2017

@author: vivpa
'''

def main():
    matches = []
    my_dict = {'P':'R','R':'S','S':'P'}
    for _ in range(input()):
        matches.append(raw_input().split(' '))
    for x in matches:
        tally = []
        p1 = 0
        p2 = 0
        for y in x:
            if y[1]==my_dict[y[0]]:
                p1+=1
            elif y[0]==my_dict[y[1]]:
                p2 +=1
            else:
                p2+=0
                p1+=0
        print 1 if p1>p2 else 2,
      
if __name__ == '__main__':
    main()