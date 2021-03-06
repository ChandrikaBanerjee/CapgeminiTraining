package com.cg.factory;

import java.util.ResourceBundle;

import com.cg.provider.MesssageProvider;
import com.cg.renderer.MessageRenderer;

public class MessageFactory {
	public static MessageRenderer getMessageRenderer()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ResourceBundle bundle = ResourceBundle.getBundle("context");

		String providerStr = bundle.getString("provider");
		MesssageProvider provider = (MesssageProvider) Class.forName(providerStr).newInstance();

		String rendererStr = bundle.getString("renderer");
		MessageRenderer renderer = (MessageRenderer) Class.forName(rendererStr).newInstance();

		renderer.setMesssageProvider(provider);
		return renderer;
	}
}
