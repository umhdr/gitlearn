string = "Madam Arora teaches malayalam"


string = string.replace(" ", "").lower()

if string == string[::-1]:
    print("It is a palindrome.")
else:
    print("It is not a palindrome.")

print("This print is from test1 branch")
