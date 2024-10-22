# Airplane Reservation System

## Overview

The Airplane Reservation System is a console-based application that allows users to view and reserve flights. This system manages flight details, user reservations, and ensures that only available flights can be booked.

## Features

- **Flight Listings**: Displays a list of available flights with details including flight number, airline, and route.
- **Reservation Management**: Users can reserve a flight by providing personal information.
- **Input Validation**: Ensures that user inputs, especially phone numbers, are valid.
- **Availability Check**: Only allows reservations for available flights.
- **User Interface**: A simple command-line interface for interaction.

## Packages

The application is organized into the following packages:

1. **Solutions**: Contains all the classes and interfaces required for the functionality of the reservation system.

### Key Classes

- **Airplane**: Manages the flight data and availability status.
  - Methods:
    - `getAirplace(String i)`: Retrieves flight details.
    - `reserveFlight(int index)`: Marks a flight as reserved.
    - `isAvailable(int index)`: Checks flight availability.

- **Main**: The entry point of the application that facilitates user interaction.
  
- **Reservation**: Handles the reservation logic and user information.
  - Methods:
    - `reserve(int flightIndex)`: Checks if a flight can be reserved.
    - `confirmReservation(int flightIndex)`: Confirms the reservation and updates the flight status.

- **User**: An interface that handles user input.

- **UserInfo**: Stores user information such as first name, last name, and phone number.
  - Validates phone number input.

## Installation

1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE.
3. Compile and run the `Main` class.

## Usage

1. Launch the application.
2. View the list of available flights.
3. Enter the flight number you wish to reserve.
4. Input your personal details (first name, last name, phone number).
5. Confirm your reservation.
6. Choose to continue or exit the application.

## Testing

The application includes unit tests for the core functionalities using JUnit:

- **AirplaneTest**: Tests flight retrieval and reservation status.
- **ReservationTest**: Tests reservation logic and confirmation.
- **UserInfoTest**: Tests user information handling and validation.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

