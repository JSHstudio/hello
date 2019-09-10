# Please fill out this stencil and submit using the provided submission script.
## 1: (Task 1) Minutes in a Week
minite = 24 * 7 * 60
print(minite)

## 2: (Task 2) Remainder
remainder = 2304811 - 47 * (2304811 // 47)
print(remainder)

## 3: (Task 3) Divisibility
divisibilty = ((673 + 909) % 3) == 0
print(divisibilty)

## 4: (Task 4) Conditional Expression
x,y = -9, 0.5
2**(y+1/2) if x+10<0 else 2**(y-1/2)

## 5: (Task 5) Squares Set Comprehension
set_comprehension = {x ** 2 for x in set(range(1, 6))}
print(set_comprehension)

## 6: (Task 6) Powers-of-2 Set Comprehension
set_comprehension2 = {2 ** x for x in set(range(5))}
print(set_comprehension2)

## 7: (Task 7) Double comprehension evaluating to nine-element set
set1 = {1, 3, 5}
set2 = {7, 11, 13}
print({x*y for x in set1 for y in set2})

## 8: (Task 8) Double comprehension evaluating to five-element set
set1 = {1, 2, 4}
set2 = {0, 2, 4}
print({x * y for x in set1 for y in set2})

## 9: (Task 9) Set intersection as a comprehension
S = {1, 2, 3, 4}
T = {3, 4, 5, 6}
# Replace { ... } with a one-line set comprehension that evaluates to the intersection of S and T
print({s for s in S for t in T if s == t})

## 10: (Task 10) Average
list_of_numbers = [20, 10, 15, 75]
# Replace ... with a one-line expression that evaluates to the average of list_of_numbers.
# Your expression should refer to the variable list_of_numbers, and should work
# for a list of any length greater than zero.
print(sum(list_of_numbers) / len(list_of_numbers))

## 11: (Task 11) Cartesian-product comprehension
# Replace ... with a double list comprehension over ['A','B','C'] and [1,2,3]
print([[char, number] for char in ["A", "B", "C"] for number in [1, 2, 3]])

## 12: (Task 12) Sum of numbers in list of list of numbers
LofL = [[.25, .75, .1], [-1, 0], [4, 4, 4, 4]]
# Replace ... with a one-line expression of the form sum([sum(...) ... ]) that
# includes a comprehension and evaluates to the sum of all numbers in all the lists.
print(sum([sum(x) for x in LofL]))

## 13: (Task 13) Three-element tuples summing to zero
S = {-4, -2, 1, 2, 5, 0}
# Replace [ ... ] with a one-line list comprehension in which S appears
print([(i, j, k) for i in S for j in S for k in S if sum((i, j, k)) == 0])

## 14: (Task 14) Nontrivial three-element tuples summing to zero
S = {-4, -2, 1, 2, 5, 0}
# Replace [ ... ] with a one-line list comprehension in which S appears
print([(i, j, k) for i in S for j in S for k in S if sum((i, j, k)) == 0 and any((i, j, k))])

## 15: (Task 15) One nontrivial three-element tuple summing to zero
S = {-4, -2, 1, 2, 5, 0}
# Replace ... with a one-line expression that uses a list comprehension in which S appears
print([(i, j, k) for i in S for j in S for k in S if sum((i, j, k)) == 0 and any((i, j, k))][0])

## 16: (Task 16) List and set differ
# Assign to example_L a list such that len(example_L) != len(list(set(example_L)))
example_L = [1, 1, 1]
print(len(example_L) != len(list(set(example_L))))

## 17: (Task 17) Odd numbers
# Replace {...} with a one-line set comprehension over a range of the form range(n)
print({x for x in range(1, 100) if x % 2 != 0})

## 18: (Task 18) Using range and zip
# In the line below, replace ... with an expression that does not include a comprehension.
# Instead, it should use zip and range.
# Note: zip() does not return a list. It returns an 'iterator of tuples'
L = ['A','B','C','D','E']
#range_and_zip = [(a, b) for (a, b) in zip(range(5), L)]
print(list(zip(range(5), L)))

## 19: (Task 19) Using zip to find elementwise sums
A = [10, 25, 40]
B = [1, 15, 20]
# Replace [...] with a one-line comprehension that uses zip together with the variables A and B.
# The comprehension should evaluate to a list whose ith element is the ith element of
# A plus the ith element of B.
print([sum(x) for x in zip(A, B)])

## 20: (Task 20) Extracting the value corresponding to key k from each dictionary in a list
dlist = [{'James':'Sean', 'director':'Terence'}, {'James':'Roger', 'director':'Lewis'}, {'James':'Pierce', 'director':'Roger'}]
k = 'James'
# Replace [...] with a one-line comprehension that uses dlist and k
# and that evaluates to ['Sean','Roger','Pierce']
print([group["James"] for group in dlist])

dict1 = {'Bilbo':'Martin','Thorin':'Richard'}
dict1.get("Rordo") == None

## 21: (Task 21) Extracting the value corresponding to k when it exists
dlist = [{'Bilbo':'Ian','Frodo':'Elijah'},{'Bilbo':'Martin','Thorin':'Richard'}]

k = 'Bilbo'
#Replace [...] with a one-line comprehension 
# <-- Use conditional expression here
print([group[k] for group in dlist])
k = 'Frodo'
# <-- Use .get(key, default) here
print([group[k] if group.get(k) != None else "NOT PRESENT" for group in dlist])

## 22: (Task 22) A dictionary mapping integers to their squares
# Replace {...} with a one-line dictionary comprehension
print({x : x ** 2 for x in range(100)})

## 23: (Task 23) Making the identity function
D = {'red','white','blue'}
# Replace {...} with a one-line dictionary comprehension
print({x : x for x in D})

## 24: (Task 24) Mapping integers to their representation over a given base
base = 10
digits = set(range(base))
# Replace { ... } with a one-line dictionary comprehension
# Your comprehension should use the variables 'base' and 'digits' so it will work correctly if these
# are assigned different values (e.g. base = 2 and digits = {0,1})
print({number : (number // len(digits) ** 2, number % len(digits) ** 2 // len(digits), number % len(digits) ** 2 % len(digits)) for number in range(len(digits) ** 3) if number // len(digits) ** 2 < len(digits)})

## 25: (Task 25) A dictionary mapping names to salaries
id2salary = {0:1000.0, 1:1200.50, 2:990}
names = ['Larry', 'Curly', 'Moe']
# Replace { ... } with a one-line dictionary comprehension that uses id2salary and names.
print({name : salary for name, salary in zip(names, id2salary.values())})

## 26: (Task 26) Procedure nextInts
# Complete the procedure definition by replacing [ ... ] with a one-line list comprehension
def nextInts(L):
    return [l + 1 for l in L]

## 27: (Task 27) Procedure cubes
# Complete the procedure definition by replacing [ ... ] with a one-line list comprehension
def cubes(L):
    return [l ** 3 for l in L]

## 28: (Task 28) Procedure dict2list
# Input: a dictionary dct and a list keylist consisting of the keys of dct
# Output: the list L such that L[i] is the value associated in dct with keylist[i]
# Example: dict2list({'a':'A', 'b':'B', 'c':'C'},['b','c','a']) should equal ['B','C','A']
# Complete the procedure definition by replacing [ ... ] with a one-line list comprehension
def dict2list(dct,keylist):
    return [dct[key] for key in keylist]

## 29: (Task 29) Procedure list2dict
# Input: a list L and a list keylist of the same length
# Output: the dictionary that maps keylist[i] to L[i] for i=0,1,...len(L)-1
# Example: list2dict(['A','B','C'],['a','b','c']) should equal {'a':'A', 'b':'B', 'c':'C'}
# Complete the procedure definition by replacing { ... } with a one-line dictionary comprehension
def list2dict(L, keylist):
    return {key : l for key, l in zip(keylist, L)}