package one;

public class Android extends cell_phone implements Feature{

	String playStore="playStore";
	String os="Android";
	
	String cam1="24mp";
	String cam2="48mp";
	String cam3="64mp";
	
	String ram1="4gb";
	String ram2="6gb";
	String ram3="8gb";
	
	
	
	public void androidPhone() {
		
		commonfeature();
		System.out.println(playStore);
		System.out.println("operating System "+os);
		
	}

	@Override
	public void camera() {
		System.out.println("1 for "+cam1);
		System.out.println("2 for "+cam2);
		System.out.println("3 for "+cam3);
		
	}

	
	@Override
	public void ram() {
		System.out.println("1 for "+ram1);
		System.out.println("2 for "+ram2);
		System.out.println("3 for "+ram3);
		
	}

	@Override
	public void memorySlot() {
		System.out.println("1 for Yes");
		System.out.println("2 for No");
		
	}

	@Override
	public void NoOfSim() {
		System.out.println("2 simCardSlot");
			
	}
}
