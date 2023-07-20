public class Cell { // class for cell that makes up the squares 
 
    int row;
    int col;
    boolean isEmpty;
    boolean isEstate;

    public Cell(int row, int col ){ // constructor for cell
        this.row = row;
        this.col = col;
        this.isEmpty = true;
        this.isEstate = false;
    }
    
    public boolean isCellEmpty(){ // getter method for isempty
        return isEmpty;
    }

    public int getX(){ // getter method for x coord
        return row;
    }

    public int getY(){ // getter method for y coord
        return col;
    }

    public void setIsEstate(boolean isEstate){ // setter method for is estate method
        this.isEstate = isEstate;
    }
}
