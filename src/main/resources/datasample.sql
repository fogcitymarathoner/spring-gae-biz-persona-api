insert into clients (name, street1, city, zip, created_user, state_id, terms) values ('client1', 'Main St.', 'San Francisco', '94105', 1, 1, 30);
insert into contracts (client_id, employee_id, period_id, active, title, notes, terms, startdate, enddate, created_date, modified_date, modified_user_id, created_user_id, last_sync_time) values (1, 1, 1, 1, 'title', 'notes', 30, '2018-04-22',  '2018-04-22',  '2018-04-22',  '2018-04-22', 1, 1,  '2018-04-22');
insert into employees (id, firstname, lastname) values (1, 'al', 'smith');
INSERT INTO states VALUES ('AL','Montgomery','14-12-1819','Camellia','Alabama','22nd',1,'2017-02-05 18:48:59',1,1,NULL,'2017-02-05 18:48:59');
insert into invoices (id, contract_id, amount, date, timecard_receipt_sent, message, created_user_id, modified_user_id) values (1, 1, 2.3,'2017-02-05', 0, '', 1, 1);


