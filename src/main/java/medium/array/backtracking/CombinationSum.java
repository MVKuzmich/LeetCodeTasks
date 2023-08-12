package medium.array.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CombinationSum {

    public List<List<Integer>> combinationSumIterative(int[] candidates, int target) {
        List<List<Integer>> combos = new ArrayList<>();

        Stack<List<Integer>> stack = new Stack<>();
        stack.push(new ArrayList<>());

        while (!stack.isEmpty()) {
            List<Integer> combo = stack.pop();
            int sum = 0;
            for (int num : combo) {
                sum += num;
            }
            if (sum == target && !combos.contains(combo)) {
                combos.add(combo);
            }
            if (sum >= target) {
                continue;
            }
            for (int i = 0; i < candidates.length; i++) {
                List<Integer> newCombo = new ArrayList<>(combo);
                newCombo.add(candidates[i]);
                Collections.sort(newCombo);
                stack.push(newCombo);
            }
        }
        return combos;
    }
    public List<List<Integer>> combinationSumRecursive(int[] candidates, int target) {
        List<List<Integer>> combos = new ArrayList<>();
        findCombos(0, candidates, target, new ArrayList<>(), combos);
        return combos;

    }

    private void findCombos(int index, int[] candidates, int remain, List<Integer> combo, List<List<Integer>> combos) {
        if (remain == 0) {
            combos.add(new ArrayList<>(combo));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] <= remain) {
                combo.add(candidates[i]);
                findCombos(i, candidates, remain - candidates[i], combo, combos);
                combo.remove(combo.size() - 1);
            }
        }
    }
}
