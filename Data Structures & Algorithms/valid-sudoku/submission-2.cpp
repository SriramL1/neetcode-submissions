class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        // for each row index from 0-8, create an empty set
        for(int row = 0; row < 9; row++){
            unordered_set<char> seen;
            // for each column index i from 0-8
            for(int i = 0; i < 9; i++){
                //Skip the cell if its "."
                if(board[row][i] == '.') continue;
                // if the value is already seen, return false
                if(seen.count(board[row][i])) return false;
                //otherwise add it to seen
                seen.insert(board[row][i]);
            }
        }
        // for each column index from 0-8
        for(int col = 0; col < 9; col++){
            unordered_set<char> seen;
            // for each row index i from 0-8
            for(int i = 0; i < 9; i++){
                //Skip the cell if its "."
                if(board[i][col] == '.') continue;
                // if the value is already seen, return false
                if(seen.count(board[i][col])) return false;
                //otherwise add it to seen
                seen.insert(board[i][col]);
            }
        }

        // for each square of 3x3 set from 0 to 8
        for(int square = 0; square < 9; square++){
            //create empty set
            unordered_set<char> seen;
            // for i going from 0 to 2 & for j going from 0 to 2
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    // computer the row and square values based on the index loops
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    //Skip the cell if its "."
                    if(board[row][col] == '.') continue;
                    // if the value is already seen, return false
                    if(seen.count(board[row][col])) return false;
                    //otherwise add it to seen
                    seen.insert(board[row][col]);
                }
            }
        }
        return true;
    }
};
