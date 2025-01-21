INSERT INTO ruedas (marca, diametro, ancho, estado) VALUES ('MICHELIN', 21, 205, 'NUEVA');
INSERT INTO ruedas (marca, diametro, ancho, estado) VALUES ('PIRELLI', 18, 205, 'GASTADA');
INSERT INTO ruedas (marca, diametro, ancho, estado) VALUES ('CONTINENTAL', 19, 220, 'USADA');
INSERT INTO ruedas (marca, diametro, ancho, estado) VALUES ('BRIDGESTONE', 20, 225, 'NUEVA');

INSERT INTO motores (fabricante, cilindrada, potencia, combustible) VALUES ('FORD', 2500 , 120, 'GAS');
INSERT INTO motores (fabricante, cilindrada, potencia, combustible) VALUES ('RENAULT', 2000 , 100, 'DIESEL');
INSERT INTO motores (fabricante, cilindrada, potencia, combustible) VALUES ('HONDA', 3000 , 500, 'JASOE');
INSERT INTO motores (fabricante, cilindrada, potencia, combustible) VALUES ('TOYOTA', 1500 , 80, 'HYBRID');  


INSERT INTO coches (marca, modelo, tipo, motor_id) VALUES ('Audi', 'A3', 'COUPE', 2);
INSERT INTO coches (marca, modelo, tipo, motor_id) VALUES ('BMW', 'Serie 3', 'SEDAN', 4);
INSERT INTO coches (marca, modelo, tipo, motor_id) VALUES ('Mercedes', 'Clase B', 'COUPE', 1);

INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (1, 1);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (1, 1);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (1, 1);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (1, 1);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (2, 2);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (2, 2);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (2, 2);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (2, 2);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (3, 4);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (3, 4);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (3, 3);
INSERT INTO coches_ruedas (coche_id, rueda_id) VALUES (3, 3);

INSERT INTO clientes (dni) VALUES ('12345678P');
INSERT INTO clientes (dni) VALUES ('88888888Z');

INSERT INTO ventas (coche_id, cliente_id, fecha_venta, precio) VALUES (1, 1, '2024-01-02', 100000);
INSERT INTO ventas (coche_id, cliente_id, fecha_venta, precio) VALUES (2, 2, '2024-01-02', 30000);
INSERT INTO ventas (coche_id, cliente_id, fecha_venta, precio) VALUES (3, 2, '2024-06-02', 500000);