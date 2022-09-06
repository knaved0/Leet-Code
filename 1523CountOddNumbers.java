/*Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive). 
 * Constraints:
0 <= low <= high <= 10^9
*/
class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) /2 - low /2;
    }
}