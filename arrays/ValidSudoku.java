package arrays;

import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char current_val=board[i][j];
                if(current_val!='.')
                if(     !seen.add(current_val+"found at row"+i)||
                        !seen.add(current_val+"found at col"+j)||
                        !seen.add(current_val+"found at box"+i/3+"-"+j/3)
                ){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] input= {{'1','2','.','.','3','.','.','.','.'},
                        {'4','.','.','5','.','.','.','.','.'},
                        {'.','9','1','.','.','.','.','.','3'},
                        {'5','.','.','.','6','.','.','.','4'},
                        {'.','.','.','8','.','3','.','.','5'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','.','.','.','.','.','2','.','.'},
                        {'.','.','.','4','1','9','.','.','8'},
                        {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(input));
        }


    }

