package com.gevernova.userregistration;
@FunctionalInterface
interface Validator {
    boolean validate(String input);
}

