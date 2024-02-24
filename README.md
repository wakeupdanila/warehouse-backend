# Warehouse Backend Application

This is a backend application for managing items in a warehouse. It provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on items.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)
- Postman (for testing the API)

## Getting Started

To run the application locally, follow these steps:

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/wakeupdanila/warehouse-backend.git
   ```

2. Navigate to the project directory:
   ```bash
   cd warehouse-backend
   ```

3. Build the project using Maven:
   ```bash
   mvn clean package
   ```

4. Run the application:
   ```bash
   java -jar target/warehouse-backend.jar
   ```

The application will start running on `http://localhost:9090`.

## Using Postman to Interact with the API

### 1. Add Item (POST)

- **URL**: `http://localhost:9090/api/items`
- **Method**: POST
- **Body** (JSON):
  ```json
  {
      "name": "egg",
      "description": "big egg",
      "price": 2.50,
      "quantity": 10,
      "category": "food",
      "manufacturer": "Egg Corporation",
      "expiryDate": 12.02.2024,
      "location": "Katowice",
      "barcode": "123456789"
  }
  ```

### 2. Get Item by ID (GET)

- **URL**: `http://localhost:9090/api/items/{id}`
- **Method**: GET
- Replace `{id}` with the ID of the item you want to retrieve.

### 3. Update Item (PUT)

- **URL**: `http://localhost:9090/api/items/{id}`
- **Method**: PUT
- **Body** (JSON):
  ```json
   {
      "name": "egg",
      "description": "small egg",
      "price": 1.50,
      "quantity": 12,
      "category": "food",
      "manufacturer": "Egg Corporation",
      "expiryDate": 01.02.2024,
      "location": "Katowice",
      "barcode": "123456789"
  }
  ```
- Replace `{id}` with the ID of the item you want to update.

### 4. Delete Item (DELETE)

- **URL**: `http://localhost:9090/api/items/{id}`
- **Method**: DELETE
- Replace `{id}` with the ID of the item you want to delete.

### 5. Get All Items with Pagination (GET)

- **URL**: `http://localhost:9090/api/items`
- **Method**: GET
- This request fetches all items from the warehouse with pagination. You can specify additional query parameters like `page` and `size` to control the pagination.

### 6. Delete All Items (DELETE)

- **URL**: `http://localhost:9090/api/items`
- **Method**: DELETE
- This request deletes all items from the warehouse.
