import math

# Information
print('''
----------------------------------------------------------------------------
Gauss-Seidel Calculator v0.2 by Anag Devnani
Created on 26/10/2023

This is only valid for 3 System of Equations (Working on a way to add more)

If required, we can print the values of x, y & z at every iteration

Changenotes:-
v0.2 (30/10/23): Converted Approximation Value to User Input, Optimised Code
v0.3 (X/11/23): Added option to print x, y, z after every iteration
----------------------------------------------------------------------------
''')
# Input of coeffecients
List1 = list(map(int, input("Enter Coefficients of 1st Equation Seperated by Space: ").split()))
List2 = list(map(int, input("Enter Coefficients of 2nd Equation Seperated by Space: ").split()))
List3 = list(map(int, input("Enter Coefficients of 3rd Equation Seperated by Space: ").split()))

# Tests for Rearrangement of Equations
Line1=0
Line2=0
Line3=0
if abs(List1[0]) > abs(List1[1]) + abs(List1[2]):
    Line1=List1
if abs(List1[1]) > abs(List1[0]) + abs(List1[2]):
    Line2=List1
if abs(List1[2]) > abs(List1[1]) + abs(List1[0]):
    Line3=List1
if abs(List2[0]) > abs(List2[1]) + abs(List2[2]):
    Line1=List2
if abs(List2[1]) > abs(List2[0]) + abs(List2[2]):
    Line2=List2
if abs(List2[2]) > abs(List2[0]) + abs(List2[1]):
    Line3=List2
if abs(List3[0]) > abs(List3[1]) + abs(List3[2]):
    Line1=List3
if abs(List3[1]) > abs(List3[2]) + abs(List3[0]):
    Line2=List3
if abs(List3[2]) > abs(List3[1]) + abs(List3[0]):
    Line3=List3
if Line1==0 or Line2==0 or Line3==0:
    print("Gauss-Siedal Method is not applicaple for the following system of equations:")
    print("Program will be Terminated.")
    exit()

# Iterations
Iteration_No=x_old=x_new=y_old=y_new=z_old=z_new=0
ApproxVal=float(input("Enter Value to Approximate Upto: "))
calc = []
while True:  # Incomplete # Comparing approx value to 4 Digits
    Iteration_No=Iteration_No+1
    x_old=x_new
    y_old=y_new
    z_old=z_new
    x_new=(1/Line1[0])*(Line1[3]-(Line1[1]*y_old)-(Line1[2]*z_old))
    y_new=(1/Line2[1])*(Line2[3]-(Line2[0]*x_new)-(Line2[2]*z_old))
    z_new=(1/Line3[2])*(Line3[3]-(Line3[1]*y_new)-(Line3[0]*x_new))
    if abs(x_old-x_new) <=ApproxVal and abs(y_old-y_new) <=ApproxVal and abs(z_old-z_new) <=ApproxVal:
        break

calc.append([x_new, y_new, z_new])
PrintQuestion=str(input("Would you like to Print the value of x,y,z at Every Iteration? (Y/n): "))
if PrintQuestion=='Y' or PrintQuestion=='y':
    for i in calc:    
        print(f'{i[0]}, {i[1]}, {i[2]}')
    
# Result
print('--------------------------------------')
print("The Value of x is: ",x_new)
print("The Value of y is: ",y_new)
print("The Value of z is: ",z_new)
print("Result was obtained after",Iteration_No,"Iterations")
print("--------------------------------------")