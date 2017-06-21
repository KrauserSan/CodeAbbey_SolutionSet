'''
Created on Jun 9, 2017

@author: vivpa
'''

def bmi(i):
    weight = float(i[0])
    height = float(i[1])
    BMI = weight/(height**2)
    if BMI < 18.5:
        return 'under'
    elif BMI<25 and BMI>=18.5:
        return 'normal'
    elif BMI >=25 and BMI<30:
        return 'over'
    else:
        return 'obese'

def main(): 
    test = []
    for _ in range(input()):
        test.append(raw_input().split(' '))
    ans = map(bmi,test)
    print " ".join(ans)
if __name__ == '__main__':
    main()