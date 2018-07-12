package leetcode.sum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    // Pre-condition: There is no duplicate in the input array.
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return combinationSum(candidates, 0, target);
    }

    private List<List<Integer>> combinationSum(int[] candidates, int startFrom, int target) {
        List<List<Integer>> result = new LinkedList<>();

        // Returns for invalid cases.
        if (startFrom >= candidates.length || target < 0) {
            return result;
        } else if (target == 0) {
            result.add(new LinkedList<>());
            return result;
        }

        int current = candidates[startFrom];

        // Uses the current element.
        for (List<Integer> group: combinationSum(candidates, startFrom, target - current)) {
            group.add(current);
            result.add(group);
        }

        // Not uses the current element.
        result.addAll(combinationSum(candidates, startFrom + 1, target));

        return result;
    }

    // Notice: there may be duplicates in the input.
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum2(candidates, 0, target);
    }

    private List<List<Integer>> combinationSum2(int[] candidates, int startFrom, int target) {
        List<List<Integer>> result = new LinkedList<>();

        // Returns for invalid cases.
        if (startFrom >= candidates.length || target < 0) {
            return result;
        } else if (target == 0) {
            result.add(new LinkedList<>());
            return result;
        }

        int current = candidates[startFrom];

        // Uses the current element.
        for (List<Integer> group: combinationSum2(candidates, startFrom + 1, target - current)) {
            group.add(current);
            result.add(group);
        }

        // Not uses the current element.
        result.addAll(combinationSum2(candidates, startFrom + 1, target));

        return result;
    }
}
