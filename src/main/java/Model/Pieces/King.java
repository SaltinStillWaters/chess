
package Model.Pieces;

public class King extends ChessPiece{

    public King(boolean isWhite)
    {
        super(isWhite, "King");
    }
    
    @Override
    public boolean checkMove(String currCoordinate, String destCoordinate) {
        int colDiff = currCoordinate.charAt(0) - destCoordinate.charAt(0);
        int rowDiff = currCoordinate.charAt(1) - destCoordinate.charAt(1);
        
        if(rowDiff == 0 && colDiff == 1){
            return true;
        } else if (colDiff == 0 && rowDiff == 1){
            return true;
        } else return colDiff == 1 && rowDiff ==1;
    }
}
