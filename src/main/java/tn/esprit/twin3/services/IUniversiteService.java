package tn.esprit.twin3.services;

import tn.esprit.twin3.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversities();
    Universite addUniversity (Universite u);
    Universite updateUniversity (Universite u);
    Universite retrieveUniversity (long idUniversity);
    Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite);
    Universite desaffecterFoyerAUniversite(long idUniversite);
}
