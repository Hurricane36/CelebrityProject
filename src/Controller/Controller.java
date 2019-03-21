package Controller;
import celeb.model.*;
import java.util.ArrayList;

public class Controller
{
	private ArrayList <Celebrity> celebrityList;
	private String currentClue;
	private Celebrity currentCelebrity;
	public Controller()
	{
		this.celebrityList = new ArrayList<Celebrity>();
	}
	public void addCelebrity(String name, String clue, String type)
	{
		Celebrity toBeAdded = new Celebrity(name, clue);
		celebrityList.add(toBeAdded);
	}
	public void start()
	{
	
	}
	public String getClue()
	{
		return currentCelebrity.getClue();
	}
	public Celebrity getRandomCelebrity()
	{
		int randomIndex = (int)(Math.random() * celebrityList.size());
		currentCelebrity = new celebrityList.remove(randomIndex);
		return currentCelebrity;
	}
}
