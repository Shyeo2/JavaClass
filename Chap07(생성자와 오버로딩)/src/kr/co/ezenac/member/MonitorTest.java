package kr.co.ezenac.member;

public class MonitorTest {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor();
		monitor.power();
		monitor.power();
		monitor.power();
		monitor.power();
		
		monitor.channel = 5;
		monitor.channelUP();
		monitor.channelUP();
		
		monitor.channelDown();
		monitor.channelDown();
	}

}
