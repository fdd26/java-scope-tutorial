package other;

import same.Parent;

public class OtherPackage
{
	public OtherPackage()
	{
		super();
		final Parent p = new Parent();
		p.x = 1;
		// p.y = 2; // Not allowed
		// p.z = 3; // Not allowed
		// p.w = 4; // Not allowed
	}
}