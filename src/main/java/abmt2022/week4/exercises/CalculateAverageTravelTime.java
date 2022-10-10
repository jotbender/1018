package abmt2022.week4.exercises;

import java.util.HashMap;
import java.util.Map;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.population.Person;

public class CalculateAverageTravelTime { // we need to implement event Handlers we need
	private final Map<Id<Person>, Double> times = new HashMap<>();
	private double travelTimeSum = 0.0;
	private int travelTimeCount = 0;



	//get the departure time for each person
	{
		
	}


	//get the arrival time and calculate the duration
	{
		
	}
	
	//return travel time
	public double getAverageTravelTime() {
		return this.travelTimeSum / this.travelTimeCount;
		}
	

}
