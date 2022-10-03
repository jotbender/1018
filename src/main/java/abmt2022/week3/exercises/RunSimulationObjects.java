package abmt2022.week3.exercises;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.scenario.ScenarioUtils;


public class RunSimulationObjects {
    public static void main (String[] args) {
  
//Scenario: Siouxfalls example project
    	
        //Load the config object
        String configPath = args[0]; //you can also directly add the config path here
        Config config = ConfigUtils.loadConfig(configPath);
        
        //We can access and change the config file directly here, change the iteration number or even the output directory
        System.out.println("********************************************************************************");
        System.out.println("********************************************************************************");
        System.out.println("the old last iteration setting is: " + config.controler().getLastIteration());
        
        config.controler().setLastIteration(1);
        
        System.out.println("the new last iteration setting is: " + config.controler().getLastIteration());
        
        config.controler().setOutputDirectory("output2");

        //ToDo: how can we change the flow capacity?
        
        
        //Load the scenario object

        Scenario scenario = ScenarioUtils.loadScenario(config);
        
        
        //ToDo: How do we modify input files in the scenario?
        
        
      //Create the controller object
        Controler controler = new Controler(scenario);
        
        //ToDo: Can we still modify configurations and input file after it has gotten to controller?

        controler.run();
    }
}
