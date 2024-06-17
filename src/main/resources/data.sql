INSERT IGNORE INTO customer (name, date_of_birth, id_document, username, address) VALUES
('Jeroen de Vries', '1980-01-01', 'AB123456', 'jeroendevries', 'Vredenburg 40, 3511 BD Utrecht'),
('Lotte van der Meer', '1990-02-02', 'CD789012', 'lottevandermeer', 'Oudegracht 99, 3511 AE Utrecht'),
('Bram de Jong', '2000-03-03', 'EF345678', 'bramdejong', 'Biltstraat 333, 3572 AW Utrecht');

INSERT IGNORE INTO password (customer_id, password) VALUES
(1, "123456"),
(2, "123456"),
(3, "123456");

INSERT IGNORE INTO iban (customer_id, iban) VALUES
(1, "NL10ABNA0123456789"),
(2, "NL20ABNA0123456789"),
(3, "NL30ABNA0123456789");
