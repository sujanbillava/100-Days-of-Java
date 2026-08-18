# Day-39 PriorityQueue

## Topics Covered
- What is PriorityQueue
- Priority concept
- Creating PriorityQueue
- add()
- peek()
- poll()
- contains()
- isEmpty()
- PriorityQueue with Integer
- PriorityQueue with String
- Duplicate values
- Processing elements using poll()
- PriorityQueue vs ArrayDeque


## Important Concept
PriorityQueue processes elements according to priority.

For the default PriorityQueue<Integer>:
- Smaller number = higher priority
- peek() = view highest-priority element
- poll() = remove highest-priority element

Example:
1 → 2 → 3 → 4 → 5
↑
Highest priority

## String Priority
PriorityQueue<String> uses natural lexicographical ordering by default.

Example:
Apple → Banana → Mango

Apple has the highest priority.

## Duplicate Values
PriorityQueue allows duplicate values.

Example:
[10, 20, 10, 30]

## Important Difference
PriorityQueue does not guarantee that printing the complete queue will show sorted order.

However, repeatedly using poll() processes elements according to priority.


## Key Learning
PriorityQueue is useful when elements need to be processed according to priority instead of simply following insertion order.

