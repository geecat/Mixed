package com.geecat.steps.tree;
/**
 * 							   10
 *						     /    \
 *						    6      14
 *						   / \    /  \
 *						  5   8  11  18
 * @author Geecat
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class has method related with tree operations. This methods are all
 * based on recursion.
 * 
 * @author Geecat
 * 
 */
public class TreeOperation {
	private final static Logger _logger = Logger.getLogger(TreeOperation.class
			.getName());

	/**
	 * Call this class with a array of integer and will return the binary tree.
	 * 
	 * @param a
	 * @return
	 */
	public Tree createTree(int a[]) {
		_logger.log(Level.INFO, "Entering create Tree method..");
		Tree root = null;
		for (int i = 0; i < a.length; i++) {

			if (root == null) {
				root = new Tree(a[i]);
			} else {

				Tree node = new Tree(a[i]);
				insertNode(root, node);

			}
			//System.out.println(a[4]);
		}
		_logger.log(Level.INFO, "Existing create Tree method.");
		return root;
	}

	/**
	 * Call this class with tree node and value as node you want to insert.
	 * 
	 * @param tree
	 * @param node
	 */
	private void insertNode(Tree tree, Tree node) {
		//System.out.println("Node data: " + node.getData());
		if (tree.getData() >= node.getData()) {
			//this will allow duplicate check http://stackoverflow.com/questions/16727871/bst-with-duplicates
			if (tree.getLeft() == null) {
				tree.setLeft(node);
				return;
			} else {
				insertNode(tree.getLeft(), node);
			}
		} else {
			if (tree.getRight() == null) {
				tree.setRight(node);
				return;
			} else {
				insertNode(tree.getRight(), node);
			}
		}
	}

	/**
	 * Returns the max value in the tree.
	 * 
	 * @param tree
	 * @return
	 */
	public int maxOfTree(Tree tree, int a) {
		int max_left = 0, max_right = 0, max = 0;
		if(tree==null)return a;
		if (tree != null) {
			if (tree.getData() > a) {
				a = tree.getData();
			}
			max_left = maxOfTree(tree.getLeft(), a);
			max_right = maxOfTree(tree.getRight(), a);
		}
		if (max_left > max_right) {
			max = max_left;
		} else {
			max = max_right;
		}
		if (a > max) {
			max = a;
		}
		return max;

	}
	
	/**
	 * Returns the min value in the tree.
	 * 
	 * @param tree
	 * @return
	 */
	public int minOfTree(Tree tree, int a) {
		int min_left = 0, min_right = 0, min = 0;
		if(tree==null)return a;
		if (tree != null) {
			if(a==0){
				a = tree.getData();
			}
			if (tree.getData() < a) {
				a = tree.getData();
			}
			min_left = minOfTree(tree.getLeft(), a);
			min_right = minOfTree(tree.getRight(), a);
		}
		if (min_left < min_right) {
			min = min_left;
		} else {
			min = min_right;
		}
		if (a < min) {
			min = a;
		}
		return min;

	}

	/**
	 * Returns true if a element is found in the binary tree.
	 * 
	 * @param tree
	 * @return
	 */
	public boolean isPresentInTree(Tree tree, int a) {
		boolean left = false;
		boolean right = false;
		boolean final_state = false;
		if (tree != null) {
			if (tree.getData() == a) {
				return true;
			}
			left = isPresentInTree(tree.getLeft(), a);
			right = isPresentInTree(tree.getRight(), a);
		}
		if (left) {
			final_state = left;
		}
		if (right) {
			final_state = right;
		}
		return final_state;

	}

	/**
	 * This function returns the number of nodes in the tree.
	 * 
	 * @param tree
	 * @return
	 */
	public int sizeOfTree(Tree tree) {
		if (tree == null) {
			return 0;
		} else
			return (sizeOfTree(tree.getLeft()) + 1 + sizeOfTree(tree.getRight()));

	}

	/**
	 * This method returns the number of leaf node in a given tree.
	 * This method is using recursion.
	 * @param tree
	 * @return
	 */
	public int numberOfLeaves(Tree tree) {
		int leaf_left = 0, leaf_right = 0;
		if (tree == null)
			return 0;
		if (tree.getLeft() == null && tree.getRight() == null) {
			return 1;
		}
		leaf_left = leaf_left + numberOfLeaves(tree.getLeft());
		leaf_right = leaf_right + numberOfLeaves(tree.getRight());
		return leaf_left + leaf_right;
	}
	
	/**
	 * This method return number of leaves without recursion.
	 * @param tree
	 * @return
	 */
	public int numberOfLeavesWOR(Tree tree){
		
		
		return 0;
		
	}
	
