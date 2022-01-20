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
        System.out.println("Volume: " + volume + "\nMaterial: " + material);
    }
    
    public boolean evaluate(String move, String cond)
    {
        boolean isMovement = false;
        if (move.equals("impressionism") && movement.equals("impressionism"))
        {
            isMovement = true;
        }
        else if (move.equals("expressionism") && movement.equals("expressionism"))
        {
            isMovement = true;
        }
        else if (move.equals("naturalism") && movement.equals("naturalism"))
        {
            isMovement = true;
        }
        
        boolean isCondition = false;
        if (cond.equals("bad") && condition.equals("bad"))
        {
            isCondition = true;
        }
        else if (cond.equals("good") && condition.equals("good"))
        {
            isCondition = true;
        }
        else if (cond.equals("excellent") && condition.equals("excellent"))
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
