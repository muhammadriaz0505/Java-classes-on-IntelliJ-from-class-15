package com.syntax.class19;

import com.syntax.class20.Laptop;

public class AppleLaptop extends Laptop{
    void peintMake(){
        //can't access because we are in a different package if its default
        System.out.println(make);
    }
}
