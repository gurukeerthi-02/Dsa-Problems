# Java Based DSA Preparation with LeetCode

## Topics

- Arrays
- Strings
- Hashing
- Prefix and Suffix Manipulation
- Java Streams

### Arrays_and_Strings

1. Two Sum
   - Brute force was to iterate with 2 loops and return the matching sum's index values.
   - Optimised was to use a hash map and store the values and try to find the target-value[i] present in the hashmap.

2. Remove Duplicates from Sorted Array
   - Just check whether the arr[k] matches arr[i], if yes, increment k and swap arr[k] and arr[i].

3. ZigZag Conversion
   - Normal solution was to create k String[] arrays and add values from top to bottom, then again bottom to top and repeat the process based on a boolean value will be updating in real time based on the current row value.
   - Optimised is to use stringBuilder arrays to make it more efficient.

4. Valid Palindrome
   - Replace all the characters other than alphabets and numbers along with conversion of lower case.
   - Use 2 pointers and check from first moving forward and last moving backward.
   - Loop ends, it is valid, else not valid.

5. Container with Most Water
   - Logic is simple,first have two pointers, left with 0th position and right with the last position.
   - Iterate till left <= right
   - if arr[left] <= arr[right], calculate the maximum area using the minimum value, which is arr[left] * [right - left].
   - compare it with the maximum existing value and change it if the current value is greater and increment left++
   - else simple do the same with arr[right] value and decrement the right pointer right--

6. Squares of a sorted array
    - Logic is simple, square the values and sort it.

7. Contains Duplicate
   - Brute force is to use two loops and check for duplicate.
   - Optimized it to use hashmap and return true if count > 2 else false
   - More optimised is to use hashSet and return true if the value going to be added is present in the set, else false.
   
8. Valid Anagram
    - Solution is to convert the string to character array.
    - Sort the array lexicographically.
    - Create new string with character array.
    - Return true if string1.equals(string2), else false.

9. Group Anagrams
    - Use hashmap and sorting for optimised performance.
    - Solution is to get each word as a string, sort it in lexicographically order using charArray() and merge it again as string.
    - Check if the hashmap for the sorted word has an array, if yes add the original word to that array using the sorted word as a key.
    - If no, create a new ArrayList<> for that key and do the above step.

10. Top K Frequent Elements
    - Use a hashmap to store the value and its count
    - Use map.entrySet() to get the key-value pairs in array, make into a stream, sort based on b-a conditon, limit upto k elements, reduce map to int with only keys and convert into a array.
    - Optimized solution is to use a priority queue (min heap), offer the values, if the limit exceeds k, poll the value and continue the process of offering and polling.
    - Convert into an array with only k key values.

11. Encode Decode Strings
    - The idea is to create an encoded string using the array of words.
    - We can append all the words in a single string using a unique pattern which is 'length_of_word+#+word'.
    - Now to decode is to reverse the process by iterating till getting #, get the length, extract the word using the length, add it to array and repeat for the remaining words.

12. Product of an Array except itself
    - Brute force is to get the product and divide the product with each value in the array.
    - Optimised solution would be to get the prefix product and suffix product and multiply both the individual values from the 2 arrays and store it in a final result array.

13. Largest Consecutive Sequence
    - The main rule is you need to understand time complexity of O(N) and O(N^2).
    - Hold a max_count global variable.
    - First we need to add the values in the hashset to reduce duplicates and get O(1) fetching.
    - Next starting iterating through all the values in the set.
    - maintain a condition to start the sequence count if the value-1 is not in the set, meaning if the predecessor is already in the set means, skip the inner loop.
    - if the condition is true (No predecessor), start the count and keep track of the current num and increment the current_num and current_count if the current_num + 1 is present in the set, else get the max_count using the current_count and max_count global variable.

14. Two Sum Input Array is sorted
    - Same as two sum, but when returning the index array, increment both the values by 1.

15. Best time to Buy and Sell Stock
    - The idea is to iterate through every value starting from 1st index position keeping the 0th index position value as the temp minimum value.
    - if the current value[i] is lesser than the minimum value in temp, replace it and update the new minimum value.
    - else, update the max_profit by checking whether the current max_profit is greater or current value - minimum value is greater for the profit.
    - To optimise the solution, instead of using the Math.max func, we can check if the minimum value - current value is greater than the current max_profit, simply replace the max_profit with current_value - minimum value.

16. Sudoku Valid
    - Same as Sudoku solver in backtracking, but here we will use a hashset to check for the entry exists or not based on the condition !set.add(num+ " in row "+ i) ||
      !set.add(num+ " in column "+ j) ||
      !set.add(num+ " in block "+ i/3+"-"+j/3))
    - if false, then return false, else true.


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