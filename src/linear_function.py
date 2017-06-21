'''
Created on Jun 6, 2017
Problem set: Codeabbey.com
@author: vivpa
'''
def func(dat_len, usr_dat):
    ans = []
    for i in range(dat_len):
        x1 = int(usr_dat[i][0])
        y1 = int(usr_dat[i][1])
        x2 = int(usr_dat[i][2])
        y2 = int(usr_dat[i][3])
        a = (y1 - y2)/(x1 - x2)
        b = y1 - a*x1
        ans.append('(' + str(a) + ' ' + str(b) + ')')
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