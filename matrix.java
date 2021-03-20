
public class matrix {

    //Making attributes
    int rowValue ;
    int colValue ;
    //Creating a boolean 2d array
    boolean [][] cor1 = new boolean [0][0];
    
    //Creating a nonempty constructor
    matrix (int r, int c){
        
        //giving specific property values for the robot
        this.rowValue = r;
        this.colValue = c;
        
    }
    
    //Creating setters
    void setcolValue(int c){
        this.colValue = c;
        
    }
    void setrowValue(int r){
        this.rowValue = r;
        
    }
    public void create(){
        cor1 = new boolean [rowValue][colValue];
        
    }
    public static void main(String[] args) {
        
        //Creating an object for the different classes
        intro third = new intro ();
        
        //Setting visibility of a gui to true so it can be seen by the user
        third.setVisible(true);
        
    }
    
}
