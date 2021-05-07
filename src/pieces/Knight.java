package pieces;

import board.Tile;
import java.util.ArrayList;

public class Knight extends Piece {
   Knight (boolean whiteSide, String boardPosition, String iconPath) {
    super(whiteSide, boardPosition, iconPath);
  }

  @Override
  public ArrayList<Tile> moves (Tile position [][], int x, int y) {
    possibleMoves.clear();

    final int movesX [] = {x + 2, x + 2, x - 2, x - 2, x + 1, x - 1, x + 1, x - 1};
    final int movesY [] = {y + 1, y - 1, y + 1, y - 1, y + 2, y + 2, y - 2, y - 2};

    for (int i = 0; i < DIMENSION; i += 1) {
      int xPos = x + movesX[i];
      int yPos = y + movesY[i];

      if (isValidPos(xPos, yPos) && position[xPos][yPos].isLegalPosition(position[x][y])) {
        possibleMoves.add(position[xPos][yPos]);
      }
    }
    return possibleMoves;
  } 
}
