package com.cg.renderer;

import com.cg.provider.MesssageProvider;

public class PDFMessageRenderer implements MessageRenderer{
public MesssageProvider provider;
	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println(provider.getMessage()+ "On PDF");
	}

	@Override
	public void setMesssageProvider(MesssageProvider provider) {
		// TODO Auto-generated method stub
		this.provider=provider;
	}

}
