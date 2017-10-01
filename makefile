all: clean;

clean:
	find . -type f | grep '~'$ | xargs rm
