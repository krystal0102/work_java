package chat;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MsgSender extends Thread {
	String nickname;
	Socket socket;
	PrintWriter out;
	
	public MsgSender(String nickname, Socket socket) {
		this.nickname = "[" + nickname + "]";
		this.socket = socket;
		
		try {
			// 소켓에 출력 스트림을 연결
			out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		Scanner s = new Scanner(System.in);
		while (out != null) {
			String msg = s.nextLine();
			if (msg.equals("quit")) {
				out.close();  	// 스트림을 먼저 닫아주고
				out = null;		// null값을 줘버리면 g.c가 와서 비워버림
				System.exit(0); // 정상종료!
			}
			
			// 보내는 사람의 별명까지 앞에 붙여 전송
			out.println(nickname + msg);
			out.flush();
		}
		s.close();
	}

}
