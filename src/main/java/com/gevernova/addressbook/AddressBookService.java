package com.gevernova.addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookService {

    // Stores all contacts in the address book
    ArrayList<Contact> contacts = new ArrayList<>();

    // Adds a new contact if it does not already exist
    // Returns false if duplicate contact is found, otherwise true
    public boolean addContact(Contact contact) {
        boolean exists = contacts.stream()
                .anyMatch(c -> c.equals(contact));
        if (exists) return false;
        contacts.add(contact);
        return true;
    }

    // Searches and returns all contacts belonging to a given city
    public List<Contact> searchByCity(String city) {
        return contacts.stream()
                .filter(c -> c.city.equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    // Searches and returns all contacts belonging to a given state
    public List<Contact> searchByState(String state) {
        return contacts.stream()
                .filter(c -> c.state.equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    // Groups contacts by city and returns a map
    // Key   -> City name
    // Value -> List of contacts in that city
    public Map<String, List<Contact>> viewByCity() {
        return contacts.stream()
                .collect(Collectors.groupingBy(c -> c.city));
    }

    // Groups contacts by state and returns a map
    // Key   -> State name
    // Value -> List of contacts in that state
    public Map<String, List<Contact>> viewByState() {
        return contacts.stream()
                .collect(Collectors.groupingBy(c -> c.state));
    }

    // Counts number of contacts present in a given city
    public long countByCity(String city) {
        return contacts.stream()
                .filter(c -> c.city.equalsIgnoreCase(city))
                .count();
    }

    // Counts number of contacts present in a given state
    public long countByState(String state) {
        return contacts.stream()
                .filter(c -> c.state.equalsIgnoreCase(state))
                .count();
    }

    // Sorts and returns contacts alphabetically by full name
    public List<Contact> sortByName() {
        return contacts.stream()
                .sorted(Comparator.comparing(Contact::getFullName))
                .collect(Collectors.toList());
    }

    // Sorts and returns contacts based on city name
    public List<Contact> sortByCity() {
        return contacts.stream()
                .sorted(Comparator.comparing(c -> c.city))
                .collect(Collectors.toList());
    }

    // Sorts and returns contacts based on state name
    public List<Contact> sortByState() {
        return contacts.stream()
                .sorted(Comparator.comparing(c -> c.state))
                .collect(Collectors.toList());
    }

    // Sorts and returns contacts based on zip code
    public List<Contact> sortByZip() {
        return contacts.stream()
                .sorted(Comparator.comparing(c -> c.zip))
                .collect(Collectors.toList());
    }
}
