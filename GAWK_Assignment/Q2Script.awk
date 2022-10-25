#!/usr/bin/awk -f
BEGIN { FS="," }
BEGIN {

#show question as output
print "Are you more likely to see a squirrel on the ground or above?"

#initialize a counters
g=0
a=0

#loop until EOF
do {
    if ($15 ~ /Above Ground/) a++;
    if ($15 ~ /Ground Plane/) g++;
}while(getline != 0)

#get probability percentage
above_freq = a/NR *1000
ground_freq = g/NR *1000

#print result as output
printf( "On any given day, you have a %d percent chance of seeing a squirrel on the ground.\n", ground_freq)
printf( "Whereas you have a %d percent chance of seeing a squirrel in a tree.\n", above_freq)
}