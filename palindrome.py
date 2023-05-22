string = "Madam Arora teaches malayalam"


string = string.replace(" ", "").lower()

if string == string[::-1]:
    print("It is a palindrome.")
else:
    print("It is not a palindrome.")
