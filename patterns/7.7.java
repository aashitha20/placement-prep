//7.7 Spiral order of a 2D matrix (clockwise)
List<Integer> spiral(int[][] mat) {
    int top = 0, bottom = mat.length - 1, left = 0, right = mat[0].length - 1;
    List<Integer> res = new ArrayList<>();
    while (top <= bottom && left <= right) {
        for (int j = left; j <= right; j++) res.add(mat[top][j]); top++;
        for (int i = top; i <= bottom; i++) res.add(mat[i][right]); right--;
        if (top <= bottom) {
            for (int j = right; j >= left; j--) res.add(mat[bottom][j]); bottom--;
        }
        if (left <= right) {
            for (int i = bottom; i >= top; i--) res.add(mat[i][left]); left++;
        }
    }
    return res;
}
