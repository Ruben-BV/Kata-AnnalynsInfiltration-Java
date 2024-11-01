package org.factoriaf5.infiltration;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        
        if (knightIsAwake == true){
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        
        if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        
        if (archerIsAwake == false && prisonerIsAwake == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        
        if ((knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent==true)
            || (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent==true)
            || (knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent==true)
            || (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent==true)
            || (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent==false)){
            return true;
        }
        else {
            return false;
        }
    }

}
