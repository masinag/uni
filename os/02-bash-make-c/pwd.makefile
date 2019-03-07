# Note that every row runs in a separate process
# therefore the last pwd prints the directory where the
# makefile is run

test:
	pwd
	cd /; pwd \
	pwd # Same row as before
	pwd

