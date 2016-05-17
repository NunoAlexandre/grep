def grep(term, file)
	File.foreach(file) { |line|
        puts line if line.include? term
    }
end

if ( ARGV.length < 2 )
    puts "usage: grep term file"
else
	term = ARGV[0]
    file = ARGV[1]
    grep(ARGV[0], file)
end