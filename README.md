# quiz-app-backend
quiz app that draws questions from an app deployed in heroku




[
  {
    "id": 1,
    "prompt": "Which of the following are primitive data types in Java?",
    "choices": ["int", "String", "boolean", "char"],
    "answer": [0, 2, 3]
  },
  {
    "id": 2,
    "prompt": "Which of the following is a valid declaration of a package in Java?",
    "choices": ["package java.util;", "pack java.util;", "import java.util;", "include java.util;"],
    "answer": [0]
  },
  {
    "id": 3,
    "prompt": "What is the default value of a local variable in Java?",
    "choices": ["null", "0", "false", "Local variables do not have a default value."],
    "answer": [3]
  },
  {
    "id": 4,
    "prompt": "Which method must be implemented by all threads in Java?",
    "choices": ["start()", "run()", "main()", "execute()"],
    "answer": [1]
  },
  {
    "id": 5,
    "prompt": "What is the size of int in Java?",
    "choices": ["8 bits", "16 bits", "32 bits", "64 bits"],
    "answer": [2]
  },
  {
    "id": 6,
    "prompt": "Which of the following are checked exceptions in Java?",
    "choices": ["IOException", "RuntimeException", "SQLException", "NullPointerException"],
    "answer": [0, 2]
  },
  {
    "id": 7,
    "prompt": "What does the keyword 'synchronized' mean in Java?",
    "choices": ["It is used to synchronize a block of code to be executed by one thread at a time.", "It is used to make a class immutable.", "It is used to make a variable volatile.", "It is used to create a new thread."],
    "answer": [0]
  },
  {
    "id": 8,
    "prompt": "Which of the following is a marker interface?",
    "choices": ["Serializable", "Comparable", "Runnable", "Cloneable"],
    "answer": [0, 3]
  },
  {
    "id": 9,
    "prompt": "What is the purpose of the 'transient' keyword in Java?",
    "choices": ["To create a temporary variable.", "To prevent a variable from being serialized.", "To prevent a class from being instantiated.", "To prevent a method from being overridden."],
    "answer": [1]
  },
  {
    "id": 10,
    "prompt": "Which of the following methods are defined in the Object class?",
    "choices": ["equals()", "hashCode()", "clone()", "finalize()"],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 11,
    "prompt": "What is the default access modifier in Java?",
    "choices": ["public", "protected", "private", "package-private"],
    "answer": [3]
  },
  {
    "id": 12,
    "prompt": "Which of the following are valid ways to create an instance of a class in Java?",
    "choices": ["new ClassName();", "ClassName obj = new ClassName();", "ClassName obj = ClassName.new();", "ClassName obj = ClassName.createInstance();"],
    "answer": [0, 1]
  },
  {
    "id": 13,
    "prompt": "Which of the following are valid return types for a method in Java?",
    "choices": ["void", "int", "String", "Any class type"],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 14,
    "prompt": "What is the main advantage of using Java Collections Framework?",
    "choices": ["It reduces programming effort.", "It increases performance.", "It provides interoperability between unrelated APIs.", "All of the above"],
    "answer": [3]
  },
  {
    "id": 15,
    "prompt": "What is the output of the following code?\n\n```java\nint x = 5;\nSystem.out.println(x++);\n```",
    "choices": ["4", "5", "6", "7"],
    "answer": [1]
  },
  {
    "id": 16,
    "prompt": "Which of the following classes implement the List interface?",
    "choices": ["ArrayList", "LinkedList", "Vector", "HashSet"],
    "answer": [0, 1, 2]
  },
  {
    "id": 17,
    "prompt": "Which of the following are true about the 'final' keyword in Java?",
    "choices": ["It can be used to mark a variable as immutable.", "It can be used to prevent method overriding.", "It can be used to prevent inheritance.", "It can be used to synchronize methods."],
    "answer": [0, 1, 2]
  },
  {
    "id": 18,
    "prompt": "What is the purpose of the 'super' keyword in Java?",
    "choices": ["To refer to the immediate parent class object.", "To call a parent class constructor.", "To access parent class methods.", "All of the above"],
    "answer": [3]
  },
  {
    "id": 19,
    "prompt": "What is the default value of a static variable in Java?",
    "choices": ["null", "0", "false", "Depends on the data type"],
    "answer": [3]
  },
  {
    "id": 20,
    "prompt": "What is the output of the following code?\n\n```java\nString str = \"Hello\";\nstr.concat(\" World\");\nSystem.out.println(str);\n```",
    "choices": ["Hello", "Hello World", "World", "null"],
    "answer": [0]
  },
  {
    "id": 21,
    "prompt": "Which of the following are true about constructors in Java?",
    "choices": ["Constructors can be overloaded.", "Constructors cannot be overridden.", "Constructors do not have a return type.", "Constructors are called implicitly when an object is created."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 22,
    "prompt": "Which of the following are valid Java keywords?",
    "choices": ["class", "public", "try", "return"],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 23,
    "prompt": "Which of the following is the correct way to declare a constant in Java?",
    "choices": ["final int MAX = 100;", "const int MAX = 100;", "immutable int MAX = 100;", "static int MAX = 100;"],
    "answer": [0]
  },
  {
    "id": 24,
    "prompt": "What will be the output of the following code?\n\n```java\nint a = 10;\na += ++a + a--;\nSystem.out.println(a);\n```",
    "choices": ["21", "22", "23", "24"],
    "answer": [2]
  },
  {
    "id": 25,
    "prompt": "Which of the following are true about interfaces in Java?",
    "choices": ["Interfaces can have default methods.", "Interfaces can have static methods.", "Interfaces can have private methods.", "Interfaces can have constructors."],
    "answer": [0, 1, 2]
  },
  {
    "id": 26,
    "prompt": "Which of the following are valid loop control statements in Java?",
    "choices": ["break", "continue", "goto", "return"],
    "answer": [0, 1, 3]
  },
  {
    "id": 27,
    "prompt": "Which of the following are true about the 'volatile' keyword in Java?",
    "choices": ["It ensures visibility of changes to variables across threads.", "It can be used with methods.", "It prevents instruction reordering.", "It is a type of synchronization."],
    "answer": [0, 2, 3]
  },
  {
    "id": 28,
    "prompt": "What is the purpose of the 'instanceof' keyword in Java?",
    "choices": ["To test whether an object is an instance of a specified class.", "To create an instance of a class.", "To destroy an instance of a class.", "To check if an object is not null."],
    "answer": [0]
  },
  {
    "id": 29,
    "prompt": "Which of the following are valid uses of the 'this' keyword in Java?",
    "choices": ["To refer to the current class instance variable.", "To invoke the current class method.", "To invoke the current class constructor.", "To return the current class instance."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 30,
    "prompt": "What is the output of the following code?\n\n```java\nString str1 = \"abc\";\nString str2 = new String(\"abc\");\nSystem.out.println(str1 == str2);\n```",
    "choices": ["true", "false"],
    "answer": [1]
  },
  {
    "id": 31,
    "prompt": "Which of the following are thread-safe classes in Java?",
    "choices": ["StringBuffer", "StringBuilder", "Vector", "HashMap"],
    "answer": [0, 2]
  },
  {
    "id": 32,
    "prompt": "Which of the following are true about abstract classes in Java?",
    "choices": ["Abstract classes can have abstract methods.", "Abstract classes cannot be instantiated.", "Abstract classes can have concrete methods.", "Abstract classes can be final."],
    "answer": [0, 1, 2]
  },
  {
    "id": 33,
    "prompt": "What will be the output of the following code?\n\n```java\nint x = 10;\nint y = 5;\nint z = x & y;\nSystem.out.println(z);\n```",
    "choices": ["0", "1", "5", "10"],
    "answer": [2]
  },
  {
    "id": 34,
    "prompt": "Which of the following are valid array declarations in Java?",
    "choices": ["int[] arr;", "int arr[];", "int arr[10];", "int[] arr = new int[10];"],
    "answer": [0, 1, 3]
  },
  {
    "id": 35,
    "prompt": "Which of the following are valid ways to handle exceptions in Java?",
    "choices": ["try-catch block", "throws clause", "throw keyword", "final block"],
    "answer": [0, 1, 2]
  },
  {
    "id": 36,
    "prompt": "What is the output of the following code?\n\n```java\nint i = 1;\nwhile (i <= 10) {\n    if (i == 5) {\n        break;\n    }\n    i++;\n}\nSystem.out.println(i);\n```",
    "choices": ["4", "5", "6", "10"],
    "answer": [2]
  },
  {
    "id": 37,
    "prompt": "Which of the following are true about the 'finally' block in Java?",
    "choices": ["It always executes when the try block exits.", "It is used to execute important code such as closing resources.", "It is optional.", "It is executed only if an exception is thrown."],
    "answer": [0, 1, 3]
  },
  {
    "id": 38,
    "prompt": "Which of the following are valid statements about the 'enum' keyword in Java?",
    "choices": ["Enums are a special type of class.", "Enums can have fields and methods.", "Enums can be instantiated using the 'new' keyword.", "Enums can implement interfaces."],
    "answer": [0, 1, 3]
  },
  {
    "id": 39,
    "prompt": "Which of the following are valid ways to create a thread in Java?",
    "choices": ["By extending the Thread class.", "By implementing the Runnable interface.", "By implementing the Callable interface.", "By implementing the Comparable interface."],
    "answer": [0, 1, 2]
  },
  {
    "id": 40,
    "prompt": "What is the output of the following code?\n\n```java\nint x = 5;\nSystem.out.println(++x + x++);\n```",
    "choices": ["10", "11", "12", "13"],
    "answer": [3]
  },
  {
    "id": 41,
    "prompt": "Which of the following are true about inner classes in Java?",
    "choices": ["Inner classes can be static.", "Inner classes can access the members of the outer class.", "Inner classes can be private.", "Inner classes can be abstract."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 42,
    "prompt": "Which of the following are valid ways to compare two strings in Java?",
    "choices": ["Using the equals() method.", "Using the == operator.", "Using the compareTo() method.", "Using the compare() method."],
    "answer": [0, 2]
  },
  {
    "id": 43,
    "prompt": "Which of the following are valid statements about Java memory management?",
    "choices": ["Java uses garbage collection to manage memory.", "The programmer must manually allocate and deallocate memory.", "Objects are allocated on the heap.", "Primitive types are allocated on the stack."],
    "answer": [0, 2, 3]
  },
  {
    "id": 44,
    "prompt": "What is the purpose of the 'assert' keyword in Java?",
    "choices": ["To create assertions.", "To debug a program.", "To handle exceptions.", "To declare variables."],
    "answer": [0, 1]
  },
  {
    "id": 45,
    "prompt": "Which of the following are valid uses of the 'finalize' method in Java?",
    "choices": ["To perform cleanup before an object is garbage collected.", "To close resources.", "To run code before the JVM exits.", "To execute important code at the end of a method."],
    "answer": [0, 1]
  },
  {
    "id": 46,
    "prompt": "Which of the following are valid ways to perform type casting in Java?",
    "choices": ["Implicit casting", "Explicit casting", "Downcasting", "Upcasting"],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 47,
    "prompt": "Which of the following are true about the 'super()' call in Java?",
    "choices": ["It calls the parent class constructor.", "It must be the first statement in the constructor.", "It can be used to call a specific constructor of the parent class.", "It can be called multiple times in a constructor."],
    "answer": [0, 1, 2]
  },
  {
    "id": 48,
    "prompt": "Which of the following are true about Java's String pool?",
    "choices": ["It is a pool of strings stored in the heap memory.", "It is a pool of strings stored in the stack memory.", "It helps in reusing immutable string objects.", "It improves the performance of the application."],
    "answer": [2, 3]
  },
  {
    "id": 49,
    "prompt": "Which of the following are valid uses of the 'transient' keyword in Java?",
    "choices": ["To indicate that a variable should not be serialized.", "To indicate that a variable should not be deserialized.", "To prevent a variable from being part of the default serialization mechanism.", "To indicate that a variable is volatile."],
    "answer": [0, 2]
  },
  {
    "id": 50,
    "prompt": "Which of the following are valid statements about method overloading in Java?",
    "choices": ["Methods can be overloaded by changing the number of parameters.", "Methods can be overloaded by changing the type of parameters.", "Methods can be overloaded by changing the return type.", "Methods can be overloaded by changing the access modifier."],
    "answer": [0, 1, 3]
  },
  {
    "id": 51,
    "prompt": "Which of the following are true about method overriding in Java?",
    "choices": ["The overriding method must have the same name and parameter list as the overridden method.", "The overriding method can have a different return type than the overridden method.", "The overriding method can have a different access modifier than the overridden method.", "The overriding method must not throw checked exceptions that are new or broader than those declared by the overridden method."],
    "answer": [0, 3]
  },
  {
    "id": 52,
    "prompt": "Which of the following are valid statements about Java's HashMap?",
    "choices": ["It allows null keys and null values.", "It maintains insertion order.", "It is not synchronized.", "It provides constant-time performance for the basic operations (get and put)."],
    "answer": [0, 2, 3]
  },
  {
    "id": 53,
    "prompt": "Which of the following are valid statements about Java's exception handling?",
    "choices": ["The 'catch' block must follow the 'try' block.", "The 'finally' block is optional.", "A 'try' block can be followed by multiple 'catch' blocks.", "A 'finally' block must be followed by a 'catch' block."],
    "answer": [0, 1, 2]
  },
  {
    "id": 54,
    "prompt": "Which of the following are valid statements about Java's 'Comparable' interface?",
    "choices": ["It is used to impose a natural ordering on objects.", "It contains the compareTo() method.", "It allows a class to define its own order.", "It is found in the java.util package."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 55,
    "prompt": "What is the output of the following code?\n\n```java\nint x = 2;\nswitch (x) {\n    case 1:\n        System.out.println(\"One\");\n        break;\n    case 2:\n        System.out.println(\"Two\");\n    case 3:\n        System.out.println(\"Three\");\n        break;\n    default:\n        System.out.println(\"Default\");\n}\n```",
    "choices": ["Two", "Two Three", "Three Default", "Two Three Default"],
    "answer": [1]
  },
  {
    "id": 56,
    "prompt": "Which of the following are valid statements about Java's LinkedList?",
    "choices": ["It implements the List interface.", "It implements the Deque interface.", "It maintains insertion order.", "It allows duplicate elements."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 57,
    "prompt": "Which of the following are valid statements about Java's 'final' keyword?",
    "choices": ["A final class cannot be subclassed.", "A final method cannot be overridden.", "A final variable can be reassigned.", "A final variable must be initialized when declared."],
    "answer": [0, 1]
  },
  {
    "id": 58,
    "prompt": "What is the output of the following code?\n\n```java\nboolean flag = true;\nif (flag = false) {\n    System.out.println(\"True\");\n} else {\n    System.out.println(\"False\");\n}\n```",
    "choices": ["True", "False", "Compilation Error", "Runtime Error"],
    "answer": [1]
  },
  {
    "id": 59,
    "prompt": "Which of the following are valid statements about Java's ArrayList?",
    "choices": ["It allows duplicate elements.", "It maintains insertion order.", "It is synchronized.", "It provides fast random access."],
    "answer": [0, 1, 3]
  },
  {
    "id": 60,
    "prompt": "Which of the following are valid uses of the 'default' keyword in Java?",
    "choices": ["To provide a default method implementation in an interface.", "To specify the default value for a method parameter.", "To specify a default case in a switch statement.", "To specify the default value for a class field."],
    "answer": [0, 2]
  },
  {
    "id": 61,
    "prompt": "Which of the following are valid uses of the 'static' keyword in Java?",
    "choices": ["To define a static method.", "To define a static variable.", "To define a static block.", "To define a static class."],
    "answer": [0, 1, 2]
  },
  {
    "id": 62,
    "prompt": "Which of the following are valid ways to iterate over an array in Java?",
    "choices": ["Using a for loop.", "Using a while loop.", "Using a do-while loop.", "Using a for-each loop."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 63,
    "prompt": "Which of the following are valid statements about Java's 'Map' interface?",
    "choices": ["It allows duplicate keys.", "It allows duplicate values.", "It does not maintain insertion order.", "It provides key-value pairs."],
    "answer": [1, 2, 3]
  },
  {
    "id": 64,
    "prompt": "Which of the following are valid uses of the 'switch' statement in Java?",
    "choices": ["To switch on an integer value.", "To switch on a string value.", "To switch on an enum value.", "To switch on a boolean value."],
    "answer": [0, 1, 2]
  },
  {
    "id": 65,
    "prompt": "Which of the following are valid uses of the 'this' keyword in Java?",
    "choices": ["To refer to the current instance of a class.", "To invoke the current class method.", "To invoke the current class constructor.", "To refer to the current class's superclass."],
    "answer": [0, 1, 2]
  },
  {
    "id": 66,
    "prompt": "Which of the following are valid statements about Java's 'Set' interface?",
    "choices": ["It allows duplicate elements.", "It does not allow duplicate elements.", "It maintains insertion order.", "It does not maintain insertion order."],
    "answer": [1, 3]
  },
  {
    "id": 67,
    "prompt": "Which of the following are valid statements about Java's 'String' class?",
    "choices": ["Strings are immutable.", "Strings can be concatenated using the '+' operator.", "Strings can be compared using the 'equals()' method.", "Strings can be converted to a character array using the 'toCharArray()' method."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 68,
    "prompt": "What is the output of the following code?\n\n```java\nint a = 5, b = 10;\nSystem.out.println(a > b ? a : b);\n```",
    "choices": ["5", "10"],
    "answer": [1]
  },
  {
    "id": 69,
    "prompt": "Which of the following are valid uses of the 'import' keyword in Java?",
    "choices": ["To import a single class.", "To import an entire package.", "To import a static member of a class.", "To import a specific method of a class."],
    "answer": [0, 1, 2]
  },
  {
    "id": 70,
    "prompt": "Which of the following are valid ways to declare a two-dimensional array in Java?",
    "choices": ["int[][] arr;", "int arr[][];", "int[] arr[];", "int[2][2] arr;"],
    "answer": [0, 1, 2]
  },
  {
    "id": 71,
    "prompt": "Which of the following are valid statements about Java's 'Iterator' interface?",
    "choices": ["It allows traversal of a collection.", "It provides methods to remove elements from the collection.", "It is found in the java.util package.", "It provides a method to check if the collection has more elements."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 72,
    "prompt": "Which of the following are valid uses of the 'synchronized' keyword in Java?",
    "choices": ["To synchronize a method.", "To synchronize a block of code.", "To synchronize a class.", "To synchronize a variable."],
    "answer": [0, 1]
  },
  {
    "id": 73,
    "prompt": "Which of the following are valid statements about Java's 'Optional' class?",
    "choices": ["It is used to represent an optional value.", "It is found in the java.util package.", "It helps in avoiding null pointer exceptions.", "It provides methods to check if a value is present."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 74,
    "prompt": "Which of the following are valid uses of the 'try-with-resources' statement in Java?",
    "choices": ["To automatically close resources.", "To handle exceptions.", "To improve code readability.", "To manage multiple resources."],
    "answer": [0, 1, 3]
  },
  {
    "id": 75,
    "prompt": "Which of the following are valid statements about Java's 'Stream' API?",
    "choices": ["It is used to process collections of objects.", "It provides methods for filtering and mapping data.", "It supports parallel processing.", "It is found in the java.util.stream package."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 76,
    "prompt": "What is the output of the following code?\n\n```java\nint[] arr = {1, 2, 3, 4, 5};\nSystem.out.println(arr[2]);\n```",
    "choices": ["1", "2", "3", "4"],
    "answer": [2]
  },
  {
    "id": 77,
    "prompt": "Which of the following are valid statements about Java's 'Lambda' expressions?",
    "choices": ["They provide a clear and concise way to represent one method interface using an expression.", "They are used primarily to define the method interface.", "They can be used to create anonymous functions.", "They can be passed as arguments to methods."],
    "answer": [0, 2, 3]
  },
  {
    "id": 78,
    "prompt": "Which of the following are valid statements about Java's 'forEach' method?",
    "choices": ["It is used to iterate over elements in a collection.", "It accepts a lambda expression as an argument.", "It is found in the java.util package.", "It provides a parallel version for parallel processing."],
    "answer": [0, 1, 2]
  },
  {
    "id": 79,
    "prompt": "Which of the following are valid statements about Java's 'CompletableFuture' class?",
    "choices": ["It is used for asynchronous programming.", "It provides methods to handle both success and failure.", "It supports combining multiple futures.", "It is found in the java.util.concurrent package."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 80,
    "prompt": "Which of the following are valid ways to create a Stream in Java?",
    "choices": ["Using the Stream.of() method.", "Using the Arrays.stream() method.", "Using the Collection.stream() method.", "Using the Files.lines() method."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 81,
    "prompt": "Which of the following are valid statements about Java's 'Optional' class?",
    "choices": ["It can be used to avoid null checks.", "It provides methods to check if a value is present.", "It allows performing actions only if a value is present.", "It is part of the java.util package."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 82,
    "prompt": "Which of the following are valid uses of the 'super' keyword in Java?",
    "choices": ["To refer to the superclass of the current object.", "To call a method of the superclass.", "To call a constructor of the superclass.", "To access a field of the superclass."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 83,
    "prompt": "Which of the following are valid uses of the 'this' keyword in Java?",
    "choices": ["To refer to the current instance of the class.", "To call another constructor in the same class.", "To pass the current instance as an argument to a method.", "To return the current instance from a method."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 84,
    "prompt": "Which of the following are valid statements about Java's 'instanceof' keyword?",
    "choices": ["It is used to test whether an object is an instance of a specific class.", "It returns a boolean result.", "It is used during runtime.", "It can be used to check against interfaces."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 85,
    "prompt": "Which of the following are valid statements about Java's 'Abstract' classes?",
    "choices": ["They can have abstract methods.", "They cannot be instantiated.", "They can have concrete methods.", "They can have fields and constructors."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 86,
    "prompt": "Which of the following are valid uses of the 'synchronized' keyword in Java?",
    "choices": ["To synchronize a method.", "To synchronize a block of code.", "To ensure that only one thread can access a resource at a time.", "To prevent deadlock in a multi-threaded environment."],
    "answer": [0, 1, 2]
  },
  {
    "id": 87,
    "prompt": "Which of the following are valid statements about Java's 'Serialization'?",
    "choices": ["It is the process of converting an object into a byte stream.", "It is used to save the state of an object.", "It allows objects to be transferred over a network.", "It is automatically handled by the JVM."],
    "answer": [0, 1, 2]
  },
  {
    "id": 88,
    "prompt": "Which of the following are valid uses of the 'volatile' keyword in Java?",
    "choices": ["To ensure visibility of changes to variables across threads.", "To prevent instruction reordering.", "To ensure atomicity of operations.", "To declare a variable that can be modified asynchronously."],
    "answer": [0, 1, 3]
  },
  {
    "id": 89,
    "prompt": "Which of the following are valid statements about Java's 'Thread' class?",
    "choices": ["It is used to create and control threads.", "It provides methods to start and stop threads.", "It is found in the java.lang package.", "It can be used to implement multithreading in a Java program."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 90,
    "prompt": "Which of the following are valid ways to handle exceptions in Java?",
    "choices": ["Using a try-catch block.", "Using a throws clause.", "Using a throw statement.", "Using a final block."],
    "answer": [0, 1, 2]
  },
  {
    "id": 91,
    "prompt": "Which of the following are valid statements about Java's 'Reflection' API?",
    "choices": ["It is used to inspect and manipulate classes, methods, and fields at runtime.", "It is found in the java.lang.reflect package.", "It allows dynamic creation of objects.", "It can be used to access private fields and methods."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 92,
    "prompt": "Which of the following are valid uses of the 'final' keyword in Java?",
    "choices": ["To create constants.", "To prevent method overriding.", "To prevent class inheritance.", "To synchronize methods."],
    "answer": [0, 1, 2]
  },
  {
    "id": 93,
    "prompt": "Which of the following are valid statements about Java's 'Annotations'?",
    "choices": ["They provide metadata about the program.", "They do not affect the execution of the program.", "They can be used to influence the way a program is compiled.", "They are defined using the '@' symbol."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 94,
    "prompt": "Which of the following are valid ways to define a 'Functional Interface' in Java?",
    "choices": ["Using the @FunctionalInterface annotation.", "Defining an interface with a single abstract method.", "Defining an interface with multiple abstract methods.", "Defining an interface with default and static methods."],
    "answer": [0, 1, 3]
  },
  {
    "id": 95,
    "prompt": "Which of the following are valid uses of the 'strictfp' keyword in Java?",
    "choices": ["To restrict floating-point calculations to ensure portability.", "To apply strict floating-point behavior to classes and methods.", "To prevent floating-point precision errors.", "To enhance performance of floating-point calculations."],
    "answer": [0, 1]
  },
  {
    "id": 96,
    "prompt": "Which of the following are valid statements about Java's 'Scanner' class?",
    "choices": ["It is used to parse primitive types and strings using regular expressions.", "It is found in the java.util package.", "It can be used to read input from various sources.", "It provides methods to tokenize the input."],
    "answer": [0, 1, 2, 3]
  },
  {
    "id": 97,
    "prompt": "Which of the following are valid uses of the 'transient' keyword in Java?",
    "choices": ["To prevent a variable from being serialized.", "To indicate that a variable is temporary.", "To prevent a variable from being part of the default serialization mechanism.", "To ensure that a variable is serialized only when necessary."],
    "answer": [0, 2]
  },
  {
    "id": 98,
    "prompt": "Which of the following are valid statements about Java's 'Date' and 'Time' API?",
    "choices": ["It is found in the java.time package.", "It provides classes for date and time manipulation.", "It supports both human-readable and machine-readable formats.", "It is immutable and thread-safe."],
    "answer": [0, 1, 3]
  },
  {
    "id": 99,
    "prompt": "Which of the following are valid uses of the 'synchronized' keyword in Java?",
    "choices": ["To synchronize a method.", "To synchronize a block of code.", "To ensure that only one thread can access a resource at a time.", "To prevent deadlock in a multi-threaded environment."],
    "answer": [0, 1, 2]
  },
  {
    "id": 100,
    "prompt": "Which of the following are valid statements about Java's 'String' class?",
    "choices": ["Strings are immutable.", "Strings can be concatenated using the '+' operator.", "Strings can be compared using the 'equals()' method.", "Strings can be converted to a character array using the 'toCharArray()' method."],
    "answer": [0, 1, 2, 3]
  }
]
