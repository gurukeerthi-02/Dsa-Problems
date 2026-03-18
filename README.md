# Java Based DSA Preparation with LeetCode

## Topics

- Arrays
- Strings
- Hashing
- Prefix and Suffix Manipulation
- Java Streams
- Stacks
- HashMap

### Arrays_and_Strings

1. Remove Duplicates from Sorted Array
   - Just check whether the arr[k] matches arr[i], if yes, increment k and swap arr[k] and arr[i].

2. ZigZag Conversion
   - Normal solution was to create k String[] arrays and add values from top to bottom, then again bottom to top and repeat the process based on a boolean value will be updating in real time based on the current row value.
   - Optimised is to use stringBuilder arrays to make it more efficient.

3. Valid Palindrome
   - Replace all the characters other than alphabets and numbers along with conversion of lower case.
   - Use 2 pointers and check from first moving forward and last moving backward.
   - Loop ends, it is valid, else not valid.

4. Container with Most Water
   - Logic is simple,first have two pointers, left with 0th position and right with the last position.
   - Iterate till left <= right
   - if arr[left] <= arr[right], calculate the maximum area using the minimum value, which is arr[left] * [right - left].
   - compare it with the maximum existing value and change it if the current value is greater and increment left++
   - else simple do the same with arr[right] value and decrement the right pointer right--

5. Squares of a sorted array
    - Logic is simple, square the values and sort it.

6. Valid Anagram
    - Solution is to convert the string to character array.
    - Sort the array lexicographically.
    - Create new string with character array.
    - Return true if string1.equals(string2), else false.

7. Encode Decode Strings
    - The idea is to create an encoded string using the array of words.
    - We can append all the words in a single string using a unique pattern which is 'length_of_word+#+word'.
    - Now to decode is to reverse the process by iterating till getting #, get the length, extract the word using the length, add it to array and repeat for the remaining words.

8. Product of an Array except itself
   - Brute force is to get the product and divide the product with each value in the array.
   - Optimised solution would be to get the prefix product and suffix product and multiply both the individual values from the 2 arrays and store it in a final result array.

9. Largest Consecutive Sequence
   - The main rule is you need to understand time complexity of O(N) and O(N^2).
   - Hold a max_count global variable.
   - First we need to add the values in the hashset to reduce duplicates and get O(1) fetching.
   - Next starting iterating through all the values in the set.
   - maintain a condition to start the sequence count if the value-1 is not in the set, meaning if the predecessor is already in the set means, skip the inner loop.
   - if the condition is true (No predecessor), start the count and keep track of the current num and increment the current_num and current_count if the current_num + 1 is present in the set, else get the max_count using the current_count and max_count global variable.

10. Best time to Buy and Sell Stock
    - The idea is to iterate through every value starting from 1st index position keeping the 0th index position value as the temp minimum value.
    - if the current value[i] is lesser than the minimum value in temp, replace it and update the new minimum value.
    - else, update the max_profit by checking whether the current max_profit is greater or current value - minimum value is greater for the profit.
    - To optimise the solution, instead of using the Math.max func, we can check if the minimum value - current value is greater than the current max_profit, simply replace the max_profit with current_value - minimum value.

11. Sudoku Valid
    - Same as Sudoku solver in backtracking, but here we will use a hashset to check for the entry exists or not based on the condition !set.add(num+ " in row "+ i) ||
      !set.add(num+ " in column "+ j) ||
      !set.add(num+ " in block "+ i/3+"-"+j/3))
    - if false, then return false, else true.

12. Longest Consecutive Substring
    - The brute force idea is to use an arraylist and add the characters one by one and compute their length to update the length of the longest substring.
    - if the duplicate character arrives, loop and remove the values in the list from the first position till the duplicate is not found in the list.
    - To optimize the solution, use a hashset, since the lookup times reduces from O(n) to O(1) and avoid the use of Math.max function and compute the length using right - left + 1 pointer concept.

13. Longest Common Prefix
    - The solution is simple, sort the arrays, compare characters of first word and last word and break when the characters mismatch.
    - if the match, add it in the string builder and continue.

14. Remove Duplicates from Sorted Array 2
    - The idea is to check whether the arr[i] != arr[k-2] since we need to check if it has more than 2 duplicates, then we replace it.
    - Initialize k =2 and when return, K+1 is not needed.

