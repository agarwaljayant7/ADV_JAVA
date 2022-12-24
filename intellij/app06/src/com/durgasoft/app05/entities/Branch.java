package com.durgasoft.app05.entities;

public class Branch {
    private int bId;
    private String bName;

    public Branch(int bId, String bName) {
        this.bId = bId;
        this.bName = bName;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }
}
