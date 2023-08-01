fun main(args: Array<String>) {
    val solution = Solution()
    val grid = arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1')
    )
    val result = solution.numIslands(grid)
    println(result) // Output: 3
}
class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        // Check for empty grid
        if (grid.isEmpty() || grid[0].isEmpty()) {
            return 0
        }
        val rows = grid.size
        val cols = grid[0].size
        var islands = 0

        // Traverse the grid and count the number of islands
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (grid[i][j] == '1') {
                    islands++
                    dfs(grid, i, j)
                }
            }
        }
        return islands
    }

    // Depth-first search to mark all adjacent cells as visited
    private fun dfs(grid: Array<CharArray>, row: Int, col: Int) {
        if (row < 0 || col < 0 || row >= grid.size || col >= grid[0].size || grid[row][col] != '1') {
            return
        }
        grid[row][col] = '0'
        dfs(grid, row - 1, col)
        dfs(grid, row + 1, col)
        dfs(grid, row, col - 1)
        dfs(grid, row, col + 1)
    }
}