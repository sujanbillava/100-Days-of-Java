# Day-40 Iterator

## Topics Covered
- What is Iterator
- Creating an Iterator using iterator()
- hasNext()
- next()
- remove()
- Traversing collections using Iterator
- Removing elements safely while traversing
- Iterator with ArrayList
- Difference between next() and hasNext()

## Important Methods

### iterator()
Creates an Iterator for a collection.

### hasNext()
Checks whether another element is available.

### next()
Returns the next element and moves the Iterator forward.

### remove()
Removes the element most recently returned by next().

## Important Pattern

while(it.hasNext())
{
    String value = it.next();

    if(value.equals(remove))
    {
        it.remove();
    }
}

## Important String Concept

For comparing String values, use:

value.equals(remove)

Do not use:

value == remove

equals() compares the actual String content, while == compares references.


## Key Learning

Iterator allows us to move through a collection one element at a time and safely remove the current element when required.

