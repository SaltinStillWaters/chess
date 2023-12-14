package Model.Pieces;


public class King extends ChessPiece
{
    private boolean hasMoved;
    
    public King(boolean isWhite)
    {
        super(isWhite, "King");
        hasMoved = false;
    }
    
    @Override
    public boolean checkMove(String currCoordinate, String destCoordinate) throws IllegalArgumentException
    {
        this.checkCoordinate(currCoordinate);
        this.checkCoordinate(destCoordinate);
        
        int colDiff = currCoordinate.charAt(0) - destCoordinate.charAt(0);
        int rowDiff = currCoordinate.charAt(1) - destCoordinate.charAt(1);
        
        if(rowDiff == 0 && colDiff == 1)
        {
            return true;
        } 
        else if (colDiff == 0 && rowDiff == 1)
        {
            return true;
        } 
        else    
        {
            return (colDiff == 1 && rowDiff == 1);
        }
    }
    
    /**
     * Returns a boolean whether or not the King has moved.
     * @return 
     */
    public boolean getHasMoved()
    {
        return this.hasMoved;
    }
    
    /**
     * Marks that the King has moved.
     */
    public void setHasMovedToTrue()
    {
        this.hasMoved = true;
    }
}