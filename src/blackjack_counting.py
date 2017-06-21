'''
Created on Jun 11, 2017

@author: vivpa
'''

def main():
    task = []
    sums = []
    card = {'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9,\
            'T':10,'J':10,'Q':10,'K':10}
    for _ in range(input()):
        task.append(raw_input().split(' '))
    for x in task:
        sum = 0
        count = 0
        for y in x:
            if y =='A':
                count +=1
                continue
            sum += card[y]
        if count==1:
            if sum+11<=21:
                sum = sum+11
            else:
                sum = sum+1
        if count >1:
            if sum + 11 + count -1<=21:
                sum = (sum + 11 + count -1)
            else:
                sum = sum + count
        sums.append(sum)
    for x in sums:
        print x if x<=21 else 'Bust',
if __name__ == '__main__':
    main()