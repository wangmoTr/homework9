package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseElement baseElement = new BaseElement();
        System.out.println(baseElement.click());
        //for link Element class
        LinkElement smallLink = new LinkElement();
        System.out.println(smallLink.click());
        //for the text element class
        TextElement smallText = new TextElement();
        System.out.println(smallText.click());
    }
}
