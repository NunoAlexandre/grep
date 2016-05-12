import Data.List
import System.Environment

main :: IO ()
main = getArgs >>= dispatch

dispatch :: [String] -> IO ()
dispatch (term:file:_) = grep term file
dispatch _ = putStrLn "usage: grep term file"

grep :: String -> FilePath -> IO ()
grep term file = fmap lines (readFile file) >>= mapM_ putStrLn . filter (isInfixOf term)