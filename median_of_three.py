'''
Created on Jun 9, 2017

@author: vivpa
'''
def main():
    ans = []
    for _ in range(input()):
        ans.append(sorted(map(int,raw_input().split(' ')))[1])
    print " ".join(map(str,ans))


if __name__ == '__main__':
    main()