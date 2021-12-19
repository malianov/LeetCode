package solutions.task746mincostclimbingstairs;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int arrayLength = cost.length;

        for (int i = arrayLength - 3; i >= 0; i--) {
            cost[i] += cost[i + 1] <= cost[i + 2] ? cost[i + 1] : cost[i + 2];
        }

        return cost[0] < cost[1] ? cost[0] : cost[1];
    }
}
