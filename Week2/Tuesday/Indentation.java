public class Indentation {
    public static void main(String[] args){
        
        double larger = 30;
        double smaller = 20;
        if(larger > smaller)
            System.out.println("A single line doesn't need {} but use proper indentation");
        
        if(larger > smaller){
            System.out.println("Multiple lines need {}");
            System.out.println("Don't forget indentation, each new { means add a new tab on the left,");
            System.out.println("new } means remove a tab on the left.");
        }

        if(larger > smaller)
        {
            System.out.println("Curly braces in new lines are also fine!");
        }
    }
}
