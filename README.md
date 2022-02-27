# ADJUSTING RAW DATA

## OVERVIEW
Often raw data needs to be processed/adjusted before analysis. Some cases are obviously
necessary (others might be more suspect). For example, when given distance measurements in a mixture
of English ft/in and Metric m/cm it would be reasonable to consistantly use one or the other. Similarly, if
you expect an exponential relationship between two variables then it would be normal to take the log of the
faster growing variable and investigate a linear relationship. Other times the adjustment might be made to
compensate for the effects of another variable. A house rated 2/10 might cost more than a house rated 8/10
if the first house is on the beach in Malibu and the second is in rural Manitoba.  

You will be given an array of ratings and moderately complicated requirements for the calculation of scores.
Think of the scores as the (suspiciously complicated) adjusted values of the ratings. Your program will
calculate the scores and sum them. The calculation process will require a simple Θ(n^2) greedy algorithm
which you are to determine.

## DETAILS

The input will come from a file called input.txt which will be placed in the same directory as your
java file. The first line of the file will have a single value which will be the value of N. The remainder of the
file will be N integer rating values seperated by whitespace.   

You program will read in this file, place the ratings in an array (or linked list or ArrayList or ...), create a
second array to hold the values to be calculated by your algorithm, calculate the values, and print the sum
of the calculated values.   

The rules for calculating values are: all values must be integer, all values must be at least 1, if rating i is
higher than the rating i −1 then value i must be higher than value i −1, if rating i is higher than rating
i + 1 then value i must be greater than value i + 1, and values should be as low as possible subject to the
previous requirements.   

## SAMPLE EXECUTION  
If input.txt contains the ratings   
10  
4 2 0 3 6 4 5 2 7 1  
then your program should calculate the values array   
3 2 1 2 3 1 2 1 2 1   
(it is easy to verify that all values are at least 1 and if a rating is higher than an neighbor then the value is
larger than the neighboring value) and output the sum  
18   


If input.txt contains the ratings   
20   
40 20 13 94 16   
32 27 15 76   
43 51 59 71 63 92 30 34   
51 84 32   
then your program should calculate the values array  
3 2 1 2 1 3 2 1 2 1 2 3 4 1 2 1 2 3 4 1   
and output the sum  
41  



