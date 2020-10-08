# java-
Java第一次实验课作业
实验目的；完成教材P110第四题关于PC、内存等模拟的程序。
实验过程；先建一个项目，然后建一个包，再建一个公用类和三个缺省类，其中公用类里头创建三个对象，然后按照老师要求一步一步来的完成实验过程，并最终得到结果。
核心方法；1.创造程序包、类、对象。
         2.调用对象
实验结果；麋鹿没迷路:
package pack;

 public class Text {
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
 
 class CPU {
		int speed;
		int getSpeed(){
			return speed;
		}
		public void setSpeed(int speed){
			this.speed=speed;
		}

	}
 
class HardDisk {
		int amount;
		long getAmount(){
			return amount;
		}
		public void setAmount(int amount){
			this.amount=amount;
		}

	}
 
 class PC {
		CPU cpu;
		HardDisk disk;
		void setCPU(CPU cpu){
			this.cpu=cpu;
		}
		void setHardDisk(HardDisk disk){
			this.disk=disk;	
		}
		void show(){
			System.out.println("CPU速度"+cpu.getSpeed());
			System.out.println("硬盘容量"+disk.getAmount());
		}

	}
实验感想；通过本次实验，让我充分学会如何使用eclipse写代码，也让我感受到JAVA语法的多样性，整个完成实验的过程中，我遇到了不少困难，在指导书，老师和同学的帮助下我最终成功完成了这次的实验。
过程虽然曲折，但结果是好的，这次实验也让我受益匪浅，我也十分期待下次的Java实验，可以更快更好的完成实验相比于这次，也非常感谢这次实验帮助我的老师和同学，没有你们的帮助，我是不能最后完成
这个实验的。
