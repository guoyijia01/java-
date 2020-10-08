package pack;

public class Test {
	public static void main(String args[]){
		  //创建一个CPU对象
		  CPU cpu =new CPU();
		  //将cpu的speed设置为2200
		  cpu.setSpeed(2200);
		  //创建一个HardDisk对象
		  HardDisk disk=new HardDisk();
		  //将disk的amount设置为200
		  disk.setAmount(200);
		  //创建一个PC对象
		  PC pc=new PC();
		  pc.setCPU(cpu);
		  pc.setHardDisk(disk);
		pc.show();
		  
		 }
}
