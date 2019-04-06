public class ConstructionBuilder 
{
	int price;
	
	public void setcost(int price)
	{
		this.price = price;
	}
	
	
	/*
	public FloorConstruction getFloor() 
	{
		FloorConstruction floor =  new FloorConstruction();
		System.out.println("Cost is :"+ floor.getcost());
		return floor;
	}
	
	public WallConstruction getWall()
	{
		WallConstruction wall =  new WallConstruction();
		System.out.println("Cost is :"+ wall.getcost());
		return wall;
	}*/

	public int getcost()
	{
		return price;
	}
}