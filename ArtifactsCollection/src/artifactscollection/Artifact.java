package artifactscollection;
public class Artifact
{
    private int index;
    private String creator;
    private int year;
    
    Artifact(int index, String creator, int year)
    {
        System.out.println("Creating an instance of Artifact");
        this.index = index;
        this.creator = creator;
        this.year = year;
    }
    
    public void getInfo()
    {
        System.out.println("Creator: " + creator + "\nYear: " + year + "\n");
    }
    
    public void getIndex()
    {
        System.out.println("Index: " + index + "\n");
    }
}
