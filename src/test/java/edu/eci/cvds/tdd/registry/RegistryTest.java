package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    Person person = new Person();
    Person person2 = new Person();
    @Test
    public void validateRegistryResult() {

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases
    @Test
    public void validateIsLive(){
        person.setAlive(true);
        RegisterResult result = registry.isAlive(person);
        Assert.assertEquals(RegisterResult.VALID, result);

    }
    @Test
    public void validateAge(){
        person.setAge(20);
        RegisterResult result = registry.registerAge(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateDuplicateId(){
        person.setId(201);
        person2.setId(201);
        RegisterResult result = registry.duplicateId(person, person2);
        Assert.assertEquals(RegisterResult.VALID, result);
    }


}