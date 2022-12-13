-- One admin user, named admin1 with passwor 4dm1n and authority admin
INSERT INTO users(username,password,enabled) VALUES ('admin1','4dm1n',TRUE);
INSERT INTO users(username,password,enabled) VALUES ('irene','ire',TRUE);
INSERT INTO users(username,password,enabled) VALUES ('manolo','man',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (1,'admin1','admin');
INSERT INTO authorities(id,username,authority) VALUES (2,'irene','admin');
INSERT INTO authorities(id,username,authority) VALUES (3,'manolo','user');

INSERT INTO empleados(id,nombre,rol,username,clave) VALUES (1,'Gonzalo','AUXILIAR',null,'gon');
INSERT INTO empleados(id,nombre,rol,username,clave) VALUES (2,'Teresa','TECNICO',null,'ter');
INSERT INTO empleados(id,nombre,rol,username,clave) VALUES (3,'Irene','TITULAR','irene','ire');
INSERT INTO empleados(id,nombre,rol,username,clave) VALUES (4,'Manolo','ADJUNTO','manolo','man');
INSERT INTO empleados(id,nombre,rol,username,clave) VALUES (5,'Clara','TECNICO',null,'cla');
INSERT INTO empleados(id,nombre,rol,username,clave) VALUES (6,'Pablo','AUXILIAR',null,'pab');

INSERT INTO tipos VALUES (1, 'entrada');
INSERT INTO tipos VALUES (2, 'salida');

INSERT INTO articulos(id,denominacion,codigo_nacional,caducidad,existencias,lote,tenencia,minimo,precio_albaran,requiere_receta,pvp,imagen,observacion)
VALUES (1,'Fisiocrem crema 50 g', '356723', '2023-06-24', '7', 2, 4, 6, 8.95, FALSE, 15, null, 'Aplicar suavemente sobre la zona afectada'),
(2,'Nolotil 20 capsulas', '712891', '2024-02-02', '5', 1, 2, 3, 2.25, TRUE, 3.50, '/resources/images/nolotil.jpg', 'Los pacientes deben ser advertidos especialmente de que Nolotil es un medicamento de prescripcion.'),
(3, 'Enantyum 20 comprimidos', '765412', '2024-01-14', '0', 1, 2, 2, 4, TRUE, 6, null, 'laqsea'),
(4, 'Ibuprofeno CINFA 600 mg', '745594', '2023-07-16', '8', 3, 2, 4, 1.9, FALSE, 3, null, 'jajja'),
(5, 'Agiolax granulado 250 g', '960427', '2023-05-21', '2', 1, 1, 1, 11.90, TRUE, 20, null, 'jajajajjajjjajaja'),
(6, 'Aldoleo 50 mg', '703074', '2024-02-23', '11', 3, 6, 5, 4.09, FALSE, 5, null, 'merio');

INSERT INTO ventas(id,fecha,tipo_pago) VALUES (1,'2022-11-07','EFECTIVO');
INSERT INTO ventas(id,fecha,tipo_pago) VALUES (2,'2022-11-11','TARJETA');

INSERT INTO linea_venta(id,cantidad,precio,venta_id,articulo_id) VALUES (1,3,0.0,1,1);
INSERT INTO linea_venta(id,cantidad,precio,venta_id,articulo_id) VALUES (2,5,0.0,1,2);
INSERT INTO linea_venta(id,cantidad,precio,venta_id,articulo_id) VALUES (3,1,0.0,1,4);
INSERT INTO linea_venta(id,cantidad,precio,venta_id,articulo_id) VALUES (4,2,0.0,2,5);
INSERT INTO linea_venta(id,cantidad,precio,venta_id,articulo_id) VALUES (5,4,0.0,2,6);

INSERT INTO clientes(id,nombre,apellido,direccion,firma_electronica,telefono,dni,observacion) VALUES (1,'Domingo','Valera','Calle Amaya 17 1º A', 'domingovalera.odf', '610 900 575', '42162601J', 'Alergico a los insecticidas'),
(2,'Eugenia', 'Tejada','Travesia Natalia 790 9º A','eugeniatejada.odf','610 900 575', '49823348N', 'Diabetes y artritis'),
(3, 'Oliva', 'Andres','Plaza Angel 84 0º F','olivandres.odf','604 268 832', '12347907N', ''),
(4, 'Jairo', 'Frias','Carrer Anton 586 9º B','jairofrias.odf','686 996 378', '81455659D',''),
(5, 'Alfredo', 'Molero','Ronda Adrian 4 7º B','alfredomolero.odf','606 414 100', '50930745M','Tension alta')

