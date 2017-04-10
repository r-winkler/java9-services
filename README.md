This is a simple example project for demonstrating Java 9 services. There are several providers which implement the Greeter interface.

## Compile

``` Java
javac --module-source-path src -d out $(find . -name "*.java")
```

## Run

``` Java
java --module-path out -m greeter.cli/greeter.cli.Main
```

### Modularity

* strong encapsulation
* well-defined interfaces
* explicit depnendencies

### Good to know

* java.base module is implicitly put in every module as required depndency
* Java checks module dependencies at compile and runtime
* module-source-path: path to modules not yet compiled
* module-path: path to compiled modules