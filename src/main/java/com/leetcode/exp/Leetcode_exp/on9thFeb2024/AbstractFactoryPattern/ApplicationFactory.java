package com.leetcode.exp.Leetcode_exp.on9thFeb2024.AbstractFactoryPattern;


import com.leetcode.exp.Leetcode_exp.on9thFeb2024.AbstractFactoryPattern.UIFactory.UiFactory;

public class  ApplicationFactory {
     private Button button;
     private CheckBox checkBox;
     public ApplicationFactory(UiFactory factory) {
        button = factory.createButton();
        checkBox = factory.creatCheckbox();
     }
     public void paint() {
        button.paint();
        checkBox.paint();
     }
}
