package pack;

public class Test {
	public static void main(String args[]){
		  //����һ��CPU����
		  CPU cpu =new CPU();
		  //��cpu��speed����Ϊ2200
		  cpu.setSpeed(2200);
		  //����һ��HardDisk����
		  HardDisk disk=new HardDisk();
		  //��disk��amount����Ϊ200
		  disk.setAmount(200);
		  //����һ��PC����
		  PC pc=new PC();
		  pc.setCPU(cpu);
		  pc.setHardDisk(disk);
		pc.show();
		  
		 }
}
