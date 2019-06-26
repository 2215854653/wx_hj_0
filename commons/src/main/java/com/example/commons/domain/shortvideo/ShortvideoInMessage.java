package com.example.commons.domain.shortvideo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.commons.domain.InMessage;
import com.fasterxml.jackson.annotation.JsonProperty;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class ShortvideoInMessage extends InMessage {
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String media_id;
	
	@XmlElement(name = "ThumbMediaId")
	@JsonProperty("ThumbMediaId")
	private String thumb_media_id;

	public ShortvideoInMessage() {
		super.setMsgType("shortvideo");
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public String getThumb_media_id() {
		return thumb_media_id;
	}

	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}

	@Override
	public String toString() {
		return "ShortvideoInMessage [media_id=" + media_id + ", thumb_media_id=" + thumb_media_id + ", getToUserName()="
				+ getToUserName() + ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	

}
