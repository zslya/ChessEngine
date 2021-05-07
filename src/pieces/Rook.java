package pieces;

import board.Tile;
import java.util.ArrayList;

public class Rook extends Piece {

  Rook (boolean whiteSide, String boardPosition, String iconPath) {
    super(whiteSide, boardPosition, iconPath);
  }

  @Override
  public ArrayList<Tile> moves (Tile position [][], int x, int y) {
    possibleMoves.clear();

    for (int i = x + 1; i < DIMENSION; i += 1) {
      if (isValidPos(i, y) && position[i][y].isLegalPosition(position[x][y])) {
        possibleMoves.add(position[i][y]);
      }
      else {
        break;
      }
    }
    for (int i = x - 1; i >= 0; i -= 1) {
      if (isValidPos(i, y) && position[i][y].isLegalPosition(position[x][y])) {
        possibleMoves.add(position[i][y]);
      }
      else {
        break;
      }
    }
    for (int i = y + 1; i < DIMENSION; i += 1) {
      if (isValidPos(x, i) && position[x][i].isLegalPosition(position[x][y])) {
        possibleMoves.add(position[x][i]);
      }
      else {
        break;
      }
    }
    for (int i = y - 1; i >= 0; i -= 1) {
      if (isValidPos(x, i) && position[x][i].isLegalPosition(position[x][y])) {
        possibleMoves.add(position[x][i]);
      }
      else {
        break;
      }
    }
    return possibleMoves;
  }
}
