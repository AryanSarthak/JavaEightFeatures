package com.gevernova.addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookService {

    ArrayList<Contact> contacts = new ArrayList<>();

    public boolean addContact(Contact contact) {
        boolean exists = contacts.stream()
                .anyMatch(c -> c.equals(contact));
        if (exists) return false;
        contacts.add(contact);
        return true;
    }

    public List<Contact> searchByCity(String city) {
        return contacts.stream()
                .filter(c -> c.city.equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Contact> searchByState(String state) {
        return contacts.stream()
                .filter(c -> c.state.equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }


    public Map<String, List<Contact>> viewByCity() {
        return contacts.stream()
                .collect(Collectors.groupingBy(c -> c.city));
    }

    public Map<String, List<Contact>> viewByState() {
        return contacts.stream()
                .collect(Collectors.groupingBy(c -> c.state));
    }


    public long countByCity(String city) {
        return contacts.stream()
                .filter(c -> c.city.equalsIgnoreCase(city))
                .count();
    }

    public long countByState(String state) {
        return contacts.stream()
                .filter(c -> c.state.equalsIgnoreCase(state))
                .count();
    }


    public List<Contact> sortByName() {
        return contacts.stream()
                .sorted(Comparator.comparing(Contact::getFullName))
                .collect(Collectors.toList());
    }


    public List<Contact> sortByCity() {
        return contacts.stream()
                .sorted(Comparator.comparing(c -> c.city))
                .collect(Collectors.toList());
    }

    public List<Contact> sortByState() {
        return contacts.stream()
                .sorted(Comparator.comparing(c -> c.state))
                .collect(Collectors.toList());
    }

    public List<Contact> sortByZip() {
        return contacts.stream()
                .sorted(Comparator.comparing(c -> c.zip))
                .collect(Collectors.toList());
    }
}
