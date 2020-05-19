package com.org.subscriber;

import com.org.channel.Channel;

public interface Observer {

	void update();

	void subscribeChannel(Channel channel);

}