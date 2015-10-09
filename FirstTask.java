public class FirstTask {
	public static void main(String[] args){
		int arg = Integer.valueOf(args[0]);
		for (int i=1; i<=arg;i++){
			if (i%3==0 || i %5==0) {
				System.out.println("dividable by 3 or 5");
			} else {
				System.out.println(i);
			}	
		}
	}
}