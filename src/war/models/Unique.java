package war.models;

public abstract class Unique {
	protected int id;
	protected static int lastId = -1;
	
	public static int newId()
	{
		lastId++;
		return lastId;
	}
	
	public void setId()
	{
		setId(Unique.newId());
	}
	
	public void setId(int _id)
	{
		id = _id;
	}
	
	public int getId()
	{
		return id;
	}
}
