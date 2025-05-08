package de.ldbv.gewan.client.bdt.cucumber.tutorial;

import io.cucumber.java.en.Given;

public class StepDefinitionsClientBackground {

//    @Given("Benutzer ist angemeldet")
//    public void benutzer_ist_angemeldet() {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new io.cucumber.java.PendingException();
//        System.out.println("Benutzer is angemeldet");
//    }

    @Given("Benutzer ist angemeldet")
    public void benutzer_ist_angemeldet() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        System.out.println("Benutzer is angemeldet");

    }

    @Given("do_BaseStateMitAnmeldung {string} {string} {string}")
    public void do_base_state_mit_anmeldung(String string3, String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Basestate mit Anmeldung");
    }
}
