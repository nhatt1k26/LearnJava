## Why Java uses structure of Heap and Stack for memory instead of another structure like Queue, array ?

Heap:

1. * The heap is used for dynamic memory allocation and storage of objects.
   * Objects on the heap have variable lifetimes and can be accessed from different parts of the program.
   * The heap allows for flexible memory management and supports features such as garbage collection, which automatically deallocates memory for objects that are no longer referenced.
   * The heap is well-suited for managing objects with varying lifetimes and memory requirements.
2. Stack:
   * The stack is used for managing method calls, local variables, and method parameters.
   * Each method call creates a stack frame that contains local variables and method parameters.
   * The stack operates in a Last-In-First-Out (LIFO) manner, allowing for efficient allocation and deallocation of memory for method invocations.
   * The stack frames are small and have a fixed size, enabling quick access to variables.
