package easy.tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class MinimumNodeValueDifference {

    List<Integer> values = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        addToList(root);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < values.size(); i++) {
            for(int j = i + 1; j < values.size(); j++) {
                int diff = Math.abs(values.get(i) - values.get(j));
                if(diff < min) {
                    min = diff;
                }
            }
        }
        return min;
    }

    public void addToList(TreeNode root) {
        if(root != null) {
            values.add(root.val);
            addToList(root.right);
            addToList(root.left);
        }
    }
}
