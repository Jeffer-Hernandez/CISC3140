# define compiler and compiler flag variables
JFLAGS=-g
JC=javac
.SUFFIXES:.java.class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
		CISC3140/Lab2.java\

# the default make target entry
default: classes
classes: $(CLASSES:.java=.class)
clean:
		$(RM) *.class



