'''
Created on Jun 10, 2017

@author: vivpa
'''

def check(r,c,field):
    if r==1:
        pass
        

def main():
    field = []
    queue = []
    row,col = map(int,raw_input().split(' '))
    for _ in range(row):
        field.append(raw_input().split(' '))
    ans = check(row,col,field)
    print ans       
            
    
    
if __name__ == '__main__':
    main()