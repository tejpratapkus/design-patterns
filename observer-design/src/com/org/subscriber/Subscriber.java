package com.org.subscriber;

import com.org.channel.Channel;

public class Subscriber implements Observer {

	private String name;
	private Channel channel = new Channel();

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey " + name + ", Video uploaded " + channel.getTitle());
	}

	@Override
	public void subscribeChannel(Channel channel) {
		this.channel = channel;
	}
}
