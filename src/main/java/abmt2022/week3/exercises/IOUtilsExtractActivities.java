package abmt2022.week3.exercises;

import java.io.BufferedWriter;
import java.io.IOException;

import org.matsim.api.core.v01.Scenario;
import org.matsim.api.core.v01.population.Person;
import org.matsim.api.core.v01.population.Population;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.population.io.PopulationReader;
import org.matsim.core.scenario.ScenarioUtils;
import org.matsim.core.utils.io.IOUtils;


public class IOUtilsExtractActivities {
    public static void main(String[] args) throws IOException {

        //Class activity
    	
    	Config config = ConfigUtils.createConfig();
    	
    	//First create Scenario
        Scenario scenario = ScenarioUtils.createMutableScenario(config);
        Population population = scenario.getPopulation();

      //Read the population file of interest into the population container
        PopulationReader popReader = new PopulationReader(scenario);
        popReader.readFile(args[0]);
       

        //Because we want to write to CSV we would use the generic Bufferred writer and specify the csv file name
        BufferedWriter writer = IOUtils.getBufferedWriter("activities.csv");

        //we would open the writer to begin writing
        //first specify the headers
        writer.write("person_id;age;sex;activity;x;y\n");

        //To get the information we need, first have to go through all the persons in the population file and
        for (Person person: population.getPersons().values() ){

            
        	
        	//ToDo: add your code here
        	



        }

        //we have to close the writer
        writer.flush();
        writer.close();



    }
}

