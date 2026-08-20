# Day-41 Revision

## Topic
Revision of Day 32 to Day 40

## Topics Revised

- Day 32 → ArrayList
- Day 33 → HashSet
- Day 34 → HashMap
- Day 35 → TreeSet
- Day 36 → LinkedHashSet
- Day 37 → LinkedHashMap
- Day 38 → ArrayDeque
- Day 39 → PriorityQueue
- Day 40 → Iterator

## Concepts Revised

### ArrayList
- Allows duplicate elements
- Maintains insertion order
- Supports index-based access
- Important methods:
  - `add()`
  - `get()`
  - `set()`
  - `remove()`
  - `contains()`
  - `size()`

### HashSet
- Does not allow duplicates
- No guaranteed insertion order
- Important methods:
  - `add()`
  - `remove()`
  - `contains()`
  - `size()`

### HashMap
- Stores key-value pairs
- Keys are unique
- Values can be duplicated
- Important methods:
  - `put()`
  - `get()`
  - `containsKey()`
  - `remove()`
  - `size()`

### TreeSet
- Does not allow duplicates
- Stores elements in sorted order

### LinkedHashSet
- Does not allow duplicates
- Maintains insertion order

### LinkedHashMap
- Stores key-value pairs
- Maintains insertion order
- Keys are unique

### ArrayDeque
- Double-ended queue
- Allows insertion and removal from both ends
- Important methods:
  - `addFirst()`
  - `addLast()`
  - `removeFirst()`
  - `removeLast()`
  - `peekFirst()`
  - `peekLast()`

### PriorityQueue
- Processes elements according to priority
- Default `PriorityQueue<Integer>` gives the smallest number first
- Allows duplicate values
- Important methods:
  - `add()`
  - `peek()`
  - `poll()`

### Iterator
- Used to traverse collections
- Important methods:
  - `hasNext()`
  - `next()`
  - `remove()`




## Important Learning

- Use `list.get(i)` to access the corresponding ArrayList element.
- Use `sc.nextLine()` after `nextInt()` when switching to String input.
- Use `.equals()` for comparing Strings.
- Do not call `Iterator.next()` twice when checking the same element.
- Use `Iterator.remove()` to safely remove the current element during traversal.

