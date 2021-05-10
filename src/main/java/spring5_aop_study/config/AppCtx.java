package spring5_aop_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.RecCalculator;
import spring5_aop_study.aspect.ExeTimeAspect;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass =  true)
public class AppCtx {

	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}

	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}

//	@Bean
//	public Calculator calculator1() {
//		return new ImpeCalculator();
//	}
}
