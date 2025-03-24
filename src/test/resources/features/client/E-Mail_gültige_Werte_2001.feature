#Auto generated Octane revision tag
@TID2001REV0.4.0
Feature: Betriebsummeldung

  Background: 
    Given Benutzer ist angemeldet

  Scenario Outline: E-Mail - Gültige Werte
    Given lesen_Heute
    And do_BaseStateMitAnmeldung "<Organisation>" "<Benutzer>"
    And Initiierung Ummeldung Betrieb
    And Suche Betrieb - Felder füllen und suchen "" "" "<Betriebsname>" "" "" "" ""
    And fuelle_Textfeld "Wirksamkeitsdatum" "" "Datumsangaben" "" ""
    And fuelle_Textfeld "Anzeigedatum" "" "Datumsangaben" ""
    And klicke_Checkbox "<Ummeldegrund>" "" ""
    And fuelle_Textfeld "Strasse" "<Strasse>" "" "1" "Ummeldeverlegung*"
    And fuelle_Textfeld "Hausnr." "1a" "" "1" "Ummeldeverlegung*"
    And fuelle_Textfeld "-" "1d" "" "1" "Ummeldeverlegung*"
    And klicke_Button "Suche PLZ" "1" "" "Ummeldeverlegung*"
    And fuelle_Textfeld "Email" "<eMailAdresse>" "" "1" "Ummeldeverlegung*"
    And klicke_Button "OK" "" "" "Ummeldeverlegung*"
    Then check_AufMaske "Ummeldung: VG Maitenbeth"
    And navigiere_zurueckBisHauptmaske

    Examples: 
      | Organisation | Benutzer | Betriebsname              | Ummeldegrund                 | eMailAdresse |
      |    091835183 | GSachBe  | Betrieb für Test-ID 34743 | Verlegung innerhalb Gemeinde | <undefined>    |
