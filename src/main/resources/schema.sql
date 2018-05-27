DROP TABLE IF EXISTS clients;
create table clients (
    id integer UNSIGNED NOT NULL AUTO_INCREMENT,
    name varchar(30),
    street1 varchar(30),
    street2 varchar(30),
    city varchar(30),
    state_id integer,
    zip varchar(30),
    active tinyint,
    terms integer,
    hq tinyint,
    created_date DATETIME,
    modified_date DATETIME,
    created_user integer,
    last_sync_time DATETIME,
    CONSTRAINT PK_Client PRIMARY KEY (id)
);

DROP TABLE IF EXISTS contracts;
create table contracts (
    id integer UNSIGNED NOT NULL AUTO_INCREMENT,
    client_id integer,
    employee_id integer,
    period_id integer,
    active tinyint,
    title varchar(50),
    notes TEXT,
    terms integer,
    startdate DATETIME,
    enddate DATETIME,
    created_date DATETIME,
    modified_date DATETIME,
    modified_user_id integer,
    created_user_id integer,
    last_sync_time DATETIME,
    CONSTRAINT PK_Contract PRIMARY KEY(id)
);
DROP TABLE IF EXISTS employees;
CREATE TABLE employees (
  id int(11) NOT NULL AUTO_INCREMENT,
  firstname char(20) NOT NULL,
  lastname char(20) NOT NULL,
  mi char(2) DEFAULT NULL,
  nickname char(20) DEFAULT NULL,
  ssn varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  dob date DEFAULT NULL,
  enddate date DEFAULT NULL,
  startdate date NOT NULL DEFAULT '2000-01-01',
  street1 char(40) DEFAULT NULL,
  street2 char(40)  DEFAULT NULL,
  city char(20)  DEFAULT NULL,
  state_id int(11) DEFAULT '0',
  zip char(10)  DEFAULT NULL,
  bankaccountnumber varchar(255) DEFAULT NULL,
  bankaccounttype char(8)  DEFAULT NULL,
  bankname char(35)  DEFAULT NULL,
  bankroutingnumber varchar(255) DEFAULT NULL,
  directdeposit tinyint(1)  DEFAULT NULL,
  allowancefederal int(2) DEFAULT '0',
  allowancestate int(2) DEFAULT '0',
  extradeductionsfederal int(2) DEFAULT '0',
  extradeductionsstate int(2) DEFAULT '0',
  maritalstatusfed char(40)  DEFAULT NULL,
  maritalstatusstate char(40)  DEFAULT NULL,
  usworkstatus int(5) DEFAULT '0',
  notes text,
  tcard tinyint(1) DEFAULT '0',
  active int(11) DEFAULT 1,
  voided tinyint(1) NOT NULL DEFAULT '0',
  w4 tinyint(1) NOT NULL DEFAULT '0',
  de34 tinyint(1) NOT NULL DEFAULT '0',
  i9 tinyint(1) NOT NULL DEFAULT '0',
  medical tinyint(1) NOT NULL DEFAULT '0',
  indust tinyint(1) NOT NULL DEFAULT '0',
  info tinyint(1) NOT NULL DEFAULT '0',
  phone varchar(100) DEFAULT NULL,
  salesforce tinyint(1) NOT NULL DEFAULT '0',
  created_date date DEFAULT NULL,
  modified_date datetime DEFAULT NULL,
  created_user_id int(11) DEFAULT '0',
  modified_user_id int(11) DEFAULT '0',
  last_sync_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id));
DROP TABLE IF EXISTS states;
CREATE TABLE states (
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  post_ab char(2) NOT NULL,
  capital char(14) NOT NULL,
  date char(10) NOT NULL,
  flower char(27) NOT NULL,
  name char(14) NOT NULL,
  state_no char(9) NOT NULL,
  last_sync_time datetime DEFAULT NULL,
  modified_user_id int(11) DEFAULT NULL,
  created_user_id int(11) DEFAULT 0,
  created_date datetime DEFAULT NULL,
  modified_date datetime DEFAULT NULL,
  PRIMARY KEY (id)
);
DROP TABLE IF EXISTS clients_checks;
CREATE TABLE `clients_checks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `number` varchar(20) NOT NULL,
  `amount` float NOT NULL,
  `notes` varchar(100) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `created_user_id` int(11) DEFAULT NULL,
  `modified_user_id` int(11) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `last_sync_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);
