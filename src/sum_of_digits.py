'''
Created on Jun 6, 2017
Problem set: Codeabbey.com
@author: vivpa
'''
def func(dat_len, usr_dat):
    ans = []
    for i in range(dat_len):
        total = 0
        a = int(usr_dat[i][0])
        b = int(usr_dat[i][1])
        c = int(usr_dat[i][2])
        temp = a*b + c
        temp_list = list(str(temp))
        for x in range(len(temp_list)):
            total += int(temp_list[x])
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
    usr_dat = usr_dat[1:]
    for i in range(len(usr_dat)):
        usr_dat[i] = usr_dat[i].split(' ')
    print dat_len, usr_dat
    sol_ = func(dat_len,usr_dat)
    print sol_
    print " ".join(sol_)
if __name__ == '__main__':
    main()