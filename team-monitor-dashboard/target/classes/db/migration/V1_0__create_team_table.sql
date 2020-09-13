CREATE TABLE `team` (
    `id` number(10, 0),
    `name` varchar2(255 char),
    `number` number(10, 0),
    `logo` blob,
    CONSTRAINT pk_team PRIMARY KEY (`id`)
);