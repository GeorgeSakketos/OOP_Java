package artifactscollection;
public class Main 
{ 
    public static void auction(Artifact[] array, String movement, String condition) 
    {
        int arrayLength = array.length;
//        for (int arrayObject = 0; arrayObject < arrayLength; arrayObject++)
//        {
//            array[arrayObject].getIndex();
//            array[arrayObject].getInfo();
//            ((Painting)array[1]).evaluate(movement, condition);
//        }

        System.out.println(array[0].getClass().getSimpleName());
        System.out.println(array[1].getClass().getSimpleName());
        
//        Class c = array[1].getClass();
//        
//        System.out.println(c.getSimpleName());
    }
    
    public static void main(String[] args) 
    {
        Artifact[] objects = new Artifact[10];
        objects[0] = new Masterpiece(1, "Mike", 1998, "move", "good");
        objects[1] = new Painting(2, "Bob", 1958, "impressionism", "bad", 13, 10, "atechnique");
        auction(objects, "impressionism", "bad");
    }
}
