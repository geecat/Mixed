package com.geecat.fiberlink;

/**
 * http://math.stackexchange.com/questions/357057/convex-polygon-with-18-
 * vertices-and-points-of-intersection-of-the-diagonals
 * 
 * @author Geecat
 * 
 */
class TestClass11 {
	public static void main(String args[]) throws Exception {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// String line = br.readLine();
		System.out.println(runCustomerSimulation(1, "ABCBCA"));

	}

	static int runCustomerSimulation(int numComputers, String customers) {

		// Number computer to begin with
		int availableComp = numComputers;
		// This will contain the total number of customer left if any.
		int customerLeft = 0;

		//a map to store the customer queue.
		int[] map = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		//a map to store the computer use queue by customer..
		int[] mapUsing = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		char[] input = customers.toCharArray();
		for (char c : input) {
			int index = c - 65;
			if (map[index] != 0&&mapUsing[index]==1) {
				map[index] = 0;
				mapUsing[index]=0;
				availableComp = availableComp + 1;
				//this will also not work what if Z comes before B.
				/*for (int i = 0; i < map.length; i++) {
					if(map[i]==1&&mapUsing[i]==0){
						mapUsing[i]=1;
						customerLeft = customerLeft-1;
						availableComp = availableComp - 1;
					}
				}*/
			} else if (availableComp > 0&&map[index]==0) {
				
				map[index] = 1;
				mapUsing[index] = 1;
				availableComp = availableComp - 1;
			}else{
				if(map[index] ==1){
					map[index] = 0;
				}else{
					map[index] = 1;
					customerLeft=customerLeft+1;
				}
				
			}
		}

		return customerLeft;

	}

}
