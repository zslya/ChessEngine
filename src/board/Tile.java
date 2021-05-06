package board;

import pieces.*;

public class Tile {
  private boolean occupied;
  private Piece piece;
  private int colour;

  Tile (int colour, Piece piece) {
    if (piece != null) {
      this.occupied = true;
    }
    else {
      this.occupied = false;
    }
    this.piece = piece;
    this.colour = colour;
  }

  public boolean isLegalPosition (final Tile anotherTile) {
    return (!occupied || anotherTile.colour != this.colour); 
  }
}
