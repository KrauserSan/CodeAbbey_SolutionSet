'''
Created on Jun 6, 2017
Problem set: Codeabbey.com
@author: vivpa
'''
def func(dat_len, usr_dat):
    ans = []
    for i in range(dat_len):
        total = 0
        temp = list(usr_dat[i])
        for x in range(len(temp)):
            total = total + int(temp[x])*(x+1)
        ans.append(str(total))
    return ans

def main():
    usr_dat = ''
    while True:
        data = raw_input()
        if not data: break
        usr_dat += data + '\n'
    usr_dat = usr_dat.split('\n')
    dat_len = int(usr_dat[0])
    usr_dat = usr_dat[1]
    usr_dat = usr_dat.split(' ')
    sol_ = func(dat_len,usr_dat)
    print sol_
    print " ".join(sol_)
if __name__ == '__main__':
    main()