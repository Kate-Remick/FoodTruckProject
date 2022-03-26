# Food Truck Project

## Description
This app allows the user to input data for up to 5 Food Trucks. One of the pieces of information is the user's rating of each truck. After the user is done inputing data, they are presented with a menu and can either choose an option to view the results of the data they entered, or exit the program.
## Lessons Learned 

-It is much easier to create new objects in a loop when you create them as part of an array. I wanted to keep my code as 
DRY as possible, but also needed to give the user the ability to add new Food Truck objects (up until 5). I realized that to solve this problem, I could simply instantiate each object as a part of the array (no need to name each object with a 'variable' name). This meant that all of my methods simply took and passed my fleet array of Food Trucks, instead of needing to send the trucks through individually.

-To minimize the repetition in my userEntries method, and ensure that the program would quit when "quit" was entered into the scanner, I used only one String variable (changing its values in a for loop) to take data from the user. This meant that I ran into trouble with the "rating" input, because "rating" is a double and not a string. Thankfully google brought me the solution of converting the string to a double using Double.parseDouble() method. 


## Technology Used

-Eclipse
-Git
-Java
-Google