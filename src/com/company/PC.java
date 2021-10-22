package com.company;

public class PC {
    String cpu;
    String ram;
    String hdd;
    int price;

    OverclockProfile[] overclockProfiles;
    public void anotherPC(String cpu, String ram, String hdd, OverclockProfile[] overclockProfiles) {
        this.cpu = "AMD";
        this.ram = "DDR5";
        this.hdd = "Barracude";
        this.overclockProfiles = overclockProfiles;
    }
}
