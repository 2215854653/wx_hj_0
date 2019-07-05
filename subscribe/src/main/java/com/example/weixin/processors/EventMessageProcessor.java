package com.example.weixin.processors;

import com.example.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {
	public void onMessage(EventInMessage msg);

}
