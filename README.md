# signalpath-scala-assessment
* Run using sbt run
* Tests located in src/test/scala

## Train of Thought
Looking at the line by line results of the initial function I converted I saw integer overflow so I switched to BigInt.

Then the performance was scaling poorly since the algorithm was O(2^n), so I took the original Python script and added the lru_cache so that the results of the function calls are cached instead of having to be executed to get the value of n = 90.

I thought about implementing an function cache to the Scala application but felt my grasp of Scala was a bit too rudimentary for that, so I converted the recursive aspects of the function to iteritive ones.

## Comfort Levels
* Comfort levels located in [COMFORTLEVELS.md](/COMFORTLEVELS.md)
