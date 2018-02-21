CREATE TYPE ProviderStatus AS ENUM ('active','inactive');
CREATE TYPE PaymentStatus AS ENUM ('active','inactive','deferred','cancelled');

CREATE TABLE card_details(id Varchar(255) Primary Key,
card_number Varchar(255) NOT NULL, name_on_card Varchar(255) NOT NULL,
exp_date Varchar(255) NOT NULL, user_id Varchar(255));


CREATE TABLE business_config(id Varchar(255) Primary Key , busniess_id Varchar(255), busniess_status Varchar(255),max_amount Varchar(255),min_amount Varchar(255),provider_config_id Varchar(255));


CREATE TABLE provider_config(id Varchar(255) Primary Key,
provider_callback_url Varchar(255), provider_credential_key1 Varchar(255),provider_credential_key2 Varchar(255),provider_name Varchar(255),provider_status Varchar(255),provider_url Varchar(255));


CREATE TABLE transaction(id Varchar(255) Primary Key,
amount float8, customer_id Varchar(255),payment_method Varchar(255),
payment_status Varchar(255),provider_id Varchar(255),super_pnr Varchar(255));
