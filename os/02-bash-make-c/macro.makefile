# You can also overwrite this macro by running make -f <filename> MACRO1=new_value
MACRO1=Pippo
MACRO2=Pluto

# Note: possible conflict with bash "$" special character
main:
	@echo Hello $(MACRO1)
	# The following rule is evaluated every time MACRO1 is used
	MACRO2=$(MACRO1)
	# The following rule is evaluated just now
	MACRO3:=$MACRO1

