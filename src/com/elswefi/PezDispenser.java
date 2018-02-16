package com.elswefi;

public class PezDispenser {
    private final String mCharacterName;
    public static final int MAX_PEZ = 12;
    private int pezCount;

    public PezDispenser(String CharacterName) {
        mCharacterName = CharacterName;
        pezCount = 0;
    }

    public String getmCharacterName() {
        return mCharacterName;
    }

    public void fill() {
        fill(MAX_PEZ);
    }
    public void fill(int pezAmount){
        int newAmount =  pezCount+=pezAmount;
        if (newAmount>MAX_PEZ) {
            throw new IllegalArgumentException("TOO many pez !!");
        }
        pezCount=newAmount;
    }

    public boolean isImpty() {
        return pezCount == 0;
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isImpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    /* we prevented this following code with the word final :
public String swapTheHead (String newCharacterName){
String originalChName = mCharacterName;
mCharacterName=newCharacterName;
return originalChName;
}
*/
}