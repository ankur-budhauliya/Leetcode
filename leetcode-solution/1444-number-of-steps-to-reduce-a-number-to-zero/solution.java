class Solution {
    public int numberOfSteps(int num) {
        return calculate(num);
    }

    int calculate(int num) {
        if (num == 0)
            return 0;
        if (num % 2 == 0) {
            return 1 + calculate(num / 2);
        } else {
            return 1 + calculate(num - 1);
        }
    }
}
