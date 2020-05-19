package com.org.channel;

import java.util.ArrayList;
import java.util.List;

import com.org.subscriber.Observer;
import com.org.subscriber.Subscriber;

public class Channel implements Subject {
	
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	private String title;
	
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	@Override
	public void unSubscribe(Observer subscriber) {
		subscribers.remove(subscriber);
	}
	
	@Override
	public void notifySubscribers() {
		for(Observer subscriber : subscribers) {
			subscriber.update();
		}
	}
	
	@Override
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
