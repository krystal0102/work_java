package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class BasicUDPServer {
	DatagramSocket dsock;
	DatagramPacket sPack, rPack; 
	InetAddress client;
	int sport = 7777, cport;
	
	public BasicUDPServer(int sport) {
		try {
			// DatagramPacket을 sport로 지정하여 생성
			this.sport = sport;
			System.out.println(">> 서버를 시작합니다."); 
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다." + "\n"); 
			this.dsock = new DatagramSocket(sport);
			// 현재 컴퓨터에서 지정된 포트번호로 데이터그램 소켓 생성 
			// DatagramSocket serverSocket = new DatagramSocket(7777);
			// 현재 컴퓨터에서 사용 가능한 포트번호로 데이터그램 소켓 생성 
			// DatagramSocket clientScoket = new DatagramSocket();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
	
	public void communicate() {
		try {
			// 키보드로부터 전송할 문자열을 입력받기 위해 BufferedReader 형태로 변환
			// InputStreamReader : 표준입력으로 1byte씩 입력받던걸 2byte씩 읽을 수 있도록 바꿔줌.
			// BufferedReader : 정해진 값만큼 읽어들일 수 있도록함
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
											
				byte[] buffer = new byte[1024];	//한번에 정보를 1 kilo byte씩 보내겠다
				
				// 클라이언트에서 전송되는 DatagramPacket을 받기 위해 rPack 생성한 후 대기 
				this.rPack = new DatagramPacket(buffer, buffer.length);
				
				// 클라이언트에서 메시지가 올때까지 대기
				this.dsock.receive(rPack);
				
				// 전송받은 결과를 문자열로 변환
				// String(byte[] bytes, int offset(배열의 시작점;여기서부터), int length(length만큼 쓰겠다) )
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				
				// 클라이언트(보내는사람)의 주소와 포트번호를 반환 
				this.client = rPack.getAddress(); 
				this.cport = rPack.getPort();		
				
				// 전송받은 결과를 출력하고 quit이면 종료
				System.out.println("[클라이언트" + client + ": " + cport + "] " + strIn);
				if (strIn.trim().equals("quit")) {
					break;				
				}
				
				// 여기까지가 클라이언트에서 보낸 정보를 출력하는것
				
				// 표준입력으로 입력된 정보를 DatagramPacket으로 만들어 클라이언트에 전송
				String strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);
				dsock.send(sPack);
			}
			System.out.println("UDP 서버를 종료합니다.");
		} catch(Exception e){
			System.out.println(e);
		}		
	}

	public static void main(String[] args) {
		BasicUDPServer client = new BasicUDPServer(7777);
		client.communicate();
	}
}