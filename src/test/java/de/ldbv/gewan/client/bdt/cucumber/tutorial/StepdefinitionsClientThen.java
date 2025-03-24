package de.ldbv.gewan.client.bdt.cucumber.tutorial;

import io.cucumber.java.en.Then;
public class StepdefinitionsClientThen {

    @Then("check_AufMaske {string}")
    public void check_auf_maske(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Check auf Maske");
    }
    @Then("navigiere_zurueckBisHauptmaske")
    public void navigiere_zurueck_bis_hauptmaske() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Navigiere zurück bis Hauptmaske");
    }
}
