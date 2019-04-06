public class MainClass
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// ConstructionBuilder builder = new ConstructionBuilder();
		ConstructionBuilder builder = WallConstruction.StartBuildingWall();
		System.out.println(builder.getcost());
		
		builder = FloorConstruction.StartBuildingFloor();
		System.out.println(builder.getcost());
		
		// FloorConstruction floor = builder.getObject();
		
		
		//WallConstruction wall= builder.getObject();
		
		
		//System.out.println(builder.getFloor());
	}


}