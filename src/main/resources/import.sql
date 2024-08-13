INSERT INTO country (codecountry, namecountry) VALUES ('US', 'United States');
INSERT INTO country (codecountry, namecountry) VALUES ('MX', 'Mexico');
INSERT INTO country (codecountry, namecountry) VALUES ('CA', 'Canada');
INSERT INTO country (codecountry, namecountry) VALUES ('BR', 'Brazil');
INSERT INTO country (codecountry, namecountry) VALUES ('AR', 'Argentina');


INSERT INTO region (codereg, namereg, codecountry) VALUES ('CA-BC', 'British Columbia', 'CA');
INSERT INTO region (codereg, namereg, codecountry) VALUES ('US-NY', 'New York', 'US');
INSERT INTO region (codereg, namereg, codecountry) VALUES ('MX-CMX', 'Ciudad de Mexico', 'MX');
INSERT INTO region (codereg, namereg, codecountry) VALUES ('BR-SP', 'São Paulo', 'BR');
INSERT INTO region (codereg, namereg, codecountry) VALUES ('AR-B', 'Buenos Aires', 'AR');


INSERT INTO city (codecity, namecity, codereg) VALUES ('NYC', 'New York City', 'US-NY');
INSERT INTO city (codecity, namecity, codereg) VALUES ('VAN', 'Vancouver', 'CA-BC');
INSERT INTO city (codecity, namecity, codereg) VALUES ('CDMX', 'Ciudad de México', 'MX-CMX');
INSERT INTO city (codecity, namecity, codereg) VALUES ('SP', 'São Paulo', 'BR-SP');
INSERT INTO city (codecity, namecity, codereg) VALUES ('BA', 'Buenos Aires', 'AR-B');


INSERT INTO farmacy (idfarmacy, namefarmacy, addressfarmacy, long, latfarmacy, codecityfarm, logofarmacy)
VALUES (1, 'Farmacia Central', '123 Main St', -73.935242, 40.730610, 'NYC', 'central_logo.png');

INSERT INTO farmacy (idfarmacy, namefarmacy, addressfarmacy, long, latfarmacy, codecityfarm, logofarmacy)
VALUES (2, 'Farmacia del Norte', '456 North St', -123.120738, 49.282729, 'VAN', 'norte_logo.png');

INSERT INTO farmacy (idfarmacy, namefarmacy, addressfarmacy, long, latfarmacy, codecityfarm, logofarmacy)
VALUES (3, 'Farmacia Reforma', '789 Reforma', -99.133209, 19.432608, 'CDMX', 'reforma_logo.png');

INSERT INTO farmacy (idfarmacy, namefarmacy, addressfarmacy, long, latfarmacy, codecityfarm, logofarmacy)
VALUES (4, 'Farmacia Paulista', '101 Avenida Paulista', -46.633309, -23.550520, 'SP', 'paulista_logo.png');

INSERT INTO farmacy (idfarmacy, namefarmacy, addressfarmacy, long, latfarmacy, codecityfarm, logofarmacy)
VALUES (5, 'Farmacia Libertad', '202 Libertad', -58.381559, -34.603684, 'BA', 'libertad_logo.png');
