package com.geecat.steps.tree;

import java.util.TreeMap;




/**
 * 							   10
 *						     /    \
 *						    6      14
 *						   / \    /  \
 *						  5   8  11  18
 * @author Geecat
 *
 */
public class Main {
	// 0 is considered as empty tre.
	public static void main(String[] args) {
		TreeOperation treeOperation = new TreeOperation();
		int a[] = { 10, 6, 14, 5, 8, 11, 18,7,19,20,21 };
		Tree myFirstTree = treeOperation.createTree(a);
		
		TreeMap  map;
		//System.out.println("Max value in the given tree is: "+treeOperation.maxOfTree(myFirstTree, myFirstTree.getData()));
		//System.out.println("Check if a value is present : "+treeOperation.isPresentInTree(myFirstTree, 180));
		//System.out.println("Size of the given tree is : "+treeOperation.sizeOfTree(myFirstTree));
		//System.out.println("Number of leaf node in the given tree is : "+treeOperation.numberOfLeaves(myFirstTree));
		/*ArrayList<Integer> list = treeOperation.getNodes(myFirstTree);
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}*/
		//treeOperation.printLeafNodes(myFirstTree);
		
		/*ArrayList<Integer> list = treeOperation.getAncestor(myFirstTree,1);
		if(list!=null){
			for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				System.out.println(integer);
			}
		}else{
			System.out.println("Unfortunately the element you provided does not exists.");
		}
		*/
		
		//System.out.println(treeOperation.sizeOfNode(myFirstTree));
	//	Tree tree = new Tree(18);
		//System.out.println(treeOperation.heightOfNode(myFirstTree.getRight().getRight()));
		//System.out.println("Max value in the tree is: "+treeOperation.maxOfTree(myFirstTree, 0));
		//System.out.println("Min value in the tree is: "+treeOperation.minOfTree(myFirstTree, 0));
		System.out.println("Is BST "+treeOperation.isBST(myFirstTree,5));
	}

	
}
