class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        row_counts = {}

        for row in grid:
            row_tup = tuple(row)  
            row_counts[row_tup] = row_counts.get(row_tup, 0) + 1

        match_count = 0
        n = len(grid)

        for c in range(n):
            col_tup = tuple(grid[r][c] for r in range(n))

            if col_tup in row_counts:
                match_count += row_counts[col_tup]

        return match_count
