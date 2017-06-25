
This project assembles multi-threaded examples in Java.

---
## Example 1 of non synchronized code
MTProblem class is not suitable to be used for multi-threaded access.

Depending on how threads are scheduled the error condition may arise or not.

The provided JUnit test MTProblemTest if launched a number of times
may print an error message such as:

```
java.lang.ArrayIndexOutOfBoundsException: 15

	at java.util.ArrayList.add(ArrayList.java:459)
	at com.ingcremonini.MTProblem.addName(MTProblem.java:28)
	at com.ingcremonini.MTProblemTest.addName_should_not_exceed_maxAllowedSize(MTProblemTest.java:37)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at com.anarsoft.vmlens.concurrent.junit.internal.ConcurrentStatement.evaluateStatement(ConcurrentStatement.java:12)
	at com.anarsoft.vmlens.concurrent.junit.internal.ConcurrentStatement.evaluate(ConcurrentStatement.java:43)
	at com.anarsoft.vmlens.concurrent.junit.internal.ParallelExecutorThread.run(ParallelExecutorThread.java:29)``
```

---
 