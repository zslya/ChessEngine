package pieces;

import board.Tile;
import java.util.ArrayList;

public class Bishop extends Piece {
  Bishop (boolean whiteSide, String boardPosition, String iconPath) {
    super(whiteSide, boardPosition, iconPath);
  }

  @Override
  public ArrayList<Tile> moves (Tile position [][], int x, int y) {
    possibleMoves.clear();

    for (int i = x + 1, j = y + 1; i < DIMENSION && j < DIMENSION; i += 1, j += 1) {
      if (isValidPos(i, y) && position[i][y].isLegalPosition(position[x][y])) {
        possibleMoves.add(position[i][y]);
      }
      else {
        break;
      }
    }
    for (int i = x + 1, j = y - 1; i < DIMENSION && j >= 0; i += 1, j -= 1) {
      if (isValidPos(i, y) && position[i][y].isLegalPosition(position[x][y])) {
        possibleMoves.add(position[i][y]);
      }
      else {
        break;
      }
    }
    for (int i = x - 1, j = y + 1; i >= 0 && j < DIMENSION; i -= 1, j += 1) {
      if (isValidPos(i, y) && position[i][y].isLegalPosition(position[x][y])) {
        possibleMoves.add(position[i][y]);
      }
      else {
        break;
      }
    }
    for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i -= 1, j -= 1) {
      if (isValidPos(i, y) && position[i][y].isLegalPosition(position[x][y])) {
        possibleMoves.add(position[i][y]);
      }
      else {
        break;
      }
    }
    return possibleMoves;
  }
}
