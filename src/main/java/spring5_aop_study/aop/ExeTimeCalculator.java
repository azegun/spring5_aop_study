package spring5_aop_study.aop;

public class ExeTimeCalculator implements Calculator {
	
	private Calculator delicate;
		
	public ExeTimeCalculator(Calculator delicate) {
		this.delicate = delicate;
		}

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
//		long start = System.currentTimeMillis();
		long result = delicate.factorial(num);
		long end = System.nanoTime();
//		long end = System.currentTimeMillis();
		System.out.printf("%s.factorial(%d) 실행시간 = %d\n", 
				delicate.getClass().getSimpleName(), 
				num, (end-start));
		
		return result;
	}

}
