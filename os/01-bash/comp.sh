#! /bin/bash
x=3
y=3
test $x -eq $y
echo "$x==$y? $?"
y=4
[ $x -eq $y ]
echo "$x==$y? $?"


if [ $x -eq 3 ];
then
	echo "OK"
else
	echo "NO"
fi

if [[ $x == 3 ]];
then
        echo "OK"
else
        echo "NO"
fi

echo "Digita una lettera e premi invio: "
read char
case $char in
	y) echo "Input: y";;
	n) echo "Input: n";;
	*) echo "Input: Nè y  nè n";;
esac
