package artifactscollection;
public class Masterpiece extends Artifact
{
    public String movement;
    public String condition;
    
    Masterpiece(int index, String creator, int year, String movement, String condition)
    {
        super(index, creator, year);
        System.out.println("Creating an instance of Masterpiece");
        this.movement = movement;
        this.condition = condition;
    }
    
    @Override
    public void getInfo()
    {
        super.getInfo();
        System.out.println("Movement: " + movement + "\nCondition: " + condition + "\n");
    }
}
