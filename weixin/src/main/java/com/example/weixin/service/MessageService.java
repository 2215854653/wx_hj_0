package com.example.weixin.service;

import com.example.commons.domain.InMessage;
import com.example.commons.domain.OUtMessage;

public interface MessageService {

	OUtMessage onMessage(InMessage msg);
}
