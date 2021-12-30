package com.cnos.springboot.concurrent;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-04 21:23
 */
public class PreferencesDemo {
    public static void main(String[] args) throws BackingStoreException {
        Preferences prefs = Preferences.userNodeForPackage(PreferencesDemo.class);
        prefs.put("Location", "0z");
        prefs.put("Footwear", "Ruby Slippers");
        prefs.putInt("Companions", 4);
        prefs.putBoolean("Are there witches?", true);
        int usageCount = prefs.getInt("UsageCount", 0);
        usageCount++;
        prefs.putInt("UsageCount", usageCount);
        for (String key : prefs.keys()) {
            System.out.println(key + ": " + prefs.keys());
        }
    }
}
