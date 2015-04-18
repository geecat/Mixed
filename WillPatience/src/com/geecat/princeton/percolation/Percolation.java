package com.geecat.princeton.percolation;

public class Percolation {

	int grid[][];

	// create N-by-N grid, with all sites blocked
	public Percolation(int N) {
		grid = new int[N][N];
	}

	// open site (row i, column j) if it is not already
	public void open(int i, int j) {
		grid[i][j] = 1;
	}

	// is site (row i, column j) open?
	public boolean isOpen(int i, int j) {
		return grid[i][j] == 1 ? true : false;
	}

	// is site (row i, column j) full?
	public boolean isFull(int i, int j) {
		return true;
	}

	// does the system percolate?
	public boolean percolates() {
		return true;
	}
}
