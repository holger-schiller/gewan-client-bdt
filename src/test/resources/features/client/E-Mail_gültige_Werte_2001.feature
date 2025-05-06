#Auto generated Octane revision tag
@TID2001REV0.4.1
Feature: Betriebsummeldung

  Background: 
    Given Benutzer ist angemeldet

  Scenario Outline: E-Mail - Gueltige Werte
    Given lesen_Heute
    Given do_BaseStateMitAnmeldung "<Organisation>" "<Benutzer>"
    Given Initiierung Ummeldung Betrieb
    Given Suche Betrieb - Felder füllen und suchen "" "" "<Betriebsname>" "" "" "" ""
    Given fuelle_Textfeld "Wirksamkeitsdatum" "" "Datumsangaben" "" ""
    Given fuelle_Textfeld "Anzeigedatum" "" "Datumsangaben" ""
    Given klicke_Checkbox "<Ummeldegrund>" "" ""
    Given fuelle_Textfeld "Strasse" "<Strasse>" "" "1" "Ummeldeverlegung*"
    Given fuelle_Textfeld "Hausnr." "1a" "" "1" "Ummeldeverlegung*"
    Given fuelle_Textfeld "-" "1d" "" "1" "Ummeldeverlegung*"
    Given klicke_Button "Suche PLZ" "1" "" "Ummeldeverlegung*"
    Given fuelle_Textfeld "Email" "<eMailAdresse>" "" "1" "Ummeldeverlegung*"
    Given klicke_Button "OK" "" "" "Ummeldeverlegung*"
    Then check_AufMaske "Ummeldung: VG Maitenbeth"
    Then navigiere_zurueckBisHauptmaske

    Examples: 
      | Organisation | Benutzer | Betriebsname              | Ummeldegrund                 | Strasse | eMailAdresse |
      |    091835183 | GSachBe  | Betrieb für Test-ID 34743 | Verlegung innerhalb Gemeinde | Kuhweg  | <undefined>  |