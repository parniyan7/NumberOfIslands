# Number of Islands

This is a solution for the Number of Islands problem implemented in Kotlin. The problem statement is as follows:

Given a 2D grid `grid` of `'1'`s (land) and `'0'`s (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

## Solution

The solution uses Depth First Search (DFS) to traverse all the cells in the grid and mark all the adjacent cells that belong to the same island as visited. We iterate through all the cells in the grid and if we encounter a cell that is `'1'`, we increment the counter for the number of islands and call the DFS function to mark all the cells that belong to the same island as visited.

The DFS function recursively calls itself to visit all the adjacent cells that belong to the same island. We mark the current cell as visited by changing its value to `'0'`. We then recursively call the DFS function on all the adjacent cells that have a value of `'1'`.

## Usage

To use this solution, create an instance of the `Solution` class and call the `numIslands` method, passing in the `grid` as a parameter. The `grid` should be a 2D array of `Char`s.

```kotlin
val solution = Solution()
val grid = arrayOf(
    charArrayOf('1', '1', '0', '0', '0'),
    charArrayOf('1', '1', '0', '0', '0'),
    charArrayOf('0', '0', '1', '0', '0'),
    charArrayOf('0', '0', '0', '1', '1')
)
val result = solution.numIslands(grid)
println(result) // Output: 3
```

In this example, the `grid` represents a map of land and water, where each `'1'` represents land and each `'0'` represents water. There are 3 islands in the grid.
