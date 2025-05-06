package de.ldbv.gewan.client.bdt.cucumber.tutorial;

import io.cucumber.java.en.Given;

public class StepDefinitionsClientGiven {

    @Given("do_BaseStateMitAnmeldung {string} {string}")
    public void do_base_state_mit_anmeldung(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Basestate mit Anmeldung");
    }

    @Given("Initiierung Ummeldung Betrieb")
    public void initiierung_ummeldung_betrieb() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Initiierung Ummeldung Betrieb");
    }

    @Given("Suche Betrieb - Felder füllen und suchen {string} {string} {string} {string} {string} {string} {string}")
    public void sucheBetriebFelderFüllenUndSuchen(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Suche Betrieb");
    }

    @Given("fuelle_Textfeld {string} {string} {string} {string} {string}")
    public void fuelle_textfeld(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Fülle Textfeld");
    }
    @Given("fuelle_Textfeld {string} {string} {string} {string}")
    public void fuelle_textfeld(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Fülle Textfeld");
    }

    @Given("klicke_Checkbox {string} {string} {string}")
    public void klicke_checkbox(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Klicke Checkbox");
    }

    @Given("klicke_Button {string} {string} {string} {string}")
    public void klicke_button(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Klicke Button");
    }
}
