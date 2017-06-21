'''
Created on Jun 6, 2017
Problem set: Codeabbey.com
@author: vivpa
'''
def func(dat_len, usr_dat):
    ans = []
    for i in range(dat_len):
        list1 = usr_dat[i][:4]
        list2 = usr_dat[i][4:]
        print list1, list2 
        data1 = int(list1[0])*24*60*60 + int(list1[1])*60*60 + int(list1[2])*60 + int(list1[3]) 
        data2 = int(list2[0])*24*60*60 + int(list2[1])*60*60 + int(list2[2])*60 + int(list2[3])
        dat_diff = data2 - data1
        sec_ = dat_diff%60
        dat_diff = dat_diff/60
        min_ = dat_diff%60
        dat_diff = dat_diff/60
        hour = dat_diff%24
        day = dat_diff/24
        ans.append('(' + str(day) + ' ' + str(hour) + ' ' + str(min_) + ' ' + str(sec_) + ')')       
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
    sol_ = func(dat_len,usr_dat)
    print " ".join(sol_)
if __name__ == '__main__':
    main()