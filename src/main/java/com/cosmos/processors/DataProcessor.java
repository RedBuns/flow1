package com.cosmos.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DataProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		String data=exchange.getIn().getBody(String.class);
		System.out.println("Body is "+data);
	}

}
