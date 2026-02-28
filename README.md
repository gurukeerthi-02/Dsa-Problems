# Java Based DSA Preparation with LeetCode

## Topics

- Arrays
- Strings

### Arrays

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
