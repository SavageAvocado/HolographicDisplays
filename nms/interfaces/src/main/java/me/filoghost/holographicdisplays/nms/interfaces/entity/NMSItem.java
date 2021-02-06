/*
 * Copyright (C) filoghost and contributors
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package me.filoghost.holographicdisplays.nms.interfaces.entity;

import org.bukkit.inventory.ItemStack;

public interface NMSItem extends NMSEntityBase, NMSCanMount {
    
    // Sets the location through NMS.
    void setLocationNMS(double x, double y, double z);
    
    // Sets the bukkit ItemStack for this item.
    void setItemStackNMS(ItemStack stack);

    // The raw NMS ItemStack object.
    Object getRawItemStack();
    
}