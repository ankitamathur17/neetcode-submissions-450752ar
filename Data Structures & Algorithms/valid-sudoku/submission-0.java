class Solution {
    public boolean isValidSudoku(char[][] board) {
    //  HashSet <Character> rows=new HashSet <Integer>();
    //  HashSet <Character> columns= new HashSet <Integer>();
     HashMap<Integer,Character>squares=new HashMap<>();

    //row check
     for(int i=0;i<9;i++){
        HashSet <Character> rows=new HashSet <>();
       
        for(int j=0;j<9;j++){
            if((board[i][j]>='1' && board[i][j]<='9') && (!rows.contains(board[i][j]))){
                rows.add(board[i][j]);
            }else if(board[i][j] != '.' && rows.contains(board[i][j])){
                return false;
            }
        }
     }

        //col check
     for(int i=0;i<9;i++){
        HashSet <Character> columns= new HashSet <>();
        for(int j=0;j<9;j++){
            if((board[j][i]>='1' && board[j][i]<='9') && !columns.contains(board[j][i])){
                columns.add(board[j][i]);
            }else if(board[j][i] != '.' && columns.contains(board[j][i])){
                return false;
            }
        }
     }

     // square check
     for (int block = 0; block < 9; block++) {
         HashSet<Character> square = new HashSet<>();
         for (int i = 0; i < 3; i++) { 
             for (int j = 0; j < 3; j++) {
                 int r = (block / 3) * 3 + i;  //0+0 =0
                 int c = (block % 3) * 3 + j;  //3*3+0 =9 
                    System.out.println("r="+r+"c="+c+"board[r][c]"+board[r][c]);
                 if (board[r][c] != '.') {
                     if (square.contains(board[r][c])) return false;
                     square.add(board[r][c]);
                 }
             }
         }
     }

     return true;

    }
}
