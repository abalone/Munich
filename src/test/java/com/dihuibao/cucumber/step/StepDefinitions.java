package com.dihuibao.cucumber.step;

import com.dihuibao.cucumber.Belly;
import com.dihuibao.cucumber.User;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by dihuibao on 4/6/2016.
 */
public class StepDefinitions{
    private Belly belly;
    private int waitingTime;
    private List<User> users;
    private String docString;

    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int waitingTime) throws Throwable {
        this.waitingTime = waitingTime;
    }

    @Then("^my belly should (.*)$")
    public void my_belly_should_growl(String expectedSound) throws Throwable {
        String actualSound = belly.getSound(waitingTime);
        assertThat(actualSound, is(expectedSound));
    }

    @Given("^the following users exist:$")
    public void theFollowingUsersExist(List<User> users) throws Throwable {
        this.users = users;
    }


    @Then("^number of users should be (\\d+)$")
    public void numberOfUsersShouldBe(int count) throws Throwable {
        assertThat(this.users.size(), is(count));
    }

    @Given("^I see a doc string$")
    public void iSeeADocString(final String docString) throws Throwable {
        this.docString = docString;
    }

    @Then("^I can speak out this doc string$")
    public void iCanSpeakOutThisDocString(final String docString) throws Throwable {
        assertThat("I can speak: " + this.docString, is(docString));
    }

    @Before("@Important")
    public void beforeOutline() {
        System.out.println("Detected a important scenario.");
    }
}
