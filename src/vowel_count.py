'''
Created on Jun 8, 2017

@author: vivpa
'''
def main():
    usr_inp = ''
    ans = []
    while True:
        data = raw_input()
        if not data: break
        usr_inp += data + '\n'
    usr_inp = usr_inp.split('\n')
    usr_inp = usr_inp[1:len(usr_inp)-1]
    for i in usr_inp:
        tots = i.count('a') + i.count('e') + i.count('o') + \
        i.count('u') + i.count('y') + i.count('i')
        ans.append(str(tots))
    print " ".join(ans)

if __name__ == '__main__':
    main()