package abmt2022.week5.lectures.matsim;

import org.matsim.api.core.v01.Scenario;

import com.google.inject.Inject;
import com.google.inject.Provider;

import abmt2022.week4.exercises.MyEventHandler;

public class MyEventHandlerProvider implements Provider<MyEventHandler> {

	private final Scenario scenario;
	// we are providing one constructor annotated with inject 
	// to tell the Guice framework which constructor should be used
	
	// you will notice that we do not inject a Scenario object anywhere in our code
	// this is because MATSim injects certain objects by default
	// and a Scenario is one of them
	@Inject
	public MyEventHandlerProvider(Scenario scenario) {
		this.scenario = scenario;
	}
	// get() method creates an instance of the MyEventHandler
	
	public MyEventHandler get() {
		return new MyEventHandler();
	}

}