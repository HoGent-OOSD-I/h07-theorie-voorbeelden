package main;

import cui.ReceptToevoegenApplicatie;
import cui.ReceptWijzigenApplicatie;
import domein.DomeinController;

public class StartUp {
    static void main() {
        DomeinController dc = new DomeinController();
        new ReceptToevoegenApplicatie(dc).voegReceptToe();
        new ReceptWijzigenApplicatie(dc).wijzigRecept();
    }
}
