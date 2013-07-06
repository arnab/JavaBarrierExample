## JavaBarrierExample

### Steps
1. Write your code that you wish you had: f9372d7
  * inspired by T/BDD, which I am very much used to.
1. Use Java's CyclicBarrier to make it happen: 9a82c3f
  * So we can learn the interface
1. Replace CyclicBarrier with a stub implementation
  * also simplify the API's cruft - we don't need those exceptions to be caught
  for the purpose of this demo
1. Implement the barrier: 0a7370c & 9b26727

### Running
1. `git clone <this repo> && cd <repo>`
1. `javac *.java && java BarrierExample`
1. Output:

```
Thread-1: running
Thread-1: this should happen before reaching the barrier
Thread-2: running
Thread-2: this should happen before reaching the barrier
Thread-3: running
Thread-3: this should happen before reaching the barrier
Thread-4: running
Thread-4: this should happen before reaching the barrier
Thread-5: running
Thread-5: this should happen before reaching the barrier
Thread-6: running
Thread-6: this should happen before reaching the barrier
Thread-7: running
Thread-7: this should happen before reaching the barrier
Thread-8: running
Thread-8: this should happen before reaching the barrier
Thread-9: running
Thread-9: this should happen before reaching the barrier
Thread-10: running
Thread-10: this should happen before reaching the barrier
Thread-10: this should happen after the barrier
Thread-7: this should happen after the barrier
Thread-8: this should happen after the barrier
Thread-5: this should happen after the barrier
Thread-2: this should happen after the barrier
Thread-6: this should happen after the barrier
Thread-9: this should happen after the barrier
Thread-1: this should happen after the barrier
Thread-4: this should happen after the barrier
Thread-3: this should happen after the barrier
```

Hence, it works for this simplistic demo purpose.
