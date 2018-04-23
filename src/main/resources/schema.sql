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
