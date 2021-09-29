package one;

public class samsung extends cell_phone implements Feature{
	
	
	String store="samsung store";
	String pay="samsung pay";
	
	String cam1="8mp";
	String cam2="16mp";
	String cam3="24mp";
	
	String ram1="4gb";
	String ram2="6gb";
	String ram3="8gb";
	
	public void samsung_phone() {
		
		commonfeature();
		System.out.println(store);
		System.out.println(pay);
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
		System.out.println("1 for single");
		System.out.println("2 for Double");
		
	}

}
