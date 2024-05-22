package game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();

		//GamingConsole game = new MarioGame();//1 step
		//GameRunner runner = new GameRunner(game);//2 step

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		SuperContraGame.MyWebController controller = context.getBean(SuperContraGame.MyWebController.class);
		 System.out.println(controller.returnValueFromBusinessService());

	}

}
