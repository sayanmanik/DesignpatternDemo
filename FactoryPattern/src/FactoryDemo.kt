class FactoryDemo
{
    public fun getShape(type:String): Shape
    {
        if(type.equals("Circle"))
        {
            val circle = Circle()
            circle.getShape()
            return circle
        }

        else if(type.equals("Square"))
        {
            val square = Square()
            square.getShape()
            return square
        }

        else
        {
            val rect = Rectangle()
            rect.getShape()
            return rect
        }
    }
}