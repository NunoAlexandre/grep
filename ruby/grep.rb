def grep(term, file)
	File.foreach(file) { |line|
        puts line if line.include? term
    }
end

if ( ARGV.length < 2 )
    puts "usage: grep term file"
else
    grep(ARGV[0], ARGV[1])
end

