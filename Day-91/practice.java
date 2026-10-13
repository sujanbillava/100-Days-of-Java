import java.io.*;
import java.util.*;

public class practice 
{
    static void findpath(int[][]maze,int row,int col,String path)
    {
        if(row==2 && col==2)
        {
            System.out.println(path);
            return;
        }
        if(row<0||col<0||row>=maze.length||col>=maze[0].length||maze[row][col]==1)
        {
            return;
        }
        findpath(maze,row+1,col,path+"D");
        findpath(maze,row,col+1,path+"R");

    }
    public static void main(String[] args) 
    {
        int[][]maze={{0,0,0},{0,1,0},{0,0,0}};
        findpath(maze,0,0,"");
    }    
}
