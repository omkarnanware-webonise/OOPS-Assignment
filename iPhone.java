package one;

public class iPhone extends cell_phone implements Feature{ 
	
	String store="apple store";
	String os="IOS";
	
	String cam1="8mp";
	String cam2="12mp";
	String cam3="16mp";
	
	String ram1="4gb";
	String ram2="6gb";
	String ram3="3gb";
	
	public void i_Phone() {
		
		commonfeature();
		System.out.println(store);
		System.out.println(os);
	}

	@Override
	public void camera() {
		System.out.println("1 for "+cam1);
		System.out.println("2 for "+cam2);
		System.out.println("3 for "+cam3);
		
	}

	@Override
	public void memorySlot() {
		System.out.println("1 for Yes");
		System.out.println("2 for No");
		
	}

	@Override
	public void ram() {
		System.out.println("1 for "+ram1);
		System.out.println("2 for "+ram2);
		System.out.println("3 for "+ram3);
		
	}

	@Override
	public void NoOfSim() {
		System.out.println("1 simCardSlot");
		
	}

}
