package artifactscollection;
public class Main 
{
    public static void main(String[] args) 
    {
        
    }
    
}

class Artifact
{
    private int index;
    private String creator;
    private int year;
    
    Artifact()
    {
        
    }
    
    public void getInfo()
    {
        System.out.println("Creator: " + creator + "\nYear: " + year + "\n");
    }
    
    public void getIndex()
    {
        System.out.println("Index: " + index);
    }
}

class Masterpiece extends Artifact
{
    public String movement;
    public String condition;
    
    Masterpiece()
    {
        
    }
    
    public void getInfo()
    {
        super.getInfo();
        System.out.println("Movement: " + movement + "\nCondition: " + condition + "\n");
    }
}

class Painting extends Masterpiece
{
    private int length;
    private int width;
    private String technique;
    
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

class Sculpture extends Masterpiece
{
    private int volume;
    private String material;
    
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
