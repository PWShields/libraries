-- noinspection SqlNoDataSourceInspectionForFile

create table if not exists LIBRARIES
(
    id LONG AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR not null,
    nuc  VARCHAR not null
);
INSERT INTO LIBRARIES (name, nuc) VALUES
('National Library', 'ANL'),
('ANU Library', 'ANU'),
('Art and Music Library, Australian National University', 'AIA'),
('State Library of NSW', 'NSL');
