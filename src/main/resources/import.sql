INSERT INTO users (id, fullname, username, gender, email, password, phone, cellphone, profile_picture, role) VALUES ('1', 'ines Sara Reyes', 'SweetyInes', 'F', 'ines@correo.com', 'password', '7226628263', '7282856329', 'fotito', '1');
INSERT INTO users (id, fullname, username, gender, email, password, phone, cellphone, profile_picture, role) VALUES ('2', 'Iris Lazcano Ortiz', 'CandyIris', 'F', 'iris@correo.com', 'password', '7226628263', '7282856329', 'fotito', '2');

INSERT INTO teams (id, name, team_image, team_color, leader_id) VALUES ('1', 'Calabaza', 'fotito', '#000000', '1');

INSERT INTO tasks (id, title, description, is_bloqued, status, due_date, created_at, updated_at, finished_at, team_id) VALUES ('1', 'Refactor CRUD  Alumnos', 'Por Favor refactorizar el codigo del CRUD', '1', '1', '2022-11-12', '2022-11-07', '2022-11-07', '2022-11-13', '1');

INSERT INTO comments (id, title, content, created_at, task_id, user_id) VALUES ('1', 'Asco de codigo', 'Es muy feo el codigo y no puedo entender nada parece que lo programaron con las patas no puedo entender para nada el codigo del compañero Gustavo', '2022-11-07', '1', '2');

INSERT INTO users_teams (user_id, team_id) VALUES ('2', '1');
INSERT INTO users_teams (user_id, team_id) VALUES ('1', '1');

INSERT INTO users_tasks (user_id, task_id) VALUES ('2', '1');



