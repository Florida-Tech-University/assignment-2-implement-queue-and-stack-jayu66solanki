[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/iXnbh7Dt)
# Coding Assignment: Queue + Stack Using a Queue (Java)

## Your tasks
1. Implement `ArrayQueue<E>` (circular array queue).
2. Implement `StackUsingQueue<E>` where stack operations are built using ONE queue.

## Rules
- `first()` and `dequeue()` return `null` when empty.
- `top()` and `pop()` return `null` when empty.
- `enqueue()` throws `IllegalStateException` if the queue is full (fixed capacity).
- `push()` throws `IllegalStateException` if the underlying queue is full.

## How to run tests locally
```bash
mvn test
