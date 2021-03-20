
public class gameGrid extends matrix{
    
    int numValue;
    int genValue;
    int user;
    int rowUpdate;
    int colUpdate;
    boolean [][] cor2 = new boolean [0][0];
    
    matrix first ;
    intro third ;    
    
    //Creatig a non empty constructor
    gameGrid(int n, int g, int u, int r, int c){

        //giving specific property values for the robot
        this.numValue = n;
        this.genValue = g;
        this.user = u;
        this.rowUpdate =r;
        this.colUpdate = c;
    }
    
    //Creating setters
    void setnumValue(int n){
        this.numValue = n;
    }
    
    void setgenValue(int g){
        this.genValue = g;
    }
    
    void setrowUpdate(int r){
        this.rowUpdate = r;
    }
    
    void setcolUpdate(int c){
        this.colUpdate = c;
        
        //Calling to run a method
        cellUpdate();
    }
    
    public void cellUpdate(){
        first.cor1 = new boolean [this.rowUpdate][this.colUpdate];
        
    }
    
    public void print (){
        
        //Creating a StringBuilder that will take multiple inputs to create a string
        StringBuilder s = new StringBuilder ();
        
        
        //Creating for loops to loop blocks of code
        for(int w=0; w<first.rowValue ; w++){
            for(int j=0; j<first.colValue ; j++){

                //Printing out the column values of row "w"
                if(first.cor1 [w][j]){
                    s.append("*     ");
                }else {
                    s.append(".     ");
                }
            }
            s.append("\n");
        }
        
        //Setting the StringBuilder equivilent to a String
        String array = s.toString();
        
        //Calling to run a method in a different class
        third.introSet(array);
        third.setVisible(true);
        
    }
    public void nextGen(){
        
        cor2 = new boolean [first.rowValue][first.colValue]; 
        
        int h=0;
        
        //Creating a for loop that will loop code a certain number of times
        for(int p=0; p<first.rowValue ; p++){
            for(int k=0; k<first.colValue ; k++){
                for(int j=-1+p; j<2+p; j++){
                    for(int i=-1+k; i<2+k; i++){
                        
                        //Using try catch to catch places where the code might fail; where the code is called to check 
                        //the negative direction of the 2d array
                        try{
                            if (first.cor1[j][i]){
                                h++;
                            }
                        }catch(Exception e){
                            
                        }
                    }  
                } 

                if (first.cor1[p][k] && h==4){
                    //Setting a cell in the array to true 
                    cor2[p][k]=true;
                    
                }else if (first.cor1[p][k] && h<3){
                    ////Setting a cell in the array to true 
                    cor2[p][k]=false;
                    
                }else if (first.cor1[p][k] && h>4){
                    cor2[p][k]=false;
                    
                }else if (!first.cor1[p][k] && h==3){
                    cor2[p][k]=true;
                    
                }else if (!first.cor1[p][k] && h<2){
                    cor2[p][k]=false;
                    
                }else if (!first.cor1[p][k] && h>3){
                    cor2[p][k]=false;
                    
                }
                h=0;
                
            }
        }
        
        first.cor1 = cor2;
        
    } 

    

    
    
}
