# Java-Swing-GUI-application-for-an-electronic-lock
Java Swing GUI application for an electronic lock.
The display shall show the state of either "CLOSE" or "OPEN". 

Methods are : 
public booleancheckPIN(String PIN);  // return true for correct PIN
public void unlock();  // Unlock the system
public void lock();     // Lock the system

In the "CLOSE" state, the user types his PIN followed by the "Enter" key to unlock the system.
The display shall show an asterisk (*) for each number entered. 
The display shall show "WRONG PIN" if the PIN is incorrect. 
The "Clear" button clears the number entered (if any), locks the system and sets the display to "CLOSE". 
