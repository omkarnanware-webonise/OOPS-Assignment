package one;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		 String cam="";
		 String memoryCard="";
		 String r="";
		 
		 String sim="";

			Scanner sc=new Scanner(System.in);
			int ch=0;
				while(ch<4)
				{
					System.out.println("Enter your choice");
					System.out.println("1.Android");
					System.out.println("2.iPhone");
					System.out.println("3.Samsung");
					ch=sc.nextInt();
										
					switch(ch)
					{
						case 1: 
							Android aa=new Android();
							System.out.println("Select feature you want in Android");
							System.out.println("camera");
							
							aa.camera();
							int a=sc.nextInt();
							
							if(a==1)
								cam=aa.cam1;
							else if(a==2)
								cam=aa.cam2;
							else if(a==3)
								cam=aa.cam3;
							
							System.out.println("Ram");
							aa.ram();
							int b=sc.nextInt();
							if(b==1)
								r=aa.ram1;
							else if(b==2)
								r=aa.ram2;
							else if(b==3)
								r=aa.ram3;
							
							System.out.println("Memory card slot");
							aa.memorySlot();
							int c=sc.nextInt();
							
							if(c==1)
								memoryCard="Yes";
							else if(c==2)
								memoryCard="No";
							
						
								
							System.out.println("------------------------------------------------");
							
							System.out.println(" Congrats You Selected Android Phone and its feature are");
							
							aa.androidPhone();
							System.out.println("camera - "+cam);
							System.out.println("memoryCard - "+memoryCard);
							System.out.println("Ram - "+r);
							aa.NoOfSim();
							
							System.out.println("-----------------------------------------------");
							break;
						case 2:
							
							iPhone ip=new iPhone();
							System.out.println("Select feature you want in iphone");
							
							System.out.println("camera");
							
							ip.camera();
							 a=sc.nextInt();
							
							if(a==1)
								cam=ip.cam1;
							else if(a==2)
								cam=ip.cam2;
							else if(a==3)
								cam=ip.cam3;
							
							System.out.println("Ram");
							ip.ram();
							 b=sc.nextInt();
							if(b==1)
								r=ip.ram1;
							else if(b==2)
								r=ip.ram2;
							else if(b==3)
								r=ip.ram3;
							
							System.out.println("Memory card slot");
							ip.memorySlot();
							 c=sc.nextInt();
							
							if(c==1)
								memoryCard="Yes";
							else if(c==2)
								memoryCard="No";
							
						
								
							System.out.println("------------------------------------------------");
							
							System.out.println(" Congrats You Selected iPhone and its feature are");
							
							ip.i_Phone();;
							System.out.println("camera - "+cam);
							System.out.println("memoryCard - "+memoryCard);
							System.out.println("Ram - "+r);;
							ip.NoOfSim();
							
							System.out.println("-----------------------------------------------");
							break;
							
							case 3:
							
							samsung sm=new samsung();
							System.out.println("Select feature you want in Samsung");
							
							System.out.println("camera");
							
							sm.camera();
							 a=sc.nextInt();
							
							if(a==1)
								cam=sm.cam1;
							else if(a==2)
								cam=sm.cam2;
							else if(a==3)
								cam=sm.cam3;
							
							System.out.println("Ram");
							sm.ram();
							 b=sc.nextInt();
							if(b==1)
								r=sm.ram1;
							else if(b==2)
								r=sm.ram2;
							else if(b==3)
								r=sm.ram3;
							
							System.out.println("Memory card slot");
							sm.memorySlot();
							 c=sc.nextInt();
							
							if(c==1)
								memoryCard="Yes";
							else if(c==2)
								memoryCard="No";
							
							System.out.println("No of SimCardSlot");
							
							sm.NoOfSim();
							
							int d=sc.nextInt();
							
							if(d==1)
								sim="single";
							else if(d==2)
								sim="double";
							
							
						
								
							System.out.println("------------------------------------------------");
							
							System.out.println(" Congrats You Selected Samsung Phone and its feature are");
							
							sm.samsung_phone();
							System.out.println("camera - "+cam);
							System.out.println("memoryCard - "+memoryCard);
							System.out.println("Ram - "+r);
							System.out.println("No of sim slot - "+sim);
							
							System.out.println("-----------------------------------------------");
							break;
		
					}
				}
		
	}

}
