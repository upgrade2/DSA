package bossCoder.assignments.Arrays_Math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZeroOneMatrix {

    public static List<List<Integer>> solve(List<List<Integer>>  input){
    int n = input.size();
    int m = input.get(0).size();
    int[][] visited = new int[n][m];
    int[][] dist = new int[n][m];
    List<List<Integer>> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(input.get(i).get(j)==0){
                    q.add(new Node(i,j,0));
                    visited[i][j]=1;
                }
                else {
                   visited[i][j]=0;
                }
            }
        }
        int[] delRow = {-1,0,+1,0};
        int[] delCol = {0,+1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int steps = q.peek().steps;
            q.remove();
            dist[row][col] = steps;
            for (int i=0; i<4; i++){
                int nRow = row+delRow[i];
                int nCol = col+delCol[i];
                if( nRow >=0 && nRow <n &&
                        nCol >=0 && nCol <m
                        && visited[nRow][nCol] ==0
                ){
                    visited[nRow][nCol]=1;
                    q.add(new Node(nRow,nCol,steps+1));
                }
            }
        }

        for(int[] d: dist){
            List<Integer> innerList = new ArrayList<>();
            for(int i:d){
                innerList.add(i);
            }
            result.add(innerList);
        }
    return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        List<List<Integer>> list = new ArrayList<>();

        for (int[] row : mat) {
            List<Integer> innerList = new ArrayList<>();
            for (int num : row) {
                innerList.add(num);
            }
            list.add(innerList);
        }
        List<List<Integer>> res =solve(list);
        System.out.println(res);

    }
}

class Node{
    int row;
    int col;
    int steps;
    Node(int row,int col,int steps){
        this.row=row;
        this.col=col;
        this.steps=steps;
    }
}
