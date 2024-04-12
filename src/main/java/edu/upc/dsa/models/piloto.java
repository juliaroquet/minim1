package edu.upc.dsa.models;


import java.util.Comparator;

public class piloto {
    private String id;
    private String name;
    private String lastName;
    private int flightHours;

    // Constructor
    public piloto(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.flightHours = 0;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }


    public static Comparator<piloto> flightHoursComparator = new Comparator<piloto>() {
        @Override
        public int compare(piloto p1, piloto p2) {
            return p2.getFlightHours() - p1.getFlightHours();
        }
    };
}
