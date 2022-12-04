-- One admin user, named admin1 with passwor 4dm1n and authority admin
INSERT INTO users(username,password,enabled) VALUES ('admin1','4dm1n',TRUE);
INSERT INTO users(username,password,enabled) VALUES ('gonzalo','gon',TRUE);
INSERT INTO users(username,password,enabled) VALUES ('teresa','ter',TRUE);
INSERT INTO users(username,password,enabled) VALUES ('irene','ire',TRUE);
INSERT INTO users(username,password,enabled) VALUES ('manolo','man',TRUE);
INSERT INTO users(username,password,enabled) VALUES ('clara','cla',TRUE);
INSERT INTO users(username,password,enabled) VALUES ('pablo','pab',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (1,'admin1','admin');
INSERT INTO authorities(id,username,authority) VALUES (2,'gonzalo','user');
INSERT INTO authorities(id,username,authority) VALUES (3,'teresa','user');
INSERT INTO authorities(id,username,authority) VALUES (4,'irene','user');
INSERT INTO authorities(id,username,authority) VALUES (5,'manolo','user');
INSERT INTO authorities(id,username,authority) VALUES (6,'clara','user');
INSERT INTO authorities(id,username,authority) VALUES (7,'pablo','user');

INSERT INTO empleados(id,nombre,rol,num_vendedor,username) VALUES (1,'Gonzalo','AUXILIAR',1,'gonzalo');
INSERT INTO empleados(id,nombre,rol,num_vendedor,username) VALUES (2,'Teresa','TECNICO',2,'teresa');
INSERT INTO empleados(id,nombre,rol,num_vendedor,username) VALUES (3,'Irene','TITULAR',3,'irene');
INSERT INTO empleados(id,nombre,rol,num_vendedor,username) VALUES (4,'Manolo','ADJUNTO',4,'manolo');
INSERT INTO empleados(id,nombre,rol,num_vendedor,username) VALUES (5,'Clara','TECNICO',5,'clara');
INSERT INTO empleados(id,nombre,rol,num_vendedor,username) VALUES (6,'Pablo','AUXILIAR',6,'pablo');

-- INSERT INTO control_horario(id,horario_ficha_anterior,hora,tipo,empleado_id) VALUES (1,"8:30")
