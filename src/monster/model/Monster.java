package monster.model;

public class Monster
{
	private String name;
	private int eyes;
	private int noses;
	private double hairCount;
	private double legs;
	private int arms;
	private boolean hasBellyButton;

	public Monster (String name, int eyes, int noses, double hairCount, double legs, int arms, boolean hasBellyButton)
	{
		this.name = name;
		this.eyes = eyes;
		this.noses = noses;
		this.hairCount = hairCount;
		this.legs = legs;
		this.arms = arms;
		this.hasBellyButton = hasBellyButton;
	}

	public String getName()
	{
		return name;
	}

	public int getEyes()
	{
		return eyes;
	}
	public int getNoses()
	{
		return noses;
	}
	public double getHairCount()
	{
		return hairCount;
	}
	public double getLegs()
	{
		return legs;
	}
	public int getArms()
	{
		return arms;
	}
	public boolean hasBellyButton()
	{
		return hasBellyButton;
	}
	

}
