public class MainClass
{
    public static void main(String args[])
    {
        FactoryDemo type = new FactoryDemo();

        type.getShape("Circle");

        type.getShape("Rectangle");

        //type.getShape("Square");
    }
}