	/**
	 *     						   10
	 *						     /    \
	 *						    6      14
	 *						   / \    /  \
	 *						  5   8  11  18
	 *
	 * Tree Glossary Programming.
	 * 1.  The root of a tree is the node with no parents.
	 * 2.  An edge refer to the link from parent to child.
	 * 3.  A node with no children is called the leaf of the node.(Print all the leaf node.)
	 * 4.  Children of the same parents are called sibling.
	 * 5.  A node p is an ancestor of a node q if there exists a path from root to q and p appears on the path.
	 * 6.  The node q is called descendants of p.if there exists a path from the root to q and p appears in the path.
	 * 7.  Size of a node is the number of descendants it has including itself.
	 * 8.  Set of all node at a given depth is called level of the tree. The root node is at the level zero.
	 * 9.  The depth of a node is the length of the path from the root to the node.
	 * 10. The height of a node is the length of the path from that node to the deepest node.
	 * 11. The height of a tree is the length of the path from from that root to the deepest node.
	 * 12. Height of the tree is the is the maximum height among all the nodes in the tree and depth of the tree is 
	 * 	   - the maximum depth among all the nodes in the tree. For a given tree height and depth return the same value.
	 * 	   - but for individual node we may get different results.
	 * 13. If every node in a tree has only one child the we call such tree as skew trees. If every node has only left child
	 * 	   - then we call them as left skew tree. similarly if every node has on;y right child then we call them as right skew trees.
	 * 14. A tree is called binary tree if each node has zero child, one child or two child.
	 * 15. Empty tree is also valid binary tree.
	 * 16. A binary tree is strict binary tree if each node has exactly two children or no children.
	 * 17. A binary is full binary tree if each node has exactly two children and all the leaf nodes are at the same level.
	 * 18. A binary tree is called complete binary tree if all the leaf at the height h or h-1.
	 */
	
	//The root of a tree is the node with no parents.
	public int getRoot(Tree tree){
		int dt=0;
		if(null!=tree)
			dt=tree.getData();
		return dt;
	}
	
	// A node with no children is called the leaf of the node.(Print all the leaf node.)
	public void printLeafNodes(Tree tree){
		if(tree==null){
			return;
		}
		
		if(tree.getLeft()==null||tree.getRight()==null){
			System.out.println(tree.getData());
		}
		printLeafNodes(tree.getLeft());
		printLeafNodes(tree.getRight());
	}
	
	public ArrayList<Integer> getNodes(Tree tree){
		ArrayList<Integer> array = new ArrayList<>();
		if(tree==null){
			return null;
		}else if(tree.getLeft()==null&&tree.getRight()==null){
			array.add(tree.getData());
			//System.out.println(tree.getData());
			return array;
		}
		ArrayList<Integer> arrayLeft = getNodes(tree.getLeft());
		ArrayList<Integer> arrayRight = getNodes(tree.getRight());
		//This part is needed because we need to merger the array list and then return.
		if(arrayRight!=null){
		for (Iterator<Integer> iterator = arrayRight.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			array.add(integer);
			
		}}
		if(arrayLeft!=null){
		for (Iterator<Integer> iterator = arrayLeft.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			array.add(integer);
		}}
		return array;
		
	}
	
	//A node p is an ancestor of a node q if there exists a path from root to q and p appears on the path.
	//Print all the ancestor of a given node.
	//To check if the given node is ancestor or not, search in the list if it present then it is ancestor else not.
	public List<Integer> getAncestor(Tree tree, int data){
		List<Integer> array = new ArrayList<>();
		List<Integer> arrayLeft=null;
		List<Integer> arrayRight=null;
		boolean found=false;
		if(tree==null){
			//System.out.println("The element you are looking for is not found."); you can not because 
			//due to recursion it can become null.
			return null;
		}else if((tree.getLeft() != null && tree.getLeft().getData() == data) || (tree.getRight() != null && tree.getRight().getData() == data)){
			array.add(tree.getData());
			found=true;
			//System.out.println(tree.getData());
			return array;
		}else{
			array.add(tree.getData());
		}
		if(tree.getData()>data){
			arrayLeft = getAncestor(tree.getLeft(),data);
		}else{
			arrayRight = getAncestor(tree.getRight(),data);
		}
		
		
		if(arrayRight!=null){
			for (Iterator<Integer> iterator = arrayRight.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				array.add(integer);
				found=true;
				
			}}
			if(arrayLeft!=null){
			for (Iterator<Integer> iterator = arrayLeft.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				array.add(integer);
				found=true;
			}}
			if(found){
				return array;
			}else
				return null;
	}
	
	// Size of a node is the number of descendants it has including itself.
	
	public int sizeOfNode(Tree tree){
		
		if(tree==null){
			return 0;
		}
			
		return (sizeOfNode(tree.getLeft())+1+sizeOfNode(tree.getRight()));
	}
	
	//The depth of a node is the length of the path from the root to the node.
	//you can do this wihtout recusrion using stack.
	
	public int depthOfNode(Tree tree, Tree node){
		int left=0;
		int right=0;
		if(tree==null){
			System.out.println("Tree can not be null; Exception has to be thrown. This means it is not found.");
			return 0;
		}else if(tree.getData()==node.getData()){
			return 0;
		}
		if(tree.getData()>node.getData()){
			left = left+1+depthOfNode(tree.getLeft(),node);
		}else{
			right = right+1+depthOfNode(tree.getRight(),node);
		}
		return left>right?left:right;
	}
	
	//The height of a node is the length of the path from that node to the deepest node.
	//The height of a tree is the length of the path from from that root to the deepest node.
	//for tree height pass the root node.
	public int heightOfNode(Tree tree){
		int left=0;
		int right=0;
		if(tree==null){
			return 0;
		}
			left = left+1+heightOfNode(tree.getLeft());
			right = right+1+heightOfNode(tree.getRight());
		return left>right?left:right;
	}
	
	
	//Check if the given tree is binary search tree. time complexity should be o(n);
	public boolean isBST(Tree tree, int data){
		if(tree==null){
			return true;
		}
		//inoder traversal and make sure you dont pass null to isBST.
		if(!isBST(tree.getLeft(), data))return false;
		if(tree.getData()<data)return false;
		data= tree.getData();
		return isBST(tree.getRight(), data);
	}
	
			
}
