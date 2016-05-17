import sys

def grep(term, file):
	with open(file) as file:
	    for line in file:
	        if term in line: 
	   			print line		

if len(sys.argv) < 3 :
	print "usage: grep term file"
else: 
	term = sys.argv[1]
	file = sys.argv[2]
	grep(term, file)