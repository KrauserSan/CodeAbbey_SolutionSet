'''
Created on Jun 8, 2017

@author: vivpa
'''
def main():
    usr_inp = ''
    while True:
        data= raw_input()
        if not data: break
        usr_inp +=data + '\n'
    usr_inp = usr_inp.split('\n')
    
    elem = int(usr_inp[0])
    usr_inp = usr_inp[1].split(' ')
    result = 0
    for i in usr_inp:
        result += int(i)
        result = (result*113)%10000007
    print result
if __name__ == '__main__':
    main()