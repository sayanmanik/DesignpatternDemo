/**
 * 
 */

/**
 * @author sayan
 *
 */

public class FloorConstruction implements Construction 
{

	/**
	 * @param
	 */

	public static ConstructionBuilder StartBuildingFloor()
	{
		ConstructionBuilder builder = new ConstructionBuilder();
		builder.setcost(200);
		return builder;
	}

	@Override
	public int getcost() {
		return 200;
	}
}
