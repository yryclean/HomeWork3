package com.company;

public class Main {

    public static void main(String[] args) {
        PC gamingPC = new PC();
        gamingPC.cpu = "Intel";
        gamingPC.ram = "DDR5";
        gamingPC.hdd = "Western Digital";
        gamingPC.price = 500;

        OverclockProfile profile1 = new OverclockProfile();
        gamingPC.overclockProfiles = new OverclockProfile[] {profile1};
        profile1.cpuSpeed = 1000;
        profile1.fanMode = "Silent";
        profile1.ramDiscSize = 30;

        OverclockProfile profile2 = new OverclockProfile();
        gamingPC.overclockProfiles = new OverclockProfile[] {profile2};
        profile2.cpuSpeed = 2000;
        profile2.fanMode = "Extreme";
        profile2.ramDiscSize = 60;

        PC anotherPC = new PC();
        anotherPC.cpu = "AMD";
        anotherPC.ram = "DDR6";
        anotherPC.hdd = "Seagate";
        anotherPC.price = 800;
        
    }
}