package com.crabgeek.pattern.create.Builder;

public class T410 extends Computer{
    private String graphicCard;

    public T410() {
        this.setType("ThinkPad T410i");
    }

    public String getGraphicCard() {
        return this.graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }


}
