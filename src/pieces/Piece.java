package pieces;

import board.Tile;
import java.util.ArrayList;

public abstract class Piece implements Cloneable {
  private boolean whiteSide;
  private String boardPosition;
  private String iconPath;
  public ArrayList<Tile> possibleMoves;

  Piece (boolean whiteSide, String boardPosition, String iconPath) {
    this.whiteSide = whiteSide;
    this.boardPosition = boardPosition;
    this.iconPath = iconPath;
    possibleMoves = new ArrayList<Tile>();
  }

  public abstract ArrayList<Tile> moves (Tile position [][], int x, int y);

  private boolean isValidPos (final int x, final int y) {
    return (x >= 0 && y >= 0 && x < DIMENSION && y < DIMENSION);
  }
}
