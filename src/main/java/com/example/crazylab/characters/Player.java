package com.example.crazylab.characters;

import com.example.crazylab.items.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player extends Character {

    private final List<Item> items = new ArrayList<>();

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void addItem(String item) {
        switch (item) {
            case "I_mask" -> items.add(new Armour(ArmourType.MASK));
            case "I_diyMask" -> items.add(new Armour(ArmourType.DIY_MASK));
            case "I_syringe" -> items.add(new Tool(ToolType.SYRINGE));
            case "I_staningKit" -> items.add(new Tool(ToolType.STANING_KIT));
            case "I_enzymeKit" -> items.add(new Tool(ToolType.ENZYME_KIT));
            case "I_usbKey" -> items.add(new Tool(ToolType.USB_KEY));
            case "I_dnaSample" -> items.add(new Tool(ToolType.DNA_SAMPLE));
            case "I_virusSample" -> items.add(new Tool(ToolType.VIRUS_SAMPLE));
            case "I_report" -> items.add(new Tool(ToolType.REPORT));
            case "I_microscopeImage" -> items.add(new Tool(ToolType.MICROSCOPE_IMAGE));
            case "I_sandwich" -> items.add(new Weapon(WeaponType.SANDWICH));
            case "I_spray" -> items.add(new Weapon(WeaponType.SPRAY));
            default -> System.out.println("Wrong item type");
        }

    }

}
