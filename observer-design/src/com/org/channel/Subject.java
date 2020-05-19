package com.org.channel;

import com.org.subscriber.Observer;
import com.org.subscriber.Subscriber;

public interface Subject {

	void subscribe(Subscriber subscriber);

	void unSubscribe(Observer subscriber);

	void notifySubscribers();

	void upload(String str);

}