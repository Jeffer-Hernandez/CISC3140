CC = g++

all: exercise1 exercise2 exercise3

exercise1: exercise1.o
	g++ exercise1.cpp -o exercise1 && ./exercise1

exercise2: exercise2.o
	g++ exercise2.cpp -o exercise2 && ./exercise2

exercise3: exercise3.o
	g++ exercise3.cpp -o exercise3 && ./exercise3
