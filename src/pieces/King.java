package pieces;

import board.Tile;
import java.util.ArrayList;

public class King extends Piece {
  public final int DIMENSION = 8;

  King (boolean whiteSide, String boardPosition, String iconPath) {
    super(whiteSide, boardPosition, iconPath);
  }

  public boolean possibleCheckmate (Tile position [][]) {
  } 

  @Override
  public ArrayList<Tile> moves (Tile position [][], int x, int y) {
    // {up, left, down, right, upleft, downleft, downright, upright}
    final int movesX [] = {x + 1, x, x - 1, x, x + 1, x - 1, x - 1, x + 1};
    final int movesY [] = {y, y - 1, y, y + 1, y - 1, y - 1, y + 1, y + 1};

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
