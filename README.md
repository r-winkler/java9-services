This is a simple example project for demonstrating Java 9 services. There are several providers which implement the Greeter interface.

## Compilie

``` Java
javac --module-source-path src -d out $(find . -name *.java)
```

## Run

``` Java
java --module-path out -m greeter.cli/greeter.cli.Main
```