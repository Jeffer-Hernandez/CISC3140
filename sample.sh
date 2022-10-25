#!/bin/zsh

# functions for build.sh (bash script)
source build.sh && compile
source build.sh && run

# for the Date bash script
source lab2.sh && main "$(<data.txt)"


