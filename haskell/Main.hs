-- nunoalexandre.github.io

import Data.List
import System.Environment


main :: IO ()
main = getArgs >>= dispatch

dispatch :: [String] -> IO ()
dispatch (term:file:_) = grep term file
dispatch _ = putStrLn "usage: grep term file"

grep :: String -> FilePath -> IO ()
grep term file = readFile file >>= putStrLn . (linesWith term)

linesWith :: String -> String -> String
linesWith term =  unlines . filter (isInfixOf term) . lines