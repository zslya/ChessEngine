package pieces;

import board.Tile;
import java.util.ArrayList;

public abstract class Piece {
  private boolean whiteSide;
  private String boardPosition;
  private String iconPath;
  private ArrayList<Tile> possibleMoves;

  Piece (boolean whiteSide, String boardPosition, String iconPath) {
    this.whiteSide = whiteSide;
    this.boardPosition = boardPosition;
    this.iconPath = iconPath;
    possibleMoves = new ArrayList<Tile>();
  }

  public abstract ArrayList<Tile> moves (Tile position [][], int x, int y);
}
