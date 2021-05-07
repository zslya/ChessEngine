package pieces;

import board.Tile;
import java.util.ArrayList;

public class Pawn extends Piece {
  public boolean hasMoved;

  Pawn (boolean whiteSide, String boardPosition, String iconPath) {
    super(whiteSide, boardPosition, iconPath);
    this.hasMoved = false;
  }

  @Override
  public ArrayList<Tile> moves (Tile position [][], int x, int y) {
    possibleMoves.clear();

    if (!this.hasMoved) {
      possibleMoves.add(position[x + 2][y]);
    }
    if (isValidPos(x + 1, y) && position[x+1][y].isLegalPosition(position[x][y])){
      possibleMoves.add(position[x + 1][y]);
    }

    if (isValidPos(x+1,y+1) && position[x+1][y+1].isOppositeColour(position[x][y])) {
      possibleMoves.add(position[x + 1][y + 1]);
    }
    if (isValidPos(x-1,y+1) && position[x+1][y+1].isOppositeColour(position[x][y])) {
      possibleMoves.add(position[x - 1][y + 1]);
    }

    // Need to work on the scenario where the pawn reaches the end of the board
    return possibleMoves;
  }
}
