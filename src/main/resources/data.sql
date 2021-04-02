DROP TABLE IF EXISTS ITEMS;

CREATE TABLE ITEMS (
id INT AUTO_INCREMENT PRIMARY KEY,
ITEM_NAME VARCHAR(250) NOT NULL,
ITEM_IMAGE VARCHAR(250) DEFAULT NULL,
ITEM_DESCRIPTION VARCHAR(4000) DEFAULT NULL
);

INSERT INTO ITEMS (ITEM_NAME, ITEM_IMAGE, ITEM_DESCRIPTION) VALUES
('React Quickly','images/reactQuickly.png', 'The best book to quickly get started with React'),
('Wally','images/wallyClock.png','A unique wall clock which speaks.'),
('Dhanno', 'images/dhannp.png', 'A Maruti 800 car.'),
('My Playstation 4','images/najeebsps4.png','My old Playstation 4.');
