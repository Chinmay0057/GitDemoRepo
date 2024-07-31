#!/bin/bash

file_path="E/240340120057/Q1.txt"

# Check if the file exists
if [ ! -e "$file_path" ]; then
    echo "The file does not exist."
    exit 1
fi

# Check if the file is readable
if [ -r "$file_path" ]; then
    echo "The file '$file_path' is readable by the user."
else
    echo "The file '$file_path' is not readable by the user."
fi
