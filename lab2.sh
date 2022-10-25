#!/bin/zsh

lab_days(){

case $line in

1)

;;

2)

;;

3)
echo "You should see the number of days between today and the due date for lab3. Womp Womp"

;;

4)

;;

*)
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
    read -r line<data.txt

    echo "Please choose from one of the following options: (enter an integer)\n"
    echo "1) Days from now until Lab1's Due Date\n"
    echo "2) Days from now until Lab2's Due Date\n"
    echo "3) Days from now until Lab3's Due Date\n"
    echo "4) Days from now until Lab4's Due Date\n"
    echo "5) Custom Date\n"
    echo "Select 0 to end the program.\n"
    
    if (($line < 5));
    then lab_days
    elif [ "$line" -eq "5" ];
    then {custom_date}
    elif [ "$line" -eq "0" ];
    then {exit 1}
    fi;
}
main
