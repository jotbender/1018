package abmt2022.week3.exercises;

import org.matsim.api.core.v01.Coord;
import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.Scenario;
import org.matsim.api.core.v01.population.*;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.scenario.ScenarioUtils;
import org.matsim.core.utils.geometry.CoordUtils;


public class RunMatsimUtils {
    public static void main(String[] args){

        /*
        * We would modify the input plan files using some MATSim utils. We create a new agent and add this new agent to the Population data
        * The steps include:
        * 1 - Use the Person class to create a person
        * 2 - Add person attributes and a travel plan to this person
        * 3 - Get the Population data from the scenario
        * 4 - Add the new agent to the population file
        * 5 - Run scenario
        * 6 - view the output plan file to see the new agent
        * */

        //Aim: Creating a person and then adding the person to the equil population file

        //First load the equil scenario
        String configPath = args[0];
        Config config = ConfigUtils.loadConfig(configPath);

        Scenario scenario = ScenarioUtils.loadScenario(config);

        //ToDo: Get the population from the scenario
        //Population population

        //ToDo: use population factory to create a person
        //PopulationFactory popFactory

        //ToDo: To create person we need the person ID, create Id of type person
        //Id<Person> personId

        //ToDo: Create person
        //Person person

        //ToDo: A person needs a plan so we create a plan container to take the activities and legs of a person
        //but where do we create the plan from
        //Plan plan;
        
        //what are the things needed in a plans file?

        //ToDo: Create person activities
        //There are many ways to create activity, either from facility id, coordinates, or network link

        //ToDo: Create Coordinate object

        //ToDo: create person leg

        //ToDo: add activities to plan

        //ToDo: add plan to person

        //ToDo: we can add some person attributes too. Maybe age, etc


        //ToDo: add person to population

        //ToDo*: Write out new population or let it run in your simulation


        //Let's run our modified scenario with new population

        Controler controler = new Controler(scenario);


        controler.getConfig().controler().setLastIteration(1);

        controler.run();


    }

}