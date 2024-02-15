package com.leetcode.exp.Leetcode_exp.on9thFeb2024.AbstractFactoryPattern.UIFactory;


import com.leetcode.exp.Leetcode_exp.on9thFeb2024.AbstractFactoryPattern.Button;
import com.leetcode.exp.Leetcode_exp.on9thFeb2024.AbstractFactoryPattern.CheckBox;

public interface UiFactory {
   Button createButton();
   CheckBox creatCheckbox();
}