DROP TABLE IF EXISTS clients_memos;
CREATE TABLE `clients_memos` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `notes` text,
  `client_id` int(11) unsigned DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `created_user_id` int(11) DEFAULT NULL,
  `modified_user_id` int(11) DEFAULT NULL,
  `last_sync_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
);
DROP TABLE IF EXISTS contracts_items;
CREATE TABLE `contracts_items` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `active` int(11) DEFAULT '1',
  `contract_id` int(11) NOT NULL DEFAULT '0',
  `description` varchar(60) NOT NULL,
  `amt` float NOT NULL DEFAULT '0',
  `cost` float NOT NULL DEFAULT '0',
  `notes` varchar(100) NOT NULL,
  `ordering` int(5) DEFAULT '0',
  `created_date` date DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `created_user_id` int(11) DEFAULT NULL,
  `modified_user_id` int(11) DEFAULT NULL,
  `last_sync_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);
DROP TABLE IF EXISTS employees_memos;
CREATE TABLE `employees_memos` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `notes` text,
  `employee_id` int(11) unsigned DEFAULT NULL,
  `created_user_id` int(11) NOT NULL,
  `modified_user_id` int(11) NOT NULL,
  `modified_date` datetime NOT NULL,
  `created_date` datetime NOT NULL,
  `last_sync_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
);
DROP TABLE IF EXISTS expenses;
CREATE TABLE `expenses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` float NOT NULL,
  `category_id` int(2) NOT NULL,
  `employee_id` int(11) NOT NULL,
  `report_id` int(11) NOT NULL,
  `cleared` tinyint(4) NOT NULL,
  `date` date NOT NULL,
  `description` char(45) NOT NULL,
  `notes` char(200) NOT NULL,
  `created_date` date NOT NULL,
  `modified_date` datetime NOT NULL,
  `last_sync_time` datetime NOT NULL,
  `created_user_id` int(11) NOT NULL,
  `modified_user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
);
DROP TABLE IF EXISTS expenses_categories;
CREATE TABLE `expenses_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(22) NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS invoices;
CREATE TABLE `invoices` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `contract_id` int(11) unsigned NOT NULL DEFAULT '0',
  `date` date NOT NULL DEFAULT '0000-00-00',
  `po` varchar(30) DEFAULT NULL,
  `employerexpenserate` float NOT NULL DEFAULT '0',
  `terms` int(10) unsigned NOT NULL DEFAULT '0',
  `timecard` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `notes` text,
  `period_start` date DEFAULT NULL,
  `period_end` date DEFAULT NULL,
  `posted` tinyint(1) NOT NULL DEFAULT '0',
  `cleared` tinyint(1) NOT NULL DEFAULT '0',
  `cleared_date` date DEFAULT NULL,
  `prcleared` tinyint(1) NOT NULL DEFAULT '0',
  `timecard_receipt_sent` tinyint(1) NOT NULL,
  `message` text NOT NULL,
  `amount` float NOT NULL,
  `voided` tinyint(1) NOT NULL DEFAULT '0',
  `created_date` date DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `last_sync_time` datetime DEFAULT NULL,
  `created_user_id` int(11) DEFAULT NULL,
  `modified_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`));
DROP TABLE IF EXISTS invoices_items;
CREATE TABLE `invoices_items` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `active` int(11) DEFAULT '1',
  `invoice_id` int(11) NOT NULL DEFAULT '0',
  `description` varchar(60) NOT NULL,
  `amount` float NOT NULL DEFAULT '0',
  `quantity` float NOT NULL DEFAULT '0',
  `cost` float NOT NULL DEFAULT '0',
  `cleared` tinyint(1) NOT NULL DEFAULT '0',
  `ordering` int(5) DEFAULT '0',
  `created_date` date DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `created_user_id` int(11) DEFAULT NULL,
  `modified_user_id` int(11) DEFAULT NULL,
  `last_sync_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);
