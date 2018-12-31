APP=DTDate
JAVAC=javac
JAVA=java
#JAVAC=/opt/java/bin/javac
#JAVA=/opt/java/bin/java
DESTPATH=com/fredollinger
JAVA_FILES = *.java

all: DTDate.class

DTDate.class:
	$(JAVAC) $(JAVA_FILES)
	mkdir -p $(DESTPATH)
	mv *.class $(DESTPATH)

clean:
	rm -f DTDate.class

test:       
	$(JAVA) -cp . $(DESTPATH)/$(APP)
