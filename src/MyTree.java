import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Noah on 12/10/2015.
 */
public class MyTree implements ITree {

    private MyNode root;

    public MyTree (MyNode root) {
        this.root = root;
    }

    @Override
    public void traverseBfs() {
        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            System.out.println(queue.peek().getName());
            for (MyNode myNode : queue.poll().getChildren()) {
                queue.add(myNode);
            }
        }
    }

    //USE HELPER FUNCTION
    @Override
    public double getBranchingFactor() {
        double branchCount = 0;
        double branchingNodeCount = 0;

        for (MyNode n : root.getChildren()) {
            if (n.getChildren() != null) {
                branchCount = branchCount + n.getChildren().size();
                branchingNodeCount++;
                getBranchingFactor(n);
            }
        }
        return (branchCount / branchingNodeCount);
    }

    //USE HELPER FUNCTION
    @Override
    public boolean isBinaryTree() {
        isBinaryTreeRecursive(root);
    }

    private boolean isBinaryTreeRecursive(MyNode root) {
        boolean isBinary = true;
        if (root.getChildren().size() > 2) {
            isBinary = false;
        }
        else {
            for (MyNode node : root.getChildren()) {
                isBinaryTreeRecursive(node);
            }
        }
        return isBinary;
    }

    @Override
    public void preorderDfsTraverseRecursive() {

    }
}
