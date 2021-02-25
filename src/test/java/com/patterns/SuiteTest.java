package com.patterns;


import com.patterns.behavioral.strategy.strategy1.CreditCardStrategyTest;
import com.patterns.behavioral.strategy.strategy1.PaypalStrategyTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//SelectPackages({"com.patterns.creational", "com.patterns.behavioral"})
@SelectPackages("com.patterns")
@SuiteDisplayName("Suite patrones")

//@IncludeTags("database")
/*@IncludeTags({
        "database",
        "service"
})*/
// @ExcludeTags("webmvc")
// @SelectClasses({PaypalStrategyTest.class, CreditCardStrategyTest.class})
public class SuiteTest {
}
