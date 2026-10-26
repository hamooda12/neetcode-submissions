class Solution {
   public boolean isValidSudoku(char[][] board) {
    Map<Integer, Set<Character>> cols = new HashMap<>();
    Map<Integer, Set<Character>> squares = new HashMap<>();
    int set = 0;
    int before = 0;

    for(int i = 0; i < 9; i++){
      Set<Character> rows = new HashSet<>();
      if(i % 3 == 0 && i != 0) set+=3;
      before=set;

      for(int j =0; j <9;j++){
        if(j % 3 == 0 && j != 0) set++;
        if(board[i][j] == '.') continue;

        if((cols.containsKey(j) &&
                cols.get(j).contains(board[i][j]) )||
                rows.contains(board[i][j])
                || squares.containsKey(set) && squares.get(set).contains(board[i][j])) {
          return false;
        }
        rows.add(board[i][j]);

        cols.put(j,cols.getOrDefault(j, new HashSet<>()));
        cols.get(j).add(board[i][j]);


        squares.put(set, squares.getOrDefault(set, new HashSet<>()));
        squares.get(set).add(board[i][j]);
      }
      set=before;
    }
    return true;

  }
}