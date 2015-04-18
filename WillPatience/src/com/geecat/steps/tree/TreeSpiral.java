package com.geecat.steps.tree;

public class TreeSpiral {

	public static void main(String[] args) {
		TreeOperation treeOperation = new TreeOperation();
		String s = "Ravi";
		s.toCharArray();
		char [] char1 = s.toCharArray();
		int a[] = { 10, 6, 14, 5, 8, 11, 18,4,21,3,35 };
		Tree myFirstTree = treeOperation.createTree(a);
		int h = treeOperation.heightOfNode(myFirstTree);
		boolean ltr = false;
		
		for(int i=1; i<=h; i++)
	    {
			spiralPrint(myFirstTree, ltr, i);
	 
	        /*Revert ltr to traverse next level in oppposite order*/
	        ltr = !ltr;
	    }
		

	}

	private static void spiralPrint(Tree tree, boolean ltr, int h) {

		if(tree == null)
	        return;
	    if(h == 1)
	        System.out.println(tree.getData());
	    else if(h>1) {
	    	if(ltr){
	    		spiralPrint(tree.getLeft(),ltr,h-1);
	    		spiralPrint(tree.getRight(),ltr,h-1);
	    	}else{
	    		spiralPrint(tree.getRight(),ltr,h-1);
	    		spiralPrint(tree.getLeft(),ltr,h-1);
	    	}
	    }
	}

}
