'''
Created on Jun 9, 2017

@author: vivpa
'''

def func(arr):
    if int(arr[0]) >= 0:
        new_arr = arr[1][int(arr[0]):] + arr[1][:int(arr[0])]
    else:
        new_arr = arr[1][int(arr[0]):] + arr[1][:len(arr[1])+int(arr[0])]
    return new_arr
    


def main():
    test = []
    for _ in range(input()):
        test.append(raw_input().split(' '))
    ans = map(func, test)
    print " ".join(ans)
if __name__ == '__main__':
    main()
    
