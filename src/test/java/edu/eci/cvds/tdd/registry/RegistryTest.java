package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    @Test
    public void validateRegistryResult() {
        Registry registry = new Registry();
        Person person1 = new Person();
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases
    @Test
    public void validateIsLive(){
        Registry registry = new Registry();
        Person person1 = new Person();
        person1.setAlive(true);
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateIsDead(){
        Registry registry = new Registry();
        Person person1 = new Person();
        person1.setAlive(false);
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }


    public void validateAge(Integer age, RegisterResult expectedValue){
        Registry registry = new Registry();
        Person person1 = new Person();
        person1.setAge(age);
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void validateAge(){
        validateAge(-1000, RegisterResult.INVALID_AGE);
        validateAge(-1, RegisterResult.INVALID_AGE);
        validateAge(0, RegisterResult.VALID);
        validateAge(1, RegisterResult.UNDER_AGE);
    }

}