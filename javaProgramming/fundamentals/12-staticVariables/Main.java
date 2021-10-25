public class Main
{
    public static void main(String[] args)
    {
        // create Fan objects
        Fan fan1 = new Fan("Sam1");
        Fan fan2 = new Fan("Droid2");

        Fan.setNumOfFans(100);
        System.out.println(Fan.getNumOfFans());
        System.out.println(fan1.getModel());
        System.out.println(fan2.getModel());
    }
}

