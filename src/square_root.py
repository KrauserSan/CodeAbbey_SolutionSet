'''
Created on Jun 8, 2017

@author: vivpa
'''
def func(r,n,X):
    for i in range(n):
        r = (r + X/r)/2.0
    return r
def main():
    usr_inp = ''
    ans = []
    while True:
        data= raw_input()
        if not data: break
        usr_inp +=data + '\n'
    usr_inp = usr_inp.split('\n')
    elem = int(usr_inp[0])
    usr_inp = usr_inp[1:]
    for x in range(elem):   
        usr_inp[x] = usr_inp[x].split(' ')
    for i in range(elem):
        X = int(usr_inp[i][0])
        n = int(usr_inp[i][1])
        r = 1
        sol = func(r,n,X)
        ans.append(str(sol))
    print " ".join(ans)
if __name__ == '__main__':
    main()