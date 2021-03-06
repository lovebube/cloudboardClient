package test.model;

public class Message {
	public String 					exchange = "";
	public String 					routingKey = "";
	public String 					body = "";
	
	public Message(String routingKey, String body){
		this.routingKey = routingKey;
		this.body = body;
	}
	
	public Message(String exchange, String routingKey, String body){
		this.exchange = exchange;
		this.routingKey = routingKey;
		this.body = body;
	}
	
	public String toString(){
		if (exchange.length() > 0) {
			return String.format("Exchange='%s' Key='%s', '%s'", exchange, routingKey, body);
		}
		else {
			return String.format("Key='%s', '%s'", routingKey, body);
		}
	}
}
