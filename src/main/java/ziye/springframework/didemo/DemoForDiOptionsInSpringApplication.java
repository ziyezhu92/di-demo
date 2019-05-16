package ziye.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ziye.springframework.didemo.controllers.ConstructorInjectController;
import ziye.springframework.didemo.controllers.MyController;
import ziye.springframework.didemo.controllers.PropertyInjectedController;
import ziye.springframework.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DemoForDiOptionsInSpringApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoForDiOptionsInSpringApplication.class, args);

		//Two ways to get the MyController Class
		MyController controller = ctx.getBean(MyController.class);
		//Spring does auto wiring using camel casing. so your MyController Becomes myController.
		MyController myController = (MyController) ctx.getBean("myController");

		controller.hello();
		myController.hello();


		//System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectController.class).sayHello());

	}

}
