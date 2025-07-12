# 🛒 Supermarket Management System

A comprehensive Java-based desktop application for managing supermarket operations including product management, sales, billing, and user authentication.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Installation & Setup](#installation--setup)
- [Database Configuration](#database-configuration)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

## 🎯 Overview

This Supermarket Management System is a Java Swing-based desktop application designed to streamline supermarket operations. The system provides a complete solution for managing products, processing sales, generating bills, and handling user authentication with role-based access control.

## ✨ Features

### 🔐 Authentication & User Management
- **Role-based Login System**: Supports Admin and Cashier roles
- **Secure Authentication**: Password-protected access
- **User Session Management**: Proper session handling

### 📦 Product Management
- **Product CRUD Operations**: Add, Edit, Delete, and View products
- **Category Management**: Organize products by categories (Beverages, Vegetables, Meats)
- **Inventory Tracking**: Real-time stock quantity monitoring
- **Price Management**: Set and update product prices

### 💰 Sales & Billing
- **Sales Processing**: Add products to cart and process transactions
- **Bill Generation**: Automatic bill generation with itemized details
- **Total Calculation**: Real-time total calculation
- **Print Functionality**: Print bills for customers

### 📊 Data Management
- **Database Integration**: Apache Derby database for data persistence
- **Real-time Updates**: Live data synchronization
- **Data Filtering**: Filter products by categories
- **Inventory Updates**: Automatic stock updates after sales

## 🛠 Technology Stack

- **Language**: Java 8+
- **GUI Framework**: Java Swing
- **Database**: Apache Derby
- **IDE**: NetBeans (Recommended)
- **Build Tool**: Apache Ant
- **Dependencies**: 
  - `net.proteanit.sql.DbUtils` for database table operations
  - JDBC for database connectivity

## 📁 Project Structure

```
Supermarket/
├── src/supermarket/           # Main source code
│   ├── Inicio.java           # Splash screen and application entry point
│   ├── Login.java            # User authentication
│   ├── Products.java         # Product management interface
│   ├── Selling.java          # Sales and billing interface
│   ├── Category.java         # Category management
│   ├── Seller.java           # Seller management
│   ├── Formulario.java       # Form components
│   ├── Formulario2.java      # Additional form components
│   ├── UpdateAdmin.java      # Admin update interface
│   ├── Manejo_clientes.java  # Customer management
│   ├── Pag_Princ.java        # Main page
│   ├── Persona.java          # Person entity
│   └── iconos/               # Application icons
├── nbproject/                # NetBeans project configuration
├── build.xml                 # Ant build configuration
├── manifest.mf               # JAR manifest
└── Tables.PNG               # Database schema diagram
```

## 🚀 Installation & Setup

### Prerequisites
- Java JDK 8 or higher
- Apache Derby Database Server
- NetBeans IDE (recommended) or any Java IDE

### Step 1: Clone the Repository
```bash
git clone https://github.com/yourusername/supermarket-management.git
cd supermarket-management
```

### Step 2: Database Setup
1. Install Apache Derby Database Server
2. Start Derby Network Server:
   ```bash
   startNetworkServer
   ```
3. Create the database and tables using the schema provided in `Tables.PNG`

### Step 3: Configure Database Connection
Update the database connection strings in the following files:
- `src/supermarket/Login.java`
- `src/supermarket/Products.java`
- `src/supermarket/Selling.java`

Default connection string:
```java
"jdbc:derby://localhost:1527/SuperMarketdb"
```

### Step 4: Build and Run
```bash
# Using Ant
ant build
ant run

# Or using NetBeans
# Open the project in NetBeans and run
```

## 🗄 Database Configuration

The application uses Apache Derby with the following database structure:

### Tables:
- **PRODUCTTBL**: Product information (ID, Name, Quantity, Price, Category)
- **CATEGORYTBL**: Product categories
- **SELLERTBL**: User accounts (Admin/Cashier)
- **Sales Tables**: Transaction and billing data

### Database Connection:
- **URL**: `jdbc:derby://localhost:1527/SuperMarketdb`
- **Username**: `User1`
- **Password**: `User`

## 💻 Usage

### Starting the Application
1. Run `Inicio.java` - This starts the splash screen
2. The application automatically transitions to the login screen
3. Enter credentials and select your role (Admin/Cashier)

### Admin Functions
- **Product Management**: Add, edit, delete products
- **Category Management**: Manage product categories
- **User Management**: Manage cashier accounts
- **System Configuration**: Update system settings

### Cashier Functions
- **Sales Processing**: Add products to cart and process sales
- **Bill Generation**: Generate and print customer bills
- **Inventory Check**: View product availability

### Key Features:
- **Real-time Updates**: All changes are immediately reflected
- **Data Validation**: Input validation for all forms
- **Error Handling**: Comprehensive error handling and user feedback
- **Responsive UI**: Modern, user-friendly interface

## 📸 Screenshots

The application includes:
- **Splash Screen**: Loading screen with progress bar
- **Login Interface**: Secure authentication with role selection
- **Product Management**: CRUD operations for products
- **Sales Interface**: Bill generation and sales processing
- **Category Management**: Product categorization system

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

- **University project, built with team** -


## 🙏 Acknowledgments

- ULACIT (Universidad Latinoamericana de Ciencia y Tecnología)
- Apache Derby Database Community
- Java Swing Community

---

**Note**: This is a Java Swing desktop application designed for educational purposes and small to medium supermarket operations. For production use, consider additional security measures and scalability improvements. 