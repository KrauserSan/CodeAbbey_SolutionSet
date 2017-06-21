'''
Created on Jun 8, 2017

@author: vivpa
'''

def main():
    usr_inp = ""
    ans = []
    while True:
        data = raw_input()
        if not data: break
        usr_inp += data + '\n'
    usr_inp = usr_inp.split('\n')
    dat_len = int(usr_inp[0])
    usr_inp = usr_inp[1:]
    for i in range(dat_len):
        tot= 0
        usr_inp[i] = usr_inp[i].split(' ')
        print usr_inp[i]
        for x in range(len(usr_inp[i])):
            tot +=int(usr_inp[i][x])
        print tot
        tot = round(tot/float((len(usr_inp[i])-1)))
        print tot
        ans.append(str(int(tot)))
    print " ".join(ans)

if __name__ == '__main__':
    main()