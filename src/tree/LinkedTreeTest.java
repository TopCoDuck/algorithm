package tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedTreeTest {

	@Test
	void test() {
		LinkedTree tree = new LinkedTree();
	    TreeNode n7 = tree.makeBT(null, "D", null);
	    TreeNode n6 = tree.makeBT(null, "C", null);
	    TreeNode n5 = tree.makeBT(null, "B", null);
	    TreeNode n4 = tree.makeBT(null, "A", null);
	    TreeNode n3 = tree.makeBT(n6, "right_sub", n7);
	    TreeNode n2 = tree.makeBT(n4, "left_sub", n5);
	    TreeNode n1 = tree.makeBT(n2, "root", n3);
	    
	    System.out.print("\nPreorder : ");
        tree.preorder(n1);

        System.out.print("\nInorder : ");
        tree.inorder(n1);

        System.out.print("\nPostorder : ");
        tree.postorder(n1);
	}

}
