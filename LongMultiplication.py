num1 = 3141592653589793238462643383279502884197169399375105820974944592;
num2 = 2718281828459045235360287471352662497757247093699959574966967627;
l = [];
while num1:
    l.append(num1%10);
    num1//=10;

l2=[];
for i in l:
    l2.append(i*num2);

total = 0;
count = 1;
for y in l2:
    total = total + y*count;
    count = count*10;

print total;
