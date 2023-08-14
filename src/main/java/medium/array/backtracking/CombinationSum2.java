package medium.array.backtracking;

import java.util.*;

public class CombinationSum2 {

    public List<List<Integer>> combinationSumRecursive(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> combos = new ArrayList<>();
        findCombos(0, candidates, target, new ArrayList<>(), combos);
        return combos;

    }

    private void findCombos(int index, int[] candidates, int remain, List<Integer> combo, List<List<Integer>> combos) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            combos.add(new ArrayList<>(combo));
        } else {
            for (int i = index; i < candidates.length; i++) {
                if (i > index && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                combo.add(candidates[i]);
                findCombos(i + 1, candidates, remain - candidates[i], combo, combos);
                combo.remove(combo.size() - 1);
            }
        }
    }
}

