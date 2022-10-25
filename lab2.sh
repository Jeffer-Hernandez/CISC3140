#!/bin/zsh
lab_days(){

d= $(date +%Y-%m-%d)

case $1 in

1)
lab1="2022-9-28"
echo $(( ($(date -d $lab1 +%s) - $(date -d $d +%s)) / 86400 )) days
;;

2)
lab2="2022-10-26"
echo $(( ($(date -d $lab2 +%s) - $(date -d $d +%s)) / 86400 )) days
;;

3)
lab3="2022-11-23"
echo $(( ($(date -d $lab3 +%s) - $(date -d $d +%s)) / 86400 )) days
;;

4)
lab4="2022-12-07"
echo $(( ($(date -d $lab4 +%s) - $(date -d $d +%s)) / 86400 )) days
;;

esac


}

custom_date(){
echo "Enter two dates seprately"
read A
read B
echo $(( ($(date -d $B +%s) - $(date -d $A +%s)) / 86400 )) days

}
main() {
    echo "Please choose from one of the following options: (enter an integer)\n"
    echo "1) Days from now until Lab1's Due Date\n"
    echo "2) Days from now until Lab2's Due Date\n"
    echo "3) Days from now until Lab3's Due Date\n"
    echo "4) Days from now until Lab4's Due Date\n"
    echo "5) Custom Date\n"
    echo "Select 0 to end the program.\n"
    read $1
    if [ $1 > 0 ] && [ $1 < 5 ];
    then
        lab_days;
    elif [ "$1" == "5" ];
    then
        custom_date;
    elif [ "$1" == "0" ];
    then
        exit 1
    fi
}

main