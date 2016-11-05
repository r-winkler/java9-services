module greeter.provider.french {
	
	requires greeter.api;
	
	provides greeter.api.Greeter
		with greeter.provider.french.FrenchGreeter;
	
}