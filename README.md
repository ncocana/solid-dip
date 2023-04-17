# SOLID - DIP

**Table of contents**

- [SOLID - DIP](#solid---dip)
  - [Introduction](#introduction)
  - [DIP (Dependency Inversion Principle)](#dip-dependency-inversion-principle)
  - [Instructions](#instructions)

## Introduction

This is an exercise proposed by our teacher, [dfleta](https://github.com/dfleta), to practice and better understand the Dependency Inversion Principle (DIP) of the SOLID principles.   

## DIP (Dependency Inversion Principle)

The Dependency Inversion Principle states that high-level modules should not depend on low-level modules. Instead, both should depend on abstractions (interfaces or abstract classes). In addition, abstractions should not depend on details; details should depend on abstractions.   

In other words, this principle suggests that code should be written in a way that allows for flexibility and easy modification. By depending on abstractions rather than concrete implementations, it becomes easier to switch out different implementations without affecting the higher-level modules that rely on them. This also helps to reduce coupling between modules and promotes better separation of concerns.   

## Instructions

In this exercise, you have a "complicated" project to improve according to the principle of Dependency Inversion.   

This project manages a set of stores, each with its own inventory. The critical part of the application is an algorithm that we have invented that determines when it is necessary to reset a product in a store.   

In ```src``` there are two packages ```org.formacion.di.negocio```, with the business rules that will make us millionaires, and ```org.formacion.di.bbdd```, with the technical code we need to access to the database.   

Currently, there is a dependency of the ```negocio``` package, to the ```bbdd``` package, since the ```ControllerStoc``` needs to know what the current stock is in a store, and this is done by ```InventarioBBDD```.   

Your work:

- Make the ```negocio``` package not have any dependency on the ```bbdd``` package.
- Create an interface in ```negocio``` that captures what is needed from the inventory logic and make ```ControllerStoc``` express itself with this interface.

Once this change is made, the test should work without modifying anything!   
