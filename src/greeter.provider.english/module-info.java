module greeter.provider.english {
	
	requires greeter.api;
	
	provides greeter.api.Greeter
		with greeter.provider.english.EnglishGreeter;
	
}