-- One admin user, named admin1 with passwor 4dm1n and authority admin
INSERT INTO users(username,password,enabled) VALUES ('admin1','4dm1n',TRUE);
INSERT INTO users(username,password,enabled) VALUES ('gonzalo','gon',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (1,'admin1','admin');
INSERT INTO authorities(id,username,authority) VALUES (2,'gonzalo','user');

INSERT INTO empleados(id,nombre,rol,num_vendedor,username) VALUES (1,'Gonzalo','AUXILIAR',2,'gonzalo');
