
CREATE TABLE OceanEMPLOYEES 
   ("EMPLOYEE_ID" NUMBER CONSTRAINT "EMPLOYEE_ID_NN" NOT NULL ENABLE, 
	"FIRST_NAME" VARCHAR2(25 BYTE), 
	"LAST_NAME" VARCHAR2(25 BYTE), 
	"EMAIL" VARCHAR2(30 BYTE), 
	"PHONE_NUMBER" VARCHAR2(11 BYTE), 
	"HIRE_DATE" DATE, 
	"STREET" VARCHAR2(25 BYTE), 
	"CITY" VARCHAR2(25 BYTE), 
	"JOB_ID" NUMBER
   );
ALTER TABLE OceanEmployees
ADD ( CONSTRAINT employee_id_pk
       		 PRIMARY KEY (employee_id)
    ) ;
ALTER TABLE OceanEmployees
ADD ( CONSTRAINT jobemp_id_pk
       		  FOREIGN KEY (job_id)
          	  REFERENCES Oceanjobs(job_id) 
    );

CREATE TABLE OceanJobs
   (	"JOB_ID" NUMBER CONSTRAINT "JOB_ID_NN" NOT NULL ENABLE, 
	"JOB_TITLE" VARCHAR2(30 BYTE)
   ); 
ALTER TABLE OceanJobs
ADD ( CONSTRAINT job_id_pk
       		 PRIMARY KEY (job_id)
    ) ;

CREATE TABLE OceanINVOICE 
   ("INVOICE_ID" NUMBER CONSTRAINT "INVOICE_ID_NN" NOT NULL ENABLE, 
	"AMOUNT" NUMBER(*,0), 
	"STATUS" VARCHAR2(10 BYTE),
    Client_id number
   );
ALTER TABLE OceanInvoice
ADD ( CONSTRAINT invoice_id_pk
       		 PRIMARY KEY (invoice_id)
    ) ;
CREATE TABLE OceanCLIENTS 
(	"CLIENT_ID" NUMBER CONSTRAINT "CLIENT_ID_NN" NOT NULL ENABLE, 
	"OFFICIAL_NAME" VARCHAR2(30 BYTE), 
	"NAME" VARCHAR2(25 BYTE), 
	"EMAIL" VARCHAR2(30 BYTE), 
	"PHONE_NUMBER" VARCHAR2(11 BYTE), 
	"CONTACT_LASTNAME" VARCHAR2(25 BYTE),
    office_id number,
    invoice_id number
   );
ALTER TABLE Oceanclients
ADD ( CONSTRAINT client_id_pk
       		 PRIMARY KEY (client_id)
    );
ALTER TABLE OceanInvoice
ADD ( CONSTRAINT invoice_id_fk
       		  FOREIGN KEY (client_id)
          	  REFERENCES Oceanclients(client_id) 
    ); 
CREATE TABLE oceanOFFICE 
   (	"OFFICE_ID" NUMBER CONSTRAINT "OFFICE_ID_NN" NOT NULL ENABLE, 
	"CITY" VARCHAR2(20 BYTE), 
	"STATE" VARCHAR2(20 BYTE),
    client_id number
   );
ALTER TABLE Oceanoffice
ADD ( CONSTRAINT office_id_pk
       		 PRIMARY KEY (office_id)
    );
ALTER TABLE OceanClients
ADD ( CONSTRAINT invoice_id_fkk
       		  FOREIGN KEY (invoice_id)
          	  REFERENCES Oceaninvoice(invoice_id),
        CONSTRAINT office_id_fkk
       		  FOREIGN KEY (office_id)
          	  REFERENCES OceanOffice(office_id) 
    ); 