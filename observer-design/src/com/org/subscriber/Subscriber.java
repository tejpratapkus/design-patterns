package com.org.subscriber;

import com.org.channel.Channel;

public class Subscriber {

	private String name;
	private Channel channel = new Channel();

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void update() {
		System.out.println("Hey " + name + ", Video uploaded " + channel.getTitle());
	}

	public void subscribeChannel(Channel channel) {
		this.channel = channel;
	}
}
