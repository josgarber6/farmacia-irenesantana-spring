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

-- INSERT INTO control_horario(id,horario_ficha_anterior,hora,tipo,empleado_id) VALUES (1,"8:30")
