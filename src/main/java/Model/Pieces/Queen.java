package Model.Pieces;


public class Queen extends ChessPiece{

    public Queen(boolean isWhite)
    {
        super(isWhite, "Queen");
    }
    
    @Override
    public boolean checkMove(String currCoordinate, String destCoordinate) throws IllegalArgumentException
    {
        this.checkCoordinate(currCoordinate);
        this.checkCoordinate(destCoordinate);
        
        int colDiff = currCoordinate.charAt(0) - destCoordinate.charAt(0);
        int rowDiff = currCoordinate.charAt(1) - destCoordinate.charAt(1);
        
        if(rowDiff == 0 && colDiff !=0)
        {
            return true;
        } 
        else if (colDiff == 0 && rowDiff !=0)
        {
            return true;
        }
        else 
        {
            return colDiff == rowDiff;
        }
    }   
}
