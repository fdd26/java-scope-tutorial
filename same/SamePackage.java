package same;

public class SamePackage
{
	public SamePackage()
	{
		super();
		final Parent p = new Parent();
		p.x = 1;
		p.y = 2; // Allowed in Java (same package)
		p.z = 3;
		// p.w = 4; // Not allowed
	}
}