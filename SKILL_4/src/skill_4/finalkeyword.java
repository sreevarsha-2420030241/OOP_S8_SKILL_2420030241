package skill_4;

public class finalkeyword {
	private final int blankFinalVar;
    private final StringBuilder finalRef;
    public finalkeyword(int value, String text) 
    {
        this.blankFinalVar = value; 
        this.finalRef = new StringBuilder(text);
    }
    public final void displayFinalVar() 
    {
        System.out.println("Blank final variable value: " + blankFinalVar);
    }
    public static void main(String[] args) 
    {
       finalkeyword obj = new finalkeyword(100, "Hello");
        obj.displayFinalVar();
        System.out.println("Before modification: " + obj.finalRef);
        obj.finalRef.append(" World"); 
        System.out.println("After modification: " + obj.finalRef);
    }
}
