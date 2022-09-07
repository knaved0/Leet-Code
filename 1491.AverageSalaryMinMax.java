/*You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted. 

Constraints:
3 <= salary.length <= 100
1000 <= salary[i] <= 106
All the integers of salary are unique.
*/
class Solution {
    public double average(int[] salary) {
        final int N = salary.length;
        Arrays.sort(salary);
        double t = salary[1];
        for (int i = 2; i < N - 1; i++) {
            t += salary[i];
        }
        return t / (N - 2);
    }
}
