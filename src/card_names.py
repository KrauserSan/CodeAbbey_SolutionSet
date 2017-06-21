'''
Created on Jun 11, 2017

@author: vivpa
'''

def main():
    suits = ['Clubs', 'Spades', 'Diamonds', 'Hearts']
    ranks = ['2', '3', '4', '5', '6', '7', '8', '9', '10',\
          'Jack', 'Queen', 'King', 'Ace']
    elem  = input()
    cards = map(int, raw_input().split(' '))
    for x in cards:
        rank_val,suit_val = ranks[x%13],suits[int(x/13)]
        print ("%s-of-%s") %(rank_val,suit_val),
if __name__ == '__main__':
    main()