'''
Created on Jun 9, 2017

@author: vivpa
'''

def swap(arr):
    swaps = 0
    for i in range(len(arr)-1):
        if arr[i] > arr[i+1]:
            temp = arr[i+1]
            arr[i+1] = arr[i]
            arr[i] = temp 
            swaps += 1
    return swaps,arr    

def main():
    arr_size = input()
    arr = map(int,raw_input().split(' '))
    tot_swaps = 0
    passes = 0
    while True:
        passes +=1
        s,arr = swap(arr)
        if s==0:
            break
        tot_swaps +=s
    print passes,tot_swaps
    
        

if __name__ == '__main__':
    main()