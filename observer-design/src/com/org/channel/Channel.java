package com.org.channel;

import java.util.ArrayList;
import java.util.List;

import com.org.subscriber.Subscriber;

public class Channel {
	
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	private String title;
	
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	public void unSubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	public void notifySubscribers() {
		for(Subscriber subscriber : subscribers) {
			subscriber.update();
		}
	}
	
	public void upload(String str) {
		this.title = str;
		notifySubscribers();
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
