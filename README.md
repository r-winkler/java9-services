This is a simple example project for demonstrating Java 9 services. There are several providers which implement the Greeter interface.

## Compile

``` Java
javac --module-source-path src -d out $(find . -name "*.java")
```

## Run

``` Java
java --module-path out -m greeter.cli/greeter.cli.Main
```

## Linkage (Create custom image with low footprint)

not checked if working...

``` Java
rm -rf image && \
jlink --module-path jars/:$JAVA_HOME/jmods \
--add-modules greeter.cli \
--add-modules greeter.provider.english \
--add-modules greeter.provider.french \
--add-modules greeter.provider.german \
--strip-debug \
--compress=2 \
--output image
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
* readability is not transitive. But can be implied by "requires transitive.."
* use 'java --list-modules' to list all platform modules