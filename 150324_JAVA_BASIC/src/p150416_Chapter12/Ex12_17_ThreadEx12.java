package p150416_Chapter12;

import java.util.ArrayList;
import java.util.List;

/* ������ ������. �Һ��� ������ ����
 * �ڵ��� 3�밡 ����� �� ���� �Һ��ڴ� wait()��
 * */
public class Ex12_17_ThreadEx12 {
	public static void main(String[] args) {
		Car c = new Car();
		new Thread(new Producer(c)).start();
		new Thread(new Customer(c)).start();	
	}
	static class Car{
		private List<String> carList=null;
		Car(){
			carList = new ArrayList<String>();
		}
		public String getCar() {
			String carName = null;
			switch((int)(Math.random()*3)){
				case 0: carName = "SM5" ; break;
				case 1: carName = "�ҳ�Ÿ" ; break;
				case 2: carName = "�ű׳ʽ�" ; break;
			}
			return carName;
		}
		public synchronized String pop(){
			String carName = null;
			if(carList.size() ==0){
				try{
					System.out.println("������. ����ϼ���.");
					wait();
				}catch(Exception e){}
			}
			carName = (String)carList.remove(carList.size() -1);
			System.out.println(carName + " ���� �Ǹ�");
			return carName;
		}
		public synchronized void push(String car){
			carList.add(car);
			System.out.println(car + " ���� ���� �Ϸ�");
			if(carList.size() == 3)notify();
		}		
	}
	static class Customer implements Runnable{
		private Car car;
		Customer (Car car) {this.car = car;}
		public void run(){
			String carName = null;
			for(int i = 0 ; i < 10 ; i ++){
				carName = car.pop();
				try{
					Thread.sleep((int)(Math.random()*200));
				}catch(Exception e){e.printStackTrace();}
			}
		}
	}
	static class Producer implements Runnable{
		private Car car;
		public Producer(Car car) {
		this.car = car;
		}
		@Override
		public void run() {
			String carName = null;
			for(int i = 0 ; i < 10 ; i++){
				carName = car.getCar();
				car.push(carName);
				try{
					Thread.sleep((int)(Math.random()*200));
				}catch(Exception e){e.printStackTrace();}				
			}
		}
	}
}
//�ű׳ʽ� ���� ���� �Ϸ�
//�ű׳ʽ� ���� �Ǹ�
//SM5 ���� ���� �Ϸ�
//SM5 ���� �Ǹ�
//SM5 ���� ���� �Ϸ�
//SM5 ���� �Ǹ�
//SM5 ���� ���� �Ϸ�
//�ű׳ʽ� ���� ���� �Ϸ�
//�ű׳ʽ� ���� �Ǹ�
//SM5 ���� �Ǹ�
//�ű׳ʽ� ���� ���� �Ϸ�
//�ű׳ʽ� ���� ���� �Ϸ�
//�ű׳ʽ� ���� �Ǹ�
//�ű׳ʽ� ���� ���� �Ϸ�
//�ű׳ʽ� ���� �Ǹ�
//�ҳ�Ÿ ���� ���� �Ϸ�
//�ű׳ʽ� ���� ���� �Ϸ�
//�ű׳ʽ� ���� �Ǹ�
//�ҳ�Ÿ ���� �Ǹ�
//�ű׳ʽ� ���� �Ǹ�

