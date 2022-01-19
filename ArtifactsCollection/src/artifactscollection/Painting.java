package artifactscollection;
public class Painting extends Masterpiece
{
    private int length;
    private int width;
    private String technique;
    
    Painting(int index, String creator, int year, String movement, String condition, int length, int width, String technique)
    {
        super(index, creator, year, movement, condition);
        System.out.println("Creating an instance of Painting");
        this.length = length;
        this.width = width;
        this.technique = technique;
    }
    
    @Override
    public void getInfo()
    {
        int surface = length + width;
        super.getInfo();
        System.out.println("Length: " + length + "\nWidth: " + width + "\nTechnique: " + technique + "\nSurface: " + surface + "\n");
    }
    
    public boolean evaluate(String move, String cond)
    {
        boolean isMovement = false;
        if (move == "impressionism")
        {
            isMovement = true;
        }
        else if (move == "expressionism" && (movement == "expressionism" || movement == "naturalism"))
        {
            isMovement = true;
        }
        else if (move == "naturalism" && movement == "naturalism")
        {
            isMovement = true;
        }
        
        boolean isCondition = false;
        if (cond == "bad")
        {
            isCondition = true;
        }
        else if (cond == "good" && (condition == "good" || condition == "excellent"))
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
        evaluate(movement, "good");
    }
}
