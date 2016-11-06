INSERT INTO PROVIDER(ID, NAME, ENDPOINT) VALUES(1, 'Accor', 'http://localhost:8081/api');
INSERT INTO ASSET_TYPE(ID, PROVIDER_ID, TITLE, DESCRIPTION, UNIT_NAME, CATEGORY, IMAGE_URL, CONVERSION_RATE)
    VALUES(1, 1, 'Accor', 'Every day, AccorHotels Group welcomes the world in its 3700 hotels located in 94 countries.',
    'points', 'Accomodation', '/img/loyalty/Accor.png', '5');

INSERT INTO PROVIDER(ID, NAME, ENDPOINT) VALUES(2, 'Hilton', 'http://localhost:8082/api');
INSERT INTO ASSET_TYPE(ID, PROVIDER_ID, TITLE, DESCRIPTION, UNIT_NAME, CATEGORY, IMAGE_URL, CONVERSION_RATE)
    VALUES(2, 2, 'Hilton', 'Hilton',
    'points', 'Accomodation', '/img/loyalty/hilton3.jpg', '8');

INSERT INTO PROVIDER(ID, NAME, ENDPOINT) VALUES(3, 'Flying Blue', 'http://localhost:8083/api');
INSERT INTO ASSET_TYPE(ID, PROVIDER_ID, TITLE, DESCRIPTION, UNIT_NAME, CATEGORY, IMAGE_URL, CONVERSION_RATE)
    VALUES(3, 3, 'Flying Blue Silver', 'Flying Blue Silver',
    'points', 'Transportation', '/img/loyalty/fbsil.jpeg', '3');
INSERT INTO ASSET_TYPE(ID, PROVIDER_ID, TITLE, DESCRIPTION, UNIT_NAME, CATEGORY, IMAGE_URL, CONVERSION_RATE)
    VALUES(4, 3, 'Flying Blue Platinum', 'Flying Blue Platinum',
    'points', 'Transportation', '/img/loyalty/fbplat.png', '4');


INSERT INTO USER(ID, NAME, EMAIL) VALUES(1, 'Jamil Benabdallah', 'jamil@travelcoin.com');
INSERT INTO USER(ID, NAME, EMAIL) VALUES(2, 'Costin Aldea', 'costin@travelcoin.com');
INSERT INTO USER(ID, NAME, EMAIL) VALUES(3, 'Stefan Polisevschi', 'stefan@travelcoin.com');

INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(1, 1, 1, 120);
INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(2, 2, 1, 450);

INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(3, 1, 2, 20);
INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(4, 2, 2, 50);

INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(5, 1, 3, 300);
INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(6, 2, 3, 450);
INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(7, 3, 3, 800);
INSERT INTO ASSET(ID, ASSET_TYPE_ID, USER_ID, AMOUNT) VALUES(8, 4, 3, 1200);

INSERT INTO PRODUCT(ID, TITLE, DESCRIPTION, PRICE, IMAGE_URL, MAP_URL)
    VALUES(1, 'NAVIGATE PARIS', 'While there are a million guidebooks and blogs out there, nothing really beats having a human point of contact when arriving in a new place. I’ll help you understand the layout of paris, how to get around, tips for using the metro, buyin…', 200, 'http://shtourism.eu/v2v/wp-content/uploads/2016/08/Paris3.jpg', 'http://1.bp.blogspot.com/_tUsg4205_xs/S5ICiKzsyLI/AAAAAAAABHA/8bgYrJtNpyQ/s400/map-google.gif');

INSERT INTO PRODUCT(ID, TITLE, DESCRIPTION, PRICE, IMAGE_URL, MAP_URL)
    VALUES(2, 'PARIS, 1100 - 1500 AD', 'Discover the hidden medieval Paris! Traces of what Paris used to look like during the Middle Ages have mostly been converted up through the centuries, but if you know where to look, you’ll find many hidden treasures. From fragments of ol…', 70, 'http://shtourism.eu/v2v/wp-content/uploads/2016/08/Paris_AD3.jpg', 'http://www.dei.ca/graphics/google_map_queensave.PNG');

INSERT INTO PRODUCT(ID, TITLE, DESCRIPTION, PRICE, IMAGE_URL, MAP_URL)
    VALUES(3, 'DEEPER INTO PARIS', 'How about seeing aspects of Paris you probably wouldn’t otherwise experience? Grasping how this city is an amazingly packed puzzle of cultures and history. Deeper into Paris is an exploration of the City of Lights in the directions th…', 70, 'http://shtourism.eu/v2v/wp-content/uploads/2016/08/ParisStreet3.jpg', 'http://www.mole24.it/wp-content/uploads/2015/08/maps.jpg');

INSERT INTO PRODUCT(ID, TITLE, DESCRIPTION, PRICE, IMAGE_URL, MAP_URL)
    VALUES(4, 'Le Louvre', 'With its rich display of culture and stellar collections, the Louvre may be the world&#39;s greatest art museum. The former fortress began its career as a public museum in 1793 with 2,500 paintings and now houses some….', 100, '/img/loyalty/louvre.jpg', 'http://www.mole24.it/wp-content/uploads/2015/08/maps.jpg');
