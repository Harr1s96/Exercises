package app;


public class Division {

    public int divide(int x, int y) throws IllegalDenominatorException, Exception {

        int z = 0;

        try {

            z = x / y;
            
            if ( y > x) {
                throw new IllegalDenominatorException("y must be less than x");
            }
            if (x > y){
                throw new Exception("nope");
            }
        } 
        catch (ArithmeticException exception) {
            exception.printStackTrace();

        } 
        catch (IllegalArgumentException exception) {
            exception.printStackTrace();
        }
        
        return z;
    }


}
