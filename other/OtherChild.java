package other;

import same.Parent;

public class OtherChild extends Parent
{
	public OtherChild()
	{
		super();

		super.x = 1;
		super.y = 2;
		// super.z = 3; // Not allowed
		// super.w = 4; // Not allowed
	}
}
