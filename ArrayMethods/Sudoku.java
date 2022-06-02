import java.util.*;
public class Sudoku{
    public static int[][] GRID_TO_SOLVE = {
        {9,0,0,1,0,0,0,0,5},
        {0,0,5,0,9,0,2,0,1},
        {8,0,0,0,4,0,0,0,0},
        {0,0,0,7,0,0,0,0,0},
        {0,0,0,0,2,6,0,0,9},
        {2,0,0,3,0,0,0,0,6},
        {0,0,0,2,0,0,9,0,0},
        {0,0,1,9,0,4,5,7,0},
    };
    private int[][] board;
    private static final int EMPTY =0;
    private static final int Size = 9;
         public Sudoku(int[][] board){
             this.board = new int[Size][Size];
             for(int i=0;i<Size-1;i++){
                 for(int j=0;j<Size-1;j++){
                      this.board[i][j] = board[i][j];
                }
            }
        }
         private boolean isInRow(int row,int Number){
             for(int i=row;i<Size;i++){
                 if(board[row][i]==Number){
                     return true;
                }  
            }
             return false;
        }
        
         private boolean isInCol(int col,int Number){
            for(int i=col;i<Size;i++){
                if(board[i][col]==Number){
                    return true;
                
                }
             }
            return false;
        }
        private boolean isInBox(int row,int col,int Number){
            int r = row-row%3;
            int c = col-col%3;
            for(int i=r;i<r+3;i++){
                for(int j=c;j<c+3;j++){
                    if(board[i][j]==Number){
                    return true;
                    }
                  
                }
            }
            return false;
        } 
        private boolean isOk(int row,int col,int Number){
           return !isInRow(row,Number) && !isInCol(col,Number) && !isInBox(row,col,Number);
        }
        public boolean solve(){
            for(int row=0;row<Size;row++){
                for(int col=0;col<Size;col++){
                    if(board[row][col]==EMPTY){
                        for(int number=0;number<=Size;number++){
                            if(isOk(row,col,number)){
                                board[row][col]=number;
                                if(solve()){
                                    return true;
                                }
                                else{
                                    board[row][col]=EMPTY;
                                }
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        public void display(){
            for(int i=0;i<Size;i++){
                for(int j=0;j<Size;j++){
                    System.out.print(" "+board[i][j]);
                }
                System.out.println(" ");
            }
            System.out.println("");
        }
        public static void main(String args[]){
            Sudoku sudoku = new Sudoku(GRID_TO_SOLVE);
            System.out.println("Sudoku grid to solve");
            sudoku.display();
            if(sudoku.solve()){
                System.out.println("Sudoku grid solved with simple BackTracking");
                sudoku.display();
            }
            else{
                System.out.println("Sudoku grid is not solved");
            }
        }
    }
          
      /* o/p:
      Sudoku grid solved with simple BackTracking
      9 2 3 1 5 7 4 6 8 
      1 4 5 6 9 3 2 1 7 
      8 6 7 8 4 2 3 5 9 
      3 1 4 7 1 5 2 3 4 
      5 7 8 4 2 6 1 5 8 
      2 9 6 3 9 8 6 9 7 
      4 2 3 2 1 3 9 1 2 
      6 5 1 9 5 4 5 7 3
      7 8 9 6 8 7 4 6 8  */


