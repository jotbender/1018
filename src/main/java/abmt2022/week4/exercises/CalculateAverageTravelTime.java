package abmt2022.week4.exercises;

import java.util.HashMap;
import java.util.Map;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.events.PersonArrivalEvent;
import org.matsim.api.core.v01.events.PersonDepartureEvent;
import org.matsim.api.core.v01.events.handler.PersonArrivalEventHandler;
import org.matsim.api.core.v01.events.handler.PersonDepartureEventHandler;
import org.matsim.api.core.v01.population.Person;

public class CalculateAverageTravelTime implements PersonDepartureEventHandler, PersonArrivalEventHandler{
	
	private final Map<Id<Person>, Double> times = new HashMap<>();
	private double travelTimeSum = 0.0;
	private int travelTimeCount = 0;

	//get the departure time for each person
	@Override
	public void handleEvent(PersonDepartureEvent event) {
		this.times.put(event.getPersonId(), event.getTime());
		
	}
	

	//get the arrival time and calculate the duration
	@Override
	public void handleEvent(PersonArrivalEvent event) {
		double depTime = this.times.get(event.getPersonId());
		double travelTime = event.getTime() - depTime;
		this.travelTimeSum += travelTime;
		this.travelTimeCount++;
		 
	}
	
	//return travel time
	public double getAverageTravelTime() {
		return this.travelTimeSum / this.travelTimeCount;
		}

	



}
