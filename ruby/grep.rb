if ( ARGV.length < 2 )
  puts "usage: grep term file"
else
  term = ARGV[0]
  filepath = ARGV[1]
  File.foreach(filepath) { |line| puts line if line.include? term }
end