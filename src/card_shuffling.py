'''
Created on Jun 11, 2017

@author: vivpa
'''

def main():
    suits = ['C','D', 'H', 'S']
    ranks = ['A', '2', '3', '4', '5', '6', '7', '8', '9', 'T',\
          'J', 'Q', 'K']
    deck = []
    for i in suits:
        for j in ranks:
            deck.append(i+j)
    cards = map(int, raw_input().split(' '))
    for x in range(len(cards)):
        temp = deck[cards[x]%52]
        deck[cards[x]%52] = deck[x]
        deck[x] = temp
    print " ".join(deck)

if __name__ == '__main__':
    main()