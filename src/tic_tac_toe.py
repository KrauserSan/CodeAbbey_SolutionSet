'''
Created on Jun 12, 2017

@author: vivpa
'''

def checks(i):
    if i[0]==i[1] and i[1] == i[2]:
        return True
    elif i[6]==i[7] and i[7]==i[8]:
        return True
    elif i[0] == i[3] and i[3]==i[6]:
        return True
    elif i[2]==i[5] and i[5]==i[8]:
        return True
    elif i[0]==i[4] and i[4]==i[8]:
        return True
    elif i[2]==i[4] and i[4]==i[6]:
        return True
    elif i[1]==i[4] and i[4]==i[7]:
        return True
    elif i[3]==i[4] and i[4]==i[5]:
        return True
    return False


def main():
    move_list = []
    for _ in range(input()):
        move_list.append(map(int,raw_input().split(' ')))
    for y in range(len(move_list)):
        steps = 0
        table = map(str,range(9))
        for x in range(len(move_list[y])):
            if (x+1)%2!=0:
                table[move_list[y][x]-1]='X'
            else:
                table[move_list[y][x]-1]='O'
            decision = checks(table)
            if decision:
                steps = x+1
                break
        print steps,
        
    
if __name__ == '__main__':
    main()