#! /bin/bash

FILE="semaphore.txt"
echo "Create file '$FILE'"

# Until the file does not exist...
until [[ -e $FILE ]]; do
	sleep 3;
done

echo "OK"

echo "Now delete it"
while [[ -e $FILE ]]; do
	sleep 3;
done

echo "OK"
