package Backtracking;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = { { 0, 1, 0, 0}, { 0, 0, 0, 0}, {0, 1, 0, 0} };
		
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		
		Maze(grid, 0, 0, "", visited);
	}
	public static void Maze(int[][] grid, int row, int col, String ans, boolean[][] visited)
	{
		if(row == grid.length-1 && col == grid[0].length-1)
		{
			System.out.println(ans);
			return;
		}
		if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col] ||grid[row][col] == 1)
		{
			return;
		}
		
		visited[row][col] = true;
		
		Maze(grid, row-1, col, ans+"T", visited);
		Maze(grid, row+1, col, ans+"D", visited);
		Maze(grid, row, col-1, ans+"L", visited);
		Maze(grid, row, col+1, ans+"R", visited);
		
		visited[row][col] = false;
	}

}
