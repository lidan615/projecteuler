package dl.euler.solutions;

import dl.euler.EulerSolution;

public class PE001 extends EulerSolution {

    public void run()
    {
    	int sum = 0;
        
        for(int i=1; i<1000; i++)
            if( i % 3 == 0 || i % 5 == 0 )
                sum += i; 
        
        setResult( String.valueOf(sum));
    }
    
    public static void main(String[] args) 
    {
        new PE001().start();
    }

}
