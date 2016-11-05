module greeter.provider.german {
	
	requires greeter.api;
	
	provides greeter.api.Greeter
		with greeter.provider.german.GermanGreeter;
	
}