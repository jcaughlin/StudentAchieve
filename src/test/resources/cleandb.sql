Delete From user;
DELETE from user_roles;
INSERT INTO `user`(`id`,`first_name`, `last_name`, `birthday`, `email`, `last_updated`, `user_name`, `user_pass`)
VALUES
(1,'Paul','Manafort','1949-04-01','paul@trump.com','2018-02-19','paul','password1'),
(2,'George','Papadopoulos','1978-08-01','george@trump.com','2018-04-28','george','password2'),
(3,'Carter','Page','1971-06-03','carter@trump.com','2018-02-19','carter','password3'),
(4,'Roger','Stone','1952-08-27','roger@trump.com','2018-04-28','roger','password4'),
(5,'Michael','Flynn','2018-02-19','mflynn@trump.com','2018-02-19','mflynn','password5'),
(6,'Michael','Cohen','2018-04-25','mcohen@trump.com','2018-04-28','mcohen','password6'),
(7,'Felix','Sater','1966-03-02','felix@trump','2018-04-28','fsater','password7'),
(8,'Anthony','Scaramucci','1964-01-06','themooch@trump.com','2018-04-28','themooch','password8');



