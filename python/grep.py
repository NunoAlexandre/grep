import sys

if len(sys.argv) < 3 :
	print "usage: grep term file"
else: 
	term = sys.argv[1]
	file = sys.argv[2]
	with open(file) as file:
	    for line in file:
	        if term in line: 
	   			print line