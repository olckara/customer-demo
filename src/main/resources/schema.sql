CREATE TABLE IF NOT EXISTS customer (
  customer_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,  -- Auto-generated UUID
  name VARCHAR(255) NOT NULL,
  date_of_birth DATE,
  id_document VARCHAR(255),
  username VARCHAR(255) UNIQUE NOT NULL,
  address VARCHAR(255)  -- Store address as a String
);

CREATE TABLE IF NOT EXISTS password (
  customer_id INT NOT NULL PRIMARY KEY,
  password VARCHAR(255) NOT NULL,
  FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

CREATE TABLE IF NOT EXISTS iban (
  iban VARCHAR(18) NOT NULL PRIMARY KEY,
  customer_id INT NOT NULL,
  FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);