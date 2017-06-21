'''
Created on Jun 9, 2017

@author: vivpa
'''

def main():
    arr_len = input()
    arr = map(int,raw_input().split(' '))
    new_arr = sorted(arr)
    for x in new_arr:
        print (arr.index(x)+1),

if __name__ == '__main__':
    main()