package chap15.sec06.t02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("Mail", "홍길동"));
		messageQueue.offer(new Message("SMS", "신용권"));
		messageQueue.offer(new Message("Kakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "Mail" :
					System.out.println(message.to + "님에게 " + message.command + " 을(를) 보냅니다.");
					break;
				case "SMS" :
					System.out.println(message.to + "님에게 " + message.command + " 을(를) 보냅니다.");
					break;
				case "Kakaotalk" :
					System.out.println(message.to + "님에게 " + message.command + " 을(를) 보냅니다.");
					break;
			}
		}
	}
}
