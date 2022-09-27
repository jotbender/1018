package abmt2022.week2.exercises.run;

import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;

public class RunSimulationExample {

	public static void main(String[] args) {
		
		Config config = ConfigUtils.loadConfig(args[0]);
		
		Controler controler = new Controler(config);
		
		controler.run();

	}

}
