/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Gestor;

import java.util.Collections;
import java.util.List;
import model.Gestor.GestorPercurso.Criteria;

/**
 *
 * @author AndreLaptop
 */
public class ResultadoPercurso {
    private Criteria criteria;
    private double cost;
    private List<Place> listPlaces;
    private List<Connection> listConnections;
    

    public ResultadoPercurso(Criteria criteria, double cost, List<Place> listPlaces, List<Connection> listConnections) {
        this.criteria = criteria;
        this.cost = cost;
        this.listPlaces = listPlaces;
        this.listConnections = listConnections;
    }

    public double getCost() {
        return cost;
    }

    public List<Place> getListPlacesCopy() {
        List unmodifiablePlaces = Collections.unmodifiableList(listPlaces);
        return unmodifiablePlaces;
    }

    public List<Connection> getListConnectionsCopy() {
        List unmodifiableConnections = Collections.unmodifiableList(listConnections);
        return unmodifiableConnections;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setListPlaces(List<Place> listPlaces) {
        this.listPlaces = listPlaces;
    }

    public void setListConnections(List<Connection> listConnections) {
        this.listConnections = listConnections;
    }
    
    public double getDistance() {
        double distance = 0.0;
        
        for(Connection c : listConnections) {
            distance += c.getDistance();
        }
        
        return distance;
    }

    public String getCriteria() {
        return criteria.toString();
    }
    
    
}