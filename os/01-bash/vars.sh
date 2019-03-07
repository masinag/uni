#! /bin/bash

esempio=7
echo ${esempio}

comando="ls"
echo ${comando}
${comando}

echo "VARIABILI SPECIALI"
echo "ARGV: "$@
echo "ARGC:"$#
echo $0
echo $1
echo $2
