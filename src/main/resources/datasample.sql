INSERT INTO clients (
  id, name, street1, street2, city, state_id, zip,
  active, terms, hq, created_date, modified_date, created_user, last_sync_time
) VALUES
(1, 'BAL', '343 SECOND ST', 'SUITE 15', 'LOS ALTOS', 5,'94022',
  0, 30, 0, '2017-02-21 00:04:27', '2017-02-21 00:04:27', 5, '2017-02-21 00:04:27'),
(2, 'client2', 'Main St.', 'Suite 15', 'San Francisco', 5,'94105',
  0, 30, 0, '2017-02-21 00:04:27', '2017-02-21 00:04:27', 5, '2017-02-21 00:04:27');
INSERT into employees (
  id, firstname, lastname
) VALUES
(1, 'Al', 'Smith'),
(2, 'Bob', 'Jones');
INSERT INTO contracts (
  id, client_id, employee_id, period_id, active, title, notes,
  terms, startdate, enddate, created_date, modified_date,
  modified_user_id, created_user_id, last_sync_time
) VALUES
(1, 1, 1, 1, 1,'contract 1 client1 employee1','notes one',
  30, '2018-05-18','2012-09-06', '2016-10-01 05:14:19', '2016-10-01 05:14:19',
  1, 2, '2016-10-01 05:14:19'),
(2, 2, 2, 1, 1,'contract 2 client2 employee2','notes two',
  30, '2018-05-18','2012-09-06', '2016-10-01 05:14:19', '2016-10-01 05:14:19',
  1, 2, '2016-10-01 05:14:19');
INSERT into invoices (
  id, contract_id, amount, date, timecard_receipt_sent, message,
  created_user_id, modified_user_id
) VALUES
(1, 1, 2.3, '2018-02-05', 0, '', 1, 1),
(2, 2, 12.3, '2017-02-05', 0, '', 1, 1);

INSERT INTO states (post_ab, name, capital, date, flower, state_no, modified_user_id, created_user_id) VALUES ('CA', 'California', 'Sacramento', '1849', 'Poppy', '20th', 1, 1);
INSERT INTO states (post_ab, name, capital, date, flower, state_no, modified_user_id, created_user_id) VALUES ('AL', 'Alabama', 'Montgomery', '1900', 'Camella', '30th', 1, 1);
INSERT INTO clients_checks VALUES (19,62,'5378',160,'','2009-11-12 00:00:00','2013-02-10',5,5,'2016-10-01 05:14:14','2016-10-01 05:14:14');
INSERT INTO clients_memos VALUES (665,'2003-11-20','Inserted Into System',16,NULL,'2016-10-01 05:14:17',1,1,'2016-10-01 05:14:17');
INSERT INTO contracts_items VALUES (5,1,1479,'Regular',30,30,'Marc Condon',20,'2015-05-16','2016-10-01 05:14:24',5,2,'2016-10-01 05:14:24'),(22,0,1479,'Web Cam',55,55,'',80,'2015-05-16','2016-10-01 05:14:24',5,2,'2016-10-01 05:14:24');
INSERT INTO employees_memos VALUES (1126,'2002-05-03','7208979@skytel.com\r\rRichard Aronson\rSenior Software QA Engineer\r3dfx Interactive, Inc. \r4435 Fortran Drive\rSan Jose, CA 95134\r408.719.5946 phone\r888.720.8979 phone pager \r7208979@skytel.com <mailto:7208979@skytel.com> email message pager \rraronson@3dfx.c',37,0,0,'2016-10-01 05:15:12','2018-01-01 00:00:00','2016-10-01 05:15:12');
INSERT INTO expenses VALUES (1,16.23,1,1479,0,1,'2002-05-28','Promotional gift for Maya Hart of Tivo','','2016-07-10','2016-07-10 17:07:18','2016-07-10 17:25:18',5,5);
INSERT INTO expenses_categories VALUES (1,'Advertisement'),(2,'Auto Parking Toll'),(3,'Computer'),(4,'Dues and Subscriptions'),(5,'Office'),(6,'Telephone'),(7,'Postage'),(8,'Rent'),(9,'Travel Fares');
