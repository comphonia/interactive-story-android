package com.comphonia.interactivestory.model;

public class Choice {
    private int textId;
    private int nextPage;

    public int getTextId() {
        return textId;
    }

    public Choice(int textId, int nextPage) {
        this.textId = textId;
        this.nextPage = nextPage;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
