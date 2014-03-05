Yarp interface for Processing (Windows 32 bit)

4 March 2014
Johnty Wang - johntywang@gmail.com - HPlus Tech.

Works as an Eclipse project (will not load in the Processing IDE due to its inability to handle loadLibrary - still figuring it out)

jyarp.dll is the JNI library, and yarp.jar contains compiled Java yarp classes.

Sample code initializes network, opens a port, and sends mouse drag locations through port.