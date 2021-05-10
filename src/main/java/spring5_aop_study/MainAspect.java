package spring5_aop_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring5_aop_study.aop.RecCalculator;
import spring5_aop_study.config.AppCtx;

public class MainAspect {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppCtx.class);){
	
//			Calculator cal = ctx.getBean("recCalculator", Calculator.class);
			RecCalculator cal = ctx.getBean("calculator", RecCalculator.class);
			long fiveFact = cal.factorial(5);
			System.out.printf("Cal >> cal.factorial(5) = %d%n", fiveFact);
			System.out.println(cal.getClass().getName());
			
//			System.out.println();
//			Calculator cal1 = ctx.getBean("calculator1", Calculator.class);
//			fiveFact = cal1.factorial(5);
//			System.out.printf("Cal >> cal1.factorial(5) = %d%n", fiveFact);
//			System.out.println(cal1.getClass().getName());
		}
	}

}
