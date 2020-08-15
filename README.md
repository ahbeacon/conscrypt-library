# conscrypt-library

This repo demonstrates the problem that I have loading the conscrypt JNI
library.

```
javac Main.java
java -cp . Main

Exception in thread "main" java.lang.UnsatisfiedLinkError: libconscrypt_openjdk_jni-linux-x86_64.so: libstdc++.so.6: cannot open shared object file: No such file or directory
	at java.base/java.lang.ClassLoader$NativeLibrary.load0(Native Method)
	at java.base/java.lang.ClassLoader$NativeLibrary.load(ClassLoader.java:2442)
	at java.base/java.lang.ClassLoader$NativeLibrary.loadLibrary(ClassLoader.java:2498)
	at java.base/java.lang.ClassLoader.loadLibrary0(ClassLoader.java:2714)
	at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2627)
	at java.base/java.lang.Runtime.load0(Runtime.java:768)
	at java.base/java.lang.System.load(System.java:1834)
	at Main.<clinit>(Main.java:6)
```