15. Minimum Size Subarray Sum
    - The idea is to keep on adding the values in a sum variable and check if it is equal or exceeds the target.
    - If it exceeds, use another loop to compute the min_length and remove the first value added in the sum variable and continue the loop till the sum is less than target.
    - Again continue first step and return the result by adding plus 1 since arrays start from 0 index position.
    - Use Integer.MAX_VALUE for min_length initial value and to solve the edge-case, when returning the value, check if it is not equal to Integer.MAX_VALUE, else return 0.


## HashMap
1. Contains Duplicate
    - Brute force is to use two loops and check for duplicate.
    - Optimized it to use hashmap and return true if count > 2 else false
    - More optimised is to use hashSet and return true if the value going to be added is present in the set, else false.

2. Group Anagrams
    - Use hashmap and sorting for optimised performance.
    - Solution is to get each word as a string, sort it in lexicographically order using charArray() and merge it again as string.
    - Check if the hashmap for the sorted word has an array, if yes add the original word to that array using the sorted word as a key.
    - If no, create a new ArrayList<> for that key and do the above step.

3. Top K Frequent Elements
    - Use a hashmap to store the value and its count
    - Use map.entrySet() to get the key-value pairs in array, make into a stream, sort based on b-a conditon, limit upto k elements, reduce map to int with only keys and convert into a array.
    - Optimized solution is to use a priority queue (min heap), offer the values, if the limit exceeds k, poll the value and continue the process of offering and polling.
    - Convert into an array with only k key values.

4. Two Sum
    - Brute force was to iterate with 2 loops and return the matching sum's index values.
    - Optimised was to use a hash map and store the values and try to find the target-value[i] present in the hashmap.

5. Two Sum Input Array is sorted
    - Same as two sum, but when returning the index array, increment both the values by 1.

6. Isomorphic Strings
    - The idea is the check whether the individual characters of 2 strings are mapping in one-to-one relation.
    - Use 2 HashMaps to check the forward mapping and the reverse mapping.

7. Non Duplicate
    - The idea is to find to count the occurrences of the numbers using HashMap.
    - Return the occurrence count = 1
    - XOR approach can be used only when the duplicate count is 2 at maximum.

8. Word Pattern
    - The approach was to create a hashmap and map each pattern character with its respective string word. 
    - If the pattern character is already in the map, then check if the current word is the same word as in the map, else return false. 
    - The tricky part is to ensure the one-one property stays true, hence we need to have another Hashmap that keeps track of mapping the string word with the pattern character too. 
    - If the string word is already in the map, then check if the current character is the same character as in the map, else return false. 
    - If all the conditions pass, return true. 
    - Edge case is to check if the pattern array length is the same as word array length.

## Stack

1. Daily Temperatures
    - The idea is to keep track of the temperature index until a value is found which is greater than the top value of the stack.
    - Then remove the top and get its position using index and subtract the current index with that index and repeat the process until the top is greater than current. 

2. Smallest Number After Removing K values 
    - The approach was to use Stack based concept and try to find the smallest possible value. 
    - The value will be pushed to stack until the top of the stack is lesser than the current value. 
    - If the top of the stack is greater than current value, the top will be removed until the top of the stack is lesser than the current value and push the current value to stack. 
    - I do not know how to return the stack in the string format, so I utilised the StringBuilder collection and implemented the same logic and returned it as a string. 
    - Edge case was resolved by removing the leading zeros using a simple loop check at result[0]. 
    - There might be more edge cases for the problem, but I have written the solution using the available example inputs.




## Backtracking

1. Sudoku Solver
   - The concept is to check all the rows, columns and individual boxes from 0 to 9 have no duplicate values.
   - First we check for each values in the sudoku and start solving when we reach a value '.'.
   - For each dot, we will try all the possible solutions using a checker function.
   - In the checker function, we will check if all the rows in i th and all the cols in the ith do not have the value.
   - Along with, we need to check for the particular sub box also, so we use rowsBox = 3*(rows/3) + i/3 and for colsBox = 3*(cols/3) + i%3.
   - if the checker functions passes, about the value in the board and again call the same function to finalise our board value correct or not.
   - If fails, we can backtrack and rectify our error.
   - Continue till the board is fully solved.