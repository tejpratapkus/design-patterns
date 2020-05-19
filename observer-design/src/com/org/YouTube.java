package com.org;

import com.org.channel.Channel;
import com.org.subscriber.Subscriber;

public class YouTube {

	public static void main(String[] args) {
		Channel channel = new Channel();
		
		Subscriber subscriber = new Subscriber("Tej");
		Subscriber subscriber2 = new Subscriber("Nitish");
		Subscriber subscriber3 = new Subscriber("Raj");
		Subscriber subscriber4 = new Subscriber("Anu");
		Subscriber subscriber5 = new Subscriber("Sonam");
		
		channel.subscribe(subscriber);
		channel.subscribe(subscriber2);
		channel.subscribe(subscriber3);
		channel.subscribe(subscriber4);
		channel.subscribe(subscriber5);
		
		subscriber.subscribeChannel(channel);
		subscriber2.subscribeChannel(channel);
		subscriber3.subscribeChannel(channel);
		subscriber4.subscribeChannel(channel);
		subscriber5.subscribeChannel(channel);
		
		channel.upload("How to learn programming...");
	}
}
