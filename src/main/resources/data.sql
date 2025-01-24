INSERT INTO motores (fabricante, cilindrada, potencia, combustible) VALUES ('FORD', 2500 , 120, 'GAS');
INSERT INTO motores (fabricante, cilindrada, potencia, combustible) VALUES ('RENAULT', 2000 , 100, 'DIESEL');
INSERT INTO motores (fabricante, cilindrada, potencia, combustible) VALUES ('HONDA', 3000 , 500, 'JASOE');
INSERT INTO motores (fabricante, cilindrada, potencia, combustible) VALUES ('TOYOTA', 1500 , 80, 'HYBRID');  


INSERT INTO coches (marca, modelo, tipo, motor_id) VALUES ('Audi', 'A3', 'COUPE', 2);
INSERT INTO coches (marca, modelo, tipo, motor_id) VALUES ('BMW', 'Serie 3', 'SEDAN', 4);
INSERT INTO coches (marca, modelo, tipo, motor_id) VALUES ('Mercedes', 'Clase B', 'COUPE', 1);


INSERT INTO clientes (dni) VALUES ('12345678P');
INSERT INTO clientes (dni) VALUES ('88888888Z');

INSERT INTO ventas (coche_id, cliente_id, fecha_venta, precio) VALUES (1, 1, '2024-01-02', 100000);
INSERT INTO ventas (coche_id, cliente_id, fecha_venta, precio) VALUES (2, 2, '2024-01-02', 30000);
INSERT INTO ventas (coche_id, cliente_id, fecha_venta, precio) VALUES (3, 2, '2024-06-02', 500000);