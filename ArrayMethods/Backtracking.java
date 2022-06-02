import java.util.*;
public class Backtracking {
    public static int N;
    public static void printSolution(int solution[][]){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(solution[i][j]+" ");
            }
               System.out.println("");
        }
    }
    public static boolean helper(int problem[][],int solution[][],int x,int y){
        if(x==N-1 && y==N-1 && problem[x][y]==1){
            solution[x][y] = 1;
        return true;     
    }
    if(x>=0 && x<=N-1 && y>=0 && y<=N-1 && problem[x][y]==1){
        if(solution[x][y]==1){
            return false;
        }
        solution[x][y]=1;
        if(helper(problem,solution,x+1,y)==true)
        return true;
        if(helper(problem,solution,x,y+1)==true)
        return true;
        if(helper(problem,solution,x-1,y)==true)
        return true;
        if(helper(problem,solution,x,y-1)==true)
        return true;
        solution[x][y]=0;
        return false;

    }
    return false;
    }
    public static boolean problemSolution(int problem[][]){
     int solution[][] = new int[N][N];
     if(helper(problem,solution,0,0)==false){
         System.out.println("No Solution Exists!");
         return false;
     }
     printSolution(solution);
     return true;
    }

    public static void main(String args[]){
        int problem[][]={
            {1,0,0,1},
            {1,1,1,1},
            {1,1,0,1},
            {1,1,0,1},
        };
        N=problem.length;
        problemSolution(problem);
    }
}
