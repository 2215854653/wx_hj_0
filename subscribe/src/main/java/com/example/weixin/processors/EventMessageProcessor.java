package com.example.weixin.processors;

import org.lemonpzl.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {
	public void onMessage(EventInMessage msg);

}
