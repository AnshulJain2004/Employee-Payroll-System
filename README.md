# Employee Payroll System

A simple, interactive Java console application that streamlines the management of employees’ payroll information. This project demonstrates key **Object-Oriented Programming (OOP)** concepts like **inheritance**, **abstract classes**, and **method overriding**, while calculating wages, bonuses, and deductions in real-time.

## Features

- **Modular Design**  
  - **Employee** (abstract class) defines the basic employee attributes and enforces the `salaryCalculation()` contract.  
  - **NormalEmployee** extends `Employee` to handle standard employees without additional bonus structures.  
  - **BonusEmployee** extends `Employee` with support for percentage-based bonuses.

- **Interactive Console Prompts**  
  - Guides the user to input essential details (like name, department, UAN, PF number, bank information, and gross wage).  
  - Dynamically asks whether an employee is eligible for a bonus and calculates salary accordingly.

- **Automated Calculations**  
  - Computes key salary components: Basic Wage, HRA, Conveyance & Medical Allowances, and Other Allowances.  
  - Deductions such as EPF and ESI are automatically derived based on predefined logic.  
  - Net Salary is presented after factoring in all earnings and deductions.

- **Flexible & Extensible**  
  - Easily extend functionality or modify existing modules for more complex payroll structures (tax slabs, multiple bonus tiers, etc.).

## How It Works

1. **Clone or Download**  
   ```bash
   git clone https://github.com/your-username/Employee-Payroll-System.git
   cd Employee-Payroll-System
   ```
2. **Compile & Run**  
   ```bash
   javac Main.java
   java Main
   ```
3. **Follow On-screen Prompts**  
   - Select whether the employee is a bonus or normal employee.  
   - Provide required details.  
   - View the resulting salary breakdown in the console.

## Project Structure

```
├── Main.java
├── Employee.java          # Abstract class defining common attributes and methods
├── NormalEmployee.java    # Inherits Employee for standard payroll calculations
├── BonusEmployee.java     # Inherits Employee and adds bonus percentage functionality
└── README.md              # Project documentation
```

## Technologies Used

- **Java**  (primary language)
- **Object-Oriented Programming** (inheritance, abstraction)

## Future Enhancements

- **Enhanced Validation**: Add data validation for user inputs (e.g., numeric checks for salary).  
- **Database Integration**: Store and retrieve employee records from a database for persistent data management.  
- **Graphical User Interface (GUI)**: Migrate from console-based to a GUI application for improved user experience.

## Contributing

Contributions, feature requests, and bug reports are welcome! Feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE) – see the LICENSE file for details.

---
