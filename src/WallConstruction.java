/**
 * 
 */

/**
 * @author sayan
 *
 */
public class WallConstruction implements Construction
{

	public static ConstructionBuilder StartBuildingWall()
	{
		ConstructionBuilder builder = new ConstructionBuilder();
		builder.setcost(100);
		return builder;
	}

	@Override
	public int getcost() {
		return 100;
	}
}
