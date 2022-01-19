package artifactscollection;
public class Main 
{ 
    public static void auction(Artifact[] array, String movement, String condition) 
    {
        int arrayLength = array.length;
        for (int arrayObject = 0; arrayObject < arrayLength; arrayObject++)
        {
            array[arrayObject].getIndex();
            
            boolean evaluationResult = false;
            if ((array[arrayObject].getClass().getSimpleName()).equals("Painting"))
            {
                ((Painting)array[arrayObject]).getInfo();
                evaluationResult = ((Painting)array[arrayObject]).evaluate(movement, condition);
            }
            else if ((array[arrayObject].getClass().getSimpleName()).equals("Sculpture"))
            {
                ((Sculpture)array[arrayObject]).getInfo();
                evaluationResult = ((Sculpture)array[arrayObject]).evaluate(movement, condition);
            }
            
            if (evaluationResult)
                System.out.println("Evaluation: Successful");
            else
                System.out.println("Evaluation: Failier");
        }
    }
    
    public static void main(String[] args) 
    {
        
    }
}
