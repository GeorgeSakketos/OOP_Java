package artifactscollection;
import java.util.Scanner;
import java.util.Random;

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
                System.out.println("Evaluation: Successful\n");
            else
                System.out.println("Evaluation: Failier\n");
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Give info(N, Movement, Condition): ");
        
        int N = object.nextInt();
        
        String[] str = object.nextLine().split(" ");
        String movement = str[1];
        String condition = str[2];
        
        Artifact[] array = new Artifact[N];
        
        for (int randObject = 0; randObject < N; randObject++)
        {
            Random rand = new Random();
            
            int randClass = rand.nextInt(2);
            
            String[] names = {"Bob","Mike","Tom","Jessy","Maria","Ellen","Sofia","Petter"};
            int randName = rand.nextInt(names.length);
            
            int randYear = rand.nextInt(2022-1622) + 1662;  // ToYear: 2022 , FromYear: 1662
            
            String[] movements = {"impressionism", "expressionism", "naturalism"};
            int randMovement = rand.nextInt(movements.length);
            
            String[] conditions = {"bad", "good", "excellent"};
            int randCondition = rand.nextInt(conditions.length);
            
            if (randClass == 0)
            {
                int randLength = rand.nextInt(40);
                int randWidth = rand.nextInt(40);
                
                String[] techniques = {"oil", "aquarelle", "tempera"};
                int randTechnique = rand.nextInt(techniques.length);
                
                array[randObject] = new Painting(randObject + 1, names[randName], randYear, movements[randMovement], conditions[randCondition], randLength, randWidth, techniques[randTechnique]);
            }
            else if (randClass == 1)
            {
                int randVolume = rand.nextInt(200) + 1;
                
                String[] materials = {"iron", "stone", "wood"};
                int randMaterial = rand.nextInt(materials.length);
                
                array[randObject] = new Sculpture(randObject + 1, names[randName], randYear, movements[randMovement], conditions[randCondition], randVolume, materials[randMaterial]);
            }
        }
        
        auction(array, movement, condition);
    }
}