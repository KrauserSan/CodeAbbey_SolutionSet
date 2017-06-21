'''
Created on Jun 8, 2017

@author: vivpa
'''




def valid(s):
    lefts = '{[('
    rights = '}])'
    closes = { a:b for a,b in zip(rights,lefts)}
    stack = []
    for c in s:
        if c in lefts:
            stack.append(c)
        elif c in rights:
            if not stack or stack.pop() != closes[c]:
                return False
        else:
            continue
    return not stack  # stack must be empty at the end

def main():
    usr_inp = ''
    ans = []
    while True:
        data = raw_input()
        if not data: break
        usr_inp += data + '\n'
    usr_inp = usr_inp.split('\n')
    elem = int(usr_inp[0])
    usr_inp = usr_inp[1:len(usr_inp)-1]
    for i in range(elem):
        temp = list(usr_inp[i])
        if valid(temp):
            ans.append(str(1))
        else:
            ans.append(str(0))
    print " ".join(ans)

if __name__ == '__main__':
    main()