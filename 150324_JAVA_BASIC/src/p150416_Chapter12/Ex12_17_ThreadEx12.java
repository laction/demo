package p150416_Chapter12;

import java.util.ArrayList;
import java.util.List;

/* 생산자 쓰레드. 소비자 쓰레드 예제
 * 자동차 3대가 생산될 때 까지 소비자는 wait()함
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
				case 1: carName = "소나타" ; break;
				case 2: carName = "매그너스" ; break;
			}
			return carName;
		}
		public synchronized String pop(){
			String carName = null;
			if(carList.size() ==0){
				try{
					System.out.println("차없음. 대기하세요.");
					wait();
				}catch(Exception e){}
			}
			carName = (String)carList.remove(carList.size() -1);
			System.out.println(carName + " 차량 판매");
			return carName;
		}
		public synchronized void push(String car){
			carList.add(car);
			System.out.println(car + " 차량 생산 완료");
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
//매그너스 차량 생산 완료
//매그너스 차량 판매
//SM5 차량 생산 완료
//SM5 차량 판매
//SM5 차량 생산 완료
//SM5 차량 판매
//SM5 차량 생산 완료
//매그너스 차량 생산 완료
//매그너스 차량 판매
//SM5 차량 판매
//매그너스 차량 생산 완료
//매그너스 차량 생산 완료
//매그너스 차량 판매
//매그너스 차량 생산 완료
//매그너스 차량 판매
//소나타 차량 생산 완료
//매그너스 차량 생산 완료
//매그너스 차량 판매
//소나타 차량 판매
//매그너스 차량 판매

