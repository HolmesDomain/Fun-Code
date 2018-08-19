INSERT INTO oceanjobs
VALUES (22,'Marketing consultant');
INSERT INTO oceanjobs
VALUES (21,'Designer');
INSERT INTO oceanjobs
VALUES (10,'Director');
INSERT INTO oceanjobs
VALUES (20,'Web developer');
INSERT INTO oceanjobs
VALUES (24,'Management');
INSERT INTO oceanjobs
VALUES (30,'PR');
INSERT INTO oceanjobs
VALUES (26,'HR');
INSERT INTO oceanjobs
VALUES (29,'Case worker');
INSERT INTO oceanjobs
VALUES (34,'Releases');
INSERT INTO oceanjobs
VALUES (31,'Event coordinator');
INSERT INTO oceanemployees
VALUES (1,'Erin','Carter','ecarter@aol.com','20-666-9019',date '2001-09-02','44 Wataba Ln','SC',22);
INSERT INTO oceanemployees
VALUES (2,'Kris','Carter','kcarter@aol.com','20-681-1101',date '2008-01-12','44 Wataba Ln','SC',20);
INSERT INTO oceanemployees
VALUES (3,'John','Portman','jp@oceans.com','90-444-8978',date '2010-01-04','Rock Ct','SC',21);
INSERT INTO oceanemployees
VALUES (4,'Natlie','Portman','np@oceans.com','90-444-0378',date '2007-01-09','Rock Ct','SC',24);
INSERT INTO oceanemployees
VALUES (5,'Chan','Acres','ca@oceans.com','90-112-4343',date '2015-01-30','HolyGrove St','FL',24);
INSERT INTO oceanemployees
VALUES (6,'Tim','Woods','tw@oceans.com','09-805-8831',date '2015-06-17','Whole St','SC',20);
INSERT INTO oceanemployees
VALUES (7,'Marcus','Pierre','mpierre@oceans.com','09-809-9090',date '2001-03-07','Reikers St','SC',10);
INSERT INTO oceanemployees
VALUES (8,'Rick','Owens','ro@oceans.com','91-805-8901',date '2009-02-10','Calve Ave','SC',21);
INSERT INTO oceanemployees
VALUES (9,'Yaya','West','yw@oceans.com','09-908-8080',date '2017-09-17','Wickey St','SC',22);
INSERT INTO oceanemployees
VALUES (10,'Tim','Lane','tl@oceans.com','08-815-9931',date '2014-09-24','park St','FC',21);
INSERT INTO oceaninvoice
VALUES (1,6000,'paid',null);
INSERT INTO oceaninvoice
VALUES (2,1000,'paid',null);
INSERT INTO oceaninvoice
VALUES (3,300,'unpaid',null);
INSERT INTO oceaninvoice
VALUES (4,8000,'paid',null);
INSERT INTO oceaninvoice
VALUES (5,4000,'paid',null);
INSERT INTO oceaninvoice
VALUES (6,6500,'unpaid',null);
INSERT INTO oceaninvoice
VALUES (7,10000,'unpaid',null);
INSERT INTO oceaninvoice
VALUES (8,2000,'paid',null);
INSERT INTO oceaninvoice
VALUES (9,800,'paid',null);
INSERT INTO oceaninvoice
VALUES (10,6900,'unpaid',null);
INSERT INTO oceanclients
VALUES (1,'Gatsby co.','Gats','info@gatz.com','08-999-0989','Owens',null,1);
INSERT INTO oceanclients
VALUES (2,'GMorales','GM','info@gm.com','08-920-0089','Thomas',null,2);
INSERT INTO oceanclients
VALUES (3,'Batty co.','Batty','info@batty.com','99-022-3203','Swann',null,3);
INSERT INTO oceanclients
VALUES (4,'Cars ltd.','Cars','info@cars.net','08-099-0032','Johnson',null,4);
INSERT INTO oceanclients
VALUES (5,'Kirby Wayne ltd.','Kirby','reach@kirbyltd.com','08-112-9090','Aines',null,5);
INSERT INTO oceanclients
VALUES (6,'Rich ltd.','Rich','info@rich.com','08-121-0909','Hanes',null,6);
INSERT INTO oceanclients
VALUES (7,'Heavenly Company','HC','welcome@hc.com','08-111-1191','Sun',null,7);
INSERT INTO oceanclients
VALUES (8,'Bean shop','Bean Shop','in@beanc.com','08-090-1919','Redd',null,8);
INSERT INTO oceanclients
VALUES (9,'Bee Company','BC','info@buzzc.com','08-109-1491','Richardson',null,9);
INSERT INTO oceanclients
VALUES (10,'Sonny Practition','Sonny Prac','info@Sprac.com','01-111-4646','Baker',null,10);
INSERT INTO oceanoffice
VALUES (1,'Charleston','SC',1);
INSERT INTO oceanoffice
VALUES (2,'Charleston','SC',2);
INSERT INTO oceanoffice
VALUES (3,'Charleston','SC',3);
INSERT INTO oceanoffice
VALUES (4,'Charleston','SC',5);
INSERT INTO oceanoffice
VALUES (5,'Tampa','FL',4);
INSERT INTO oceanoffice
VALUES (6,'Tampa','FL',6);
INSERT INTO oceanoffice
VALUES (7,'Tampa','FL',7);
INSERT INTO oceanoffice
VALUES (8,'Charleston','SC',8);
INSERT INTO oceanoffice
VALUES (9,'Charleston','SC',9);
INSERT INTO oceanoffice
VALUES (10,'Charleston','SC',10);
UPDATE oceaninvoice SET client_id = 1 WHERE invoice_id = 1;UPDATE oceaninvoice SET client_id = 2 WHERE invoice_id = 2;
UPDATE oceaninvoice SET client_id = 3 WHERE invoice_id = 3;UPDATE oceaninvoice SET client_id = 4 WHERE invoice_id = 4;
UPDATE oceaninvoice SET client_id = 5 WHERE invoice_id = 5;UPDATE oceaninvoice SET client_id = 6 WHERE invoice_id = 6;
UPDATE oceaninvoice SET client_id = 7 WHERE invoice_id = 7;UPDATE oceaninvoice SET client_id = 8 WHERE invoice_id = 8;
UPDATE oceaninvoice SET client_id = 9 WHERE invoice_id = 9;UPDATE oceaninvoice SET client_id = 10 WHERE invoice_id = 10;
UPDATE oceanclients SET office_id = 1 WHERE client_id = 1;UPDATE oceanclients SET office_id = 2 WHERE client_id = 2;
UPDATE oceanclients SET office_id = 3 WHERE client_id = 3;UPDATE oceanclients SET office_id = 4 WHERE client_id = 4;
UPDATE oceanclients SET office_id = 5 WHERE client_id = 5;UPDATE oceanclients SET office_id = 6 WHERE client_id = 6;
UPDATE oceanclients SET office_id = 7 WHERE client_id = 7;UPDATE oceanclients SET office_id = 8 WHERE client_id = 8;
UPDATE oceanclients SET office_id = 9 WHERE client_id = 9;UPDATE oceanclients SET office_id = 10 WHERE client_id = 10;