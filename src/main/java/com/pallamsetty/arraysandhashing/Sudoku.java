package com.pallamsetty.arraysandhashing;

/*
* Leetcode 36
* */

import java.util.HashMap;
import java.util.HashSet;

public class Sudoku {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colMap = new HashMap<>();
        HashMap<String, HashSet<Character>> squareMap = new HashMap<>();

        int length = 9;

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(board[i][j] == '.') {
                    continue;
                }

                String squareIndexes = (i / 3) + "_" + (j / 3);
                if(rowMap.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j])
                        || colMap.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j])
                        || squareMap.computeIfAbsent(squareIndexes, k -> new HashSet<>()).contains(board[i][j])) {
                    return false;
                }

                rowMap.get(i).add(board[i][j]);
                colMap.get(j).add(board[i][j]);
                squareMap.get(squareIndexes).add(board[i][j]);
            }
        }

        return true;
    }
}
