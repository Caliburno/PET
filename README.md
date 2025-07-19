# Personal Expense Tracker

A desktop application for managing personal finances, built with JavaFX and Maven. Track expenses, incomes, due dates, debts, and payment installments with intuitive visual summaries and breakdowns.

## Features

- **Expense Management:**  
  - Add, edit, delete, and view expenses.
  - Assign categories to expenses (e.g., food, utilities, leisure).
  - Track totals by category, monthly, and overall.

- **Income Tracking:**  
  - Add, edit, delete incomes.
  - View percentage of income spent per category.

- **Debt & Installment Tracker:**  
  - Monitor payment due dates and outstanding debts.
  - Track installment payments.

- **Summary & Analytics:**  
  - Visual reports of spending and income.
  - Breakdown by category and time period.

- **Single User Mode:**  
  - All data stored locally (SQLite).
  - Future plans for Android app, cloud sync, and multi-user support.

## Tech Stack

- **Languages & Frameworks:**  
  - Java 17+  
  - JavaFX (UI)  
  - Maven (build tool)  
  - SQLite (local database)  
  - PostgreSQL (planned for online/cloud sync)  
  - Spring Boot (planned for API and backend services)

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven (latest version)
- (Optional) SQLite database browser for viewing local data

### Installation

1. **Clone the repository:**  
   ```bash
   git clone https://github.com/your-username/personal-expense-tracker.git
   cd personal-expense-tracker
   ```

2. **Build the project:**  
   ```bash
   mvn clean install
   ```

3. **Run the application:**  
   ```bash
   mvn javafx:run
   ```

### Database Setup

The application uses SQLite for local data storage.  
The database file will be created automatically on first run in the app directory.  
No additional setup is required for local usage.

## Usage

- Launch the application.
- Create new income and expense records.
- Assign categories and view analytic summaries.
- Track due dates and installment payments via the dedicated tab.

## API Documentation

**_Reserved for future development!_**  
Once the cloud sync and RESTful API features are implemented, this section will include detailed endpoint documentation, usage examples, and authentication instructions.

## License

This project is licensed under the MIT License.  
You are free to use, modify, and distribute the code for personal or commercial purposes.

## Credits

- Developed by Caliburno and MPereira2025
- Powered by JavaFX, Maven, and SQLite.

---

_Stay tuned for updates as we expand to Android, add cloud synchronization, and launch our RESTful API!_
