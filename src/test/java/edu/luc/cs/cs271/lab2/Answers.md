##Hello, Welcome to my markdown for Lab 2!\

##The complexity of our four search methods are created so that we can find the name of a team in the 
## respective list or array, as well as the difference of funding in the array or the list. Within our functions
## that utilize the list method we call a binary search that is able to take our list, cut it in half, and then 
## it will search that range and find, or not find, the value that we are looking for. In comparison, in our linear
## search we are able to go through our array item by item matching our search query with the results in our array 
## until we find a match. The binary search method is superior to the linear as we are able to eliminate a large 
## portion of the data that we are sifting through right off the get go

## What happens in the case of binary search if the array is not sorted?

## if the array is not sorted within our binary notes then we will get a compiler error. This is a result of having a certain number, for example 1, 
## at the end of our array list. This value isn't in the correct area since it is not following the rules we established when populating our array list

##What is the purpose of the constructor argument validity checking?

## The constructor argument validity checking allows us to make sure that the information we have in our array/array list
## is actually there and should be one of the respective results. That way we can ensure that if the user enters data for
## a new team and it didn't properly populate our array/array list then we will recieve an error telling us that what we
## entered does not match the criteria that our program has

## What is the purpose of using the keyword 'final' with variables and arguments?

## using final within our variable declartion allows us to only assign values to this variable one time. This helps us keep our
## code consistent and clean so that we are not over writing variables at any point or another which could cause run time errors within our program

##What are alternativesto using Optional and how do they compare?

## An alternative to Optional can be something as simple as setting the argument within our constructor to equal null. However, using Optional
## allows us to interact with our code in a safer approach because we can use the argument within question, as well as it's value, when we use optional
## we can use optional as a container for our variable and still run or execute code blocks/arguments that might turn out to be null