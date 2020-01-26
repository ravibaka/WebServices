package com.mkyong.ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		//throw new NullPointerException();
		return "Hello World Ravi Baka " + name;
	}
 
}