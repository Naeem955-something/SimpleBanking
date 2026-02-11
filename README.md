
# 🏦 Bank Account Management System

A **Java console application** to manage **Checking** and **Savings Accounts**.
Supports deposits, withdrawals, interest calculations, credit card management, and overdraft handling.

---

## ✨ Features

### 💳 Accounts

* **Checking Account**

  * Deposit / Withdraw
  * Overdraft limit
  * Monthly interest

* **Savings Account**

  * Deposit / Withdraw
  * Credit card assignment
  * Expiry date tracking
  * Monthly interest

### 🔍 Operations

* Create new accounts (Checking / Savings)
* Automatic deposit/withdrawal simulation
* Print account info including date created, balance, interest, overdraft/credit card

---

## 📂 Structure

```
Bank/
├── Account.java          # Base class for accounts
├── CheckingAcoount.java  # Checking account with overdraft
├── SavingAccount.java    # Savings account with credit card
└── Main.java             # Menu-driven console application
```

**Class Relationships:**

* `Account` → base class (ID, balance, interest, creation date)
* `CheckingAcoount` → extends Account (overdraft support)
* `SavingAccount` → extends Account (credit card, expiry date)

---

## 🚀 How to Run

1. Compile all files:

```bash
javac Bank/*.java
```

2. Run the program:

```bash
java Bank.Main
```

3. Follow menu prompts to:

* Create Checking or Savings accounts
* Deposit/Withdraw funds
* Display account information

---

## 💡 Notes

* Withdrawals respect **overdraft limits** (for checking) and minimum balance (for savings).
* Savings accounts can store a **credit card with expiry date**.
* Monthly interest is calculated as `AnnualInterestRate / 2`.

---

## 🌟 Future Enhancements

* Add **file or database storage** for accounts
* Implement **user authentication**
* GUI interface for easier interaction
* Automated monthly interest calculation

---


