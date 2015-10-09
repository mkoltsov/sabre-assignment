public class SecondTask{
	public static void main(String[] args){
		SecondTask task = new SecondTask();
		int source = Integer.valueOf(args[0]);
		int power = Integer.valueOf(args[1]);
		System.out.println(task.powerTo(source, power));
	}

	public static double powerTo(int source, int power){
		if (source <0 || power < 0) {
			throw new IllegalArgumentException();
		} else {
			return Math.pow(source, power);
		}
	}
}