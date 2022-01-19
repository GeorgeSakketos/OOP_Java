package artifactscollection;
public class Sculpture extends Masterpiece
{
    private int volume;
    private String material;
    
    Sculpture(int index, String creator, int year, String movement, String condition, int volume, String material)
    {
        super(index, creator, year, movement, condition);
        System.out.println("Creating an instance of Sculpture");
        this.volume = volume;
        this.material = material;
    }
    
    @Override
    public void getInfo()
    {
        super.getInfo();
        System.out.println("Volume: " + volume + " Material: " + material + "\n");
    }
    
    public boolean evaluate(String move, String cond)
    {
        boolean isMovement = false;
        if (move == "impressionism" && movement == "impressionism")
        {
            isMovement = true;
        }
        else if (move == "expressionism" && movement == "expressionism")
        {
            isMovement = true;
        }
        else if (move == "naturalism" && movement == "naturalism")
        {
            isMovement = true;
        }
        
        boolean isCondition = false;
        if (cond == "bad" && condition == "bad")
        {
            isCondition = true;
        }
        else if (cond == "good" && condition == "good")
        {
            isCondition = true;
        }
        else if (cond == "excellent" && condition == "excellent")
        {
            isCondition = true;
        }
        
        if (isMovement && isCondition)
            return true;
        return false;    
    }
    
    public void evaluate(String move)
    {
        evaluate(movement, "excellent");
    }
}
