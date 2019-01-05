# https://www.cyberciti.biz/faq/how-to-install-kotlin-programming-language-on-ubuntudebian-linux/
APP=hello
JAVAC=javac
JAVA=java
DESTPATH=com/fredollinger
JAVA_FILES = DTDate.java

all: $(APP).jar DTDate.class
	jar cvf $(APP).jar hello.jar

$(APP).jar:
	 kotlinc hello.kt -include-runtime -d hello.jar

run:
	$(JAVA) -jar $(APP).jar

clean:
	rm -f $(APP).jar

DTDate.class:
	$(JAVAC) $(JAVA_FILES)
	mkdir -p $(DESTPATH)
	mv *.class $(DESTPATH)
