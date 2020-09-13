CREATE TABLE `release` (
    `id` number(10, 0),
    `name` varchar2(255 char),
    `code_freeze_date` date,
    `release_date` date,
    CONSTRAINT pk_release PRIMARY KEY (`id`)
);