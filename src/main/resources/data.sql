insert into smer(id,ime,opis) values(101,'Informacioni sistemi','Smer fakulteta za informacione tehnologije');
insert into smer(id,ime,opis) values(102,'Digitalna produkcija','Smer fakulteta za informacione tehnologije');

insert into predmet(id,ime,opis,smer_id) values(201,'Baze Podataka','baze',101);
insert into predmet(id,ime,opis,smer_id) values(202,'Testiranje softvera','test',101);
insert into predmet(id,ime,opis,smer_id) values(203,'Mobilne aplikacije','mobilne',102);
insert into predmet(id,ime,opis,smer_id) values(204,'Informacioni sistemi','informacioni',102);

insert into posao(id,naziv,sati) values(1,'Rudar','50');
insert into posao(id,naziv,sati) values(2,'Konobar','150');
insert into posao(id,naziv,sati) values(3,'Toalet cistac','250');


insert into zaposlen(id,ime,prezime,posao_id) values(1,'Aleksandar','Trajkovic',1);
insert into zaposlen(id,ime,prezime,posao_id) values(2,'Filip','Ilic',1);
insert into zaposlen(id,ime,prezime,posao_id) values(3,'Tamara','Ambo',2);
insert into zaposlen(id,ime,prezime,posao_id) values(4,'Dejan','Veselinovic',2);
insert into zaposlen(id,ime,prezime,posao_id) values(5,'Nikola','Perac',3);