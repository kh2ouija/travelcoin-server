INSERT INTO PROVIDER(ID, NAME, ENDPOINT) VALUES(1, 'Accor', 'http://localhost:8081/api');
INSERT INTO ASSET_TYPE(ID, PROVIDER_ID, TITLE, UNIT_NAME, CONVERSION_RATE)
    VALUES(1, 1, 'Accor Points', 'points', '5');

INSERT INTO PROVIDER(ID, NAME, ENDPOINT) VALUES(2, 'KLM', 'http://localhost:8082/api');
INSERT INTO ASSET_TYPE(ID, PROVIDER_ID, TITLE, UNIT_NAME, CONVERSION_RATE)
    VALUES(2, 2, 'KLM Miles', 'miles', '8');

INSERT INTO USER(ID, NAME, EMAIL) VALUES(1, 'Jamil Benabdallah', 'jamil@travelcoin.com');
INSERT INTO USER(ID, NAME, EMAIL) VALUES(2, 'Costin Aldea', 'costin@travelcoin.com');
INSERT INTO USER(ID, NAME, EMAIL) VALUES(3, 'Stefan Polisevschi', 'stefan@travelcoin.com');

INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(1, 1, 1, 120);
INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(2, 2, 1, 450);

INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(3, 1, 2, 20);
INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(4, 2, 2, 50);

INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(5, 1, 3, 300);
INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(6, 2, 3, 1800);

INSERT INTO PRODUCT(ID, TITLE, DESCRIPTION, PRICE, IMAGE_URL)
    VALUES(1, 'NAVIGATE PARIS', 'While there are a million guidebooks and blogs out there, nothing really beats having a human point of contact when arriving in a new place. I’ll help you understand the layout of paris, how to get around, tips for using the metro, buyin…', 200, 'http://shtourism.eu/v2v/wp-content/uploads/2016/08/Paris3.jpg');

INSERT INTO PRODUCT(ID, TITLE, DESCRIPTION, PRICE, IMAGE_URL)
    VALUES(2, 'PARIS, 1100 - 1500 AD', 'Discover the hidden medieval Paris! Traces of what Paris used to look like during the Middle Ages have mostly been converted up through the centuries, but if you know where to look, you’ll find many hidden treasures. From fragments of ol…', 70, 'http://shtourism.eu/v2v/wp-content/uploads/2016/08/Paris_AD3.jpg');

INSERT INTO PRODUCT(ID, TITLE, DESCRIPTION, PRICE, IMAGE_URL)
    VALUES(3, 'DEEPER INTO PARIS', 'How about seeing aspects of Paris you probably wouldn’t otherwise experience? Grasping how this city is an amazingly packed puzzle of cultures and history. Deeper into Paris is an exploration of the City of Lights in the directions th…', 70, 'http://shtourism.eu/v2v/wp-content/uploads/2016/08/ParisStreet3.jpg');