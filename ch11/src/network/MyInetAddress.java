package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddress {
	
	
	InetAddress ip;
	
	public MyInetAddress(InetAddress ip) {
		this.ip = ip;
	}

	public void setInetAddress (InetAddress ip) {
		this.ip = ip;
	}
	
	public void printInfo() {
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip.toString());	// toString 생략가능
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(InetAddress.getByName("www.youtube.com"));
			MyInetAddress inet = new MyInetAddress(InetAddress.getLocalHost());	// 현재 내 컴퓨터의 host를 가져옴
			inet.printInfo();
			inet.setInetAddress(InetAddress.getByName("www.infinitybooks.co.kr"));
			inet.printInfo();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
