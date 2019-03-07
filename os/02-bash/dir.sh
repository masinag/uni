#! /bin/bash
# $( <command> ) -> execute <command> before in a subshell

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
echo "DIR = ${DIR}"
