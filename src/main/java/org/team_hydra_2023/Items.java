package org.team_hydra_2023;

import java.io.Serializable;

public class Items  implements Serializable {
    private int itemRoomID = 0;
    private String itemName = "";
    private String itemDescription = "";

    public Items() {
    }

    public Items(int itemRoomID, String itemName, String itemDescription) {
        this.itemRoomID = itemRoomID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }


    public int getItemRoomID() {
        return itemRoomID;
    }

    public void setRoomID(int itemRoomID) {
        this.itemRoomID = itemRoomID;
    }

    public String getItemName() {
        setItemName(itemName.toLowerCase());
        return itemName;
    }

    public void setItemName(String itemName) {

        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

}
